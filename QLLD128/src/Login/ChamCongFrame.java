package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Control.ChamCongCtrl;
import Control.CongtrinhCtrl;
import Entity.ChamCong;
import Entity.CongTrinh;
import Entity.Nhanvien;

import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;
import javax.swing.ImageIcon;

public class ChamCongFrame extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel tblDSCTmd;
	private JTable table;
	private JScrollPane scroll;
	private String[] ds;
	private void Huy() {
//      curEmp = null;
  	this.dispose();
}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChamCongFrame frame = new ChamCongFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public ChamCongFrame() throws SQLException {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 474, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(10, 44, 189, 20);
		contentPane.add(dateChooser);
		
		JComboBox comboBox = new JComboBox(loadDSCT());
		comboBox.setBounds(10, 13, 189, 20);
		contentPane.add(comboBox);
		String n = ds[comboBox.getSelectedIndex()];
		
		
		scroll = new JScrollPane();
		scroll.setBounds(10, 87, 438, 186);
		contentPane.add(scroll);
		table = new JTable();
		scroll.setViewportView(table);
		
		JButton btnNewButton = new JButton("Hiển thị danh sách");
		btnNewButton.setIcon(new ImageIcon(ChamCongFrame.class.getResource("/images/table.png")));
		btnNewButton.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					String date = sdf.format(dateChooser.getDate());
					loadDSNVChualam(ds[comboBox.getSelectedIndex()],date);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(246, 12, 163, 23);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Chấm Công");
		btnNewButton_1.setIcon(new ImageIcon(ChamCongFrame.class.getResource("/images/btn_add.png")));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					ChamCongNV(ds[comboBox.getSelectedIndex()],sdf.format(dateChooser.getDate()));
					loadDSNVChualam(ds[comboBox.getSelectedIndex()],sdf.format(dateChooser.getDate()));
				} catch (HeadlessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(246, 44, 163, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		
	}
	
	protected boolean ChamCongNV(String valueAt, String string, String text) {
		// TODO Auto-generated method stub
		return false;
	}

	public void loadDSNVChualam(String maCT,String ngaylap) throws SQLException {
		ChamCongCtrl a = new ChamCongCtrl();
		List<Nhanvien> temp = a.getDSNV(maCT,ngaylap);
		System.out.println("Load NV thanh cong");
		String arr[] = { "Mã Nhân Viên", "Tên Nhân Viên"};
		tblDSCTmd = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			tblDSCTmd.addRow(new Object[] { temp.get(i).getMaNV(),temp.get(i).getTenNV() });
		}
		table.setModel(tblDSCTmd);

	}
	
	public String[] loadDSCT() throws SQLException {
		CongtrinhCtrl a = new CongtrinhCtrl();
		List<CongTrinh> temp = a.getDSCTView();
		String[] array = new String[temp.size()];
		ds = new String[temp.size()];
		for (int i = 0; i < temp.size(); i++) {
			ds[i] = temp.get(i).getMaCT();
		}
		for (int i = 0; i < temp.size(); i++) {
			array[i] = temp.get(i).getTenCT();
		}
		return array;
	}
	public void ChamCongNV(String n,String ngaycham) throws HeadlessException, SQLException {
		ChamCongCtrl a = new ChamCongCtrl();
		ChamCong temp = new ChamCong();
		int index = table.getSelectedRow();
		temp.setMaNV((String)table.getValueAt(index,0));
		temp.setMaCT(n);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			temp.setNgaycham(df.parse(ngaycham));

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(temp.getMaCT());
		
		if (a.ChamCongNV(temp)== true) {
				JOptionPane.showMessageDialog(contentPane, "Chấm Công thành công");
			}
		else 	JOptionPane.showMessageDialog(contentPane, "Chấm Công thất bại","Inane error",JOptionPane.ERROR_MESSAGE);
	}
}
