/*
 * LoginFrame.java
 *
 */
package Login;

import javax.swing.JOptionPane;

import Control.AccountCtrl;
import Entity.Account;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.SQLException;

import javax.swing.ImageIcon;


public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
   
        initComponents();
        centerWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfUserID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN");

        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đăng nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        pnlLogin.setPreferredSize(new java.awt.Dimension(300, 200));

        jLabel2.setText("Tên đăng nhập");

        jLabel3.setText("Mật khẩu");

        btnClose.setText("Thoát");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key.png"))); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnLoginActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnClose))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(pnlLogin, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn muốn đóng ứng dụng này ?", "Xác nhận đóng", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
            System.exit(1);
        }
    }//GEN-LAST:event_btnCloseActionPerformed
    private void login1() throws SQLException {
    	if (tfUserID.getText().compareTo("") == 0 || new String(tfPassword.getPassword()).compareTo("") == 0) {
			JOptionPane.showMessageDialog(null,"Tai Khoan Khong Duoc De Trong");
		}else {
			try {
				login();
			} catch (java.lang.NullPointerException e) {
				JOptionPane.showMessageDialog(null,"Không Tìm Thấy Tên Đăng Nhập");
			
			}
		}
    }
 //////////////////////////////////////////// thay đổi ở đây 
    private void login() throws SQLException {
        AccountCtrl a = new AccountCtrl();
        Account temp1  = a.getAccount(tfUserID.getText());
//    System.out.println(temp1);
        Account temp2  = new Account();
        temp2.setTaikhoan(tfUserID.getText());
        temp2.setMatkhau(new String(tfPassword.getPassword()));
 //       System.out.println(temp2);
		if (a.CheckAccount(temp1, temp2)== true) {
			MainFrame frmMain = new MainFrame();
			frmMain.setVisible(true);
			if (temp1.getChucvu().compareTo("Truong Phong Ban") == 0) {
				frmMain.TruongPhongBan();
			}else if (temp1.getChucvu().compareTo("Nhan Vien QLDA") == 0) {
				frmMain.NhanVienQLDA();
			}else {
				frmMain.Admin();
			}
			System.out.println(temp1);
			tfPassword.setText("");
			tfUserID.setText("");
			this.setVisible(false);
		}
		else {
			JOptionPane.showMessageDialog(null,"Sai Tên Đăng Nhập Hoặc Mật Khẩu");
		}
    }
    

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_btnLoginActionPerformed
        login1();
    }

    private void centerWindow() {
        // kich thuoc frame
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        setBounds((width-400) / 2, (height-320) / 2, 400, 320);
        
        setIconImage((new ImageIcon("wire_transfer.png")).getImage());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserID;
    // End of variables declaration//GEN-END:variables
}
