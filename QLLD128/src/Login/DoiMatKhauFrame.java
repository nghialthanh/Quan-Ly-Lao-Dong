package Login;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;

import Control.AccountCtrl;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DoiMatKhauFrame extends javax.swing.JFrame {
	private JTextField txtMKmoi1;
	private JTextField txtMKmoi2;
	private void Huy() {
//        curEmp = null;
    	this.dispose();
	}
	public DoiMatKhauFrame() {
		
	}
	public DoiMatKhauFrame(String ma) {
		setResizable(false);
		getContentPane().setLayout(null);
		setSize(380,190);
		setLocationRelativeTo(null);
		
		JLabel lblMtKhuMi = new JLabel("Mật khẩu mới");
		lblMtKhuMi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMtKhuMi.setBounds(42, 38, 80, 14);
		getContentPane().add(lblMtKhuMi);
		
		txtMKmoi1 = new JTextField();
		txtMKmoi1.setBounds(174, 35, 150, 20);
		getContentPane().add(txtMKmoi1);
		txtMKmoi1.setColumns(10);
		
		JLabel lblNhpLiMt = new JLabel("Nhập lại mật khẩu nới");
		lblNhpLiMt.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNhpLiMt.setBounds(42, 68, 150, 14);
		getContentPane().add(lblNhpLiMt);
		
		txtMKmoi2 = new JTextField();
		txtMKmoi2.setBounds(174, 66, 150, 20);
		getContentPane().add(txtMKmoi2);
		txtMKmoi2.setColumns(10);
		
		JButton btnXacNhan = new JButton("Xác nhận");
		btnXacNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (txtMKmoi1.getText().compareTo(txtMKmoi2.getText())==0) {
						Doimk(ma,txtMKmoi2.getText());
						txtMKmoi1.setText("");
						txtMKmoi2.setText("");
					}
					else 
						JOptionPane.showMessageDialog(null, "Mật khẩu nhập lại không trùng khớp ");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXacNhan.setBounds(60, 115, 89, 23);
		getContentPane().add(btnXacNhan);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Huy();
	            
			}
		});
		btnHuy.setBounds(201, 115, 89, 23);
		getContentPane().add(btnHuy);
		
	}	
	public void Doimk(String ten,String mk) throws  SQLException {
		AccountCtrl a = new AccountCtrl();
		if (a.upAccount(ten, mk) == true) {
			JOptionPane.showMessageDialog(null, "Đổi Mật Khẩu Thành Công");
		} else {
			JOptionPane.showMessageDialog(null, "Đổi Mật Khẩu Không Thành Công");
		}
	}
}
