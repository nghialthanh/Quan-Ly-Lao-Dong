package Login;

import Login.Main;
import SQLConnect.ConnectSQL;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;

import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Control.AccountCtrl;
import Control.ChamCongCtrl;
import Control.CongViecCtrl;
import Control.CongtrinhCtrl;
import Control.DieuDongCtrl;
import Control.DuAnCtrl;
import Control.NhanVienCtrl;
import Control.PhongBanCtrl;
import Entity.Account;
import Entity.ChamCong;
import Entity.CongTrinh;
import Entity.CongViec;
import Entity.DuAn;
import Entity.Nhanvien;
import Entity.PhongBan;
import Entity.ThongKe;
import Entity.DieuDong;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class MainFrame extends javax.swing.JFrame {

//   private Employee curEmp = null;

	public MainFrame(/* Employee curEmp */) throws SQLException {
		setResizable(false);
		getContentPane().setEnabled(false);
//        this.curEmp = curEm
		initComponents();

		setFrameStyle();

//        if (curEmp.isSystemAdmin()) {
		setAdminLayout();
//       } Nếu người dùng là Admin
//        else {
//            setUserLayout();
//        }Người dùng bình thường

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() throws SQLException {
		String[] dsTT = new String[]{"Cần Thơ","Hồ Chí Minh","Hà Nội","Hải Phòng", "Đà Nẵng","Phú Yên",
				"Yên Bái", "Vĩnh Phúc", "Vĩnh Long", "Tuyên Quang","Trà Vinh", "Tiền Giang",
				"Thừa Thiên Huế","Thanh Hóa", "Thái Nguyên","Thái Bình", "Tây Ninh","Sơn La", 
				"Sóc Trăng","Quảng Trị", "Quảng Ninh","Quảng Ngãi", "Quảng Nam" , "Quảng Bình",
				"Phú Thọ","Ninh Thuận","Ninh Bình","Nghệ An", "Nam Định","Long An","Lào Cai",
				"Lạng Sơn","Lâm Đồng","Lai Châu", "Kon Tum", "Kiên Giang", "Khánh Hòa","Hưng Yên", 
				"Hòa Bình","Hậu Giang","Hải Dương","Hà Tĩnh","Hà Nam", "Hà Giang","Gia Lai", "Đồng Tháp", 
				"Đồng Nai","Điện Biên","Đắk Nông","Đắk Lắk","Cao Bằng","Cà Mau","Bình Thuận",
				"Bình Phước","Bình Dương","Bình Định","Bến Tre","Bắc Ninh","Bạc Liêu","Bắc Kạn", 
				"Bắc Giang","An Giang","Bà Rịa,Vũng Tàu"};
		scrlPaneLeftUser = new javax.swing.JScrollPane();
		btnEmpMyProfile = new javax.swing.JButton();
		btnLogout1 = new javax.swing.JButton();
		btnEmpTransferManage = new javax.swing.JButton();
		btnRequestTransfer = new javax.swing.JButton();
		btnHomeEmp = new javax.swing.JButton();
		btnDepartmentList = new javax.swing.JButton();
		btnProjectList = new javax.swing.JButton();
		btnLocationList = new javax.swing.JButton();
		spltPane = new javax.swing.JPanel();
		pnlHome = new javax.swing.JPanel();
		pnlHome.setBounds(0, 0, 929, 569);
		menuBarMain = new javax.swing.JMenuBar();
		mnUser = new javax.swing.JMenu();
		mnuiLogout = new javax.swing.JMenuItem();
		mnuiExit = new javax.swing.JMenuItem();

		scrlPaneLeftUser.setMaximumSize(null);
		scrlPaneLeftUser.setMinimumSize(null);
		scrlPaneLeftUser.setPreferredSize(new java.awt.Dimension(225, 235));


		btnLogout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
		btnLogout1.setText("Logout");
		btnLogout1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
		btnLogout1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLogout1ActionPerformed(evt);
			}
		});

		

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Employee Transfer Management");
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}
		});

		
		spltPane.setEnabled(false);
		spltPane.setMaximumSize(null);
		spltPane.setPreferredSize(new java.awt.Dimension(1024, 543));
		spltPane.setLayout(null);

		



		pnlHome.setMaximumSize(null);
		pnlHome.setPreferredSize(new java.awt.Dimension(50, 50));

		spltPane.add(pnlHome);
		pnlHome.setLayout(new CardLayout(0, 0));

		JPanel pCover = new JPanel();
		pnlHome.add(pCover, "name_269484714075400");
		
		
		pThongKe = new JPanel();
		pThongKe.setBackground(Color.LIGHT_GRAY);
		pThongKe.setLayout(null);
		pnlHome.add(pThongKe, "name_341040652431000");
		
		lblThngK = new JLabel("BẢNG THỐNG KÊ ");
		lblThngK.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngK.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblThngK.setBounds(10, 0, 903, 42);
		pThongKe.add(lblThngK);
		
		scrollPane_TK5 = new JScrollPane();
		scrollPane_TK5.setEnabled(false);
		scrollPane_TK5.setBounds(568, 395, 352, 117);
		pThongKe.add(scrollPane_TK5);
		tableTK5 = new JTable();
		scrollPane_TK5.setViewportView(tableTK5);
		
		lblTngSTi = new JLabel("Tổng số tài khoản:");
		lblTngSTi.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTngSTi.setBounds(568, 341, 177, 21);
		pThongKe.add(lblTngSTi);
		
		txtTAC = new JTextField();
		txtTAC.setEnabled(false);
		txtTAC.setColumns(10);
		txtTAC.setBounds(750, 341, 86, 20);
		pThongKe.add(txtTAC);
		
		panelTK = new JPanel();
		panelTK.setBackground(Color.LIGHT_GRAY);
		panelTK.setLayout(null);
		panelTK.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 255), 5, true),
						"Danh s\u00E1ch c\u00E1c dự án", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTK.setBounds(10, 40, 903, 126);
		pThongKe.add(panelTK);
		JComboBox comboBox_TK = new JComboBox();
		comboBox_TK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					loadNVNC(comboBox_TK.getSelectedIndex());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		comboBox_TK.setFont(new Font("Times New Roman", Font.BOLD, 13));
		comboBox_TK.addItem("Nhân viên có ngày công thấp nhất");
		comboBox_TK.addItem("Nhân viên có ngày công Cao nhất");
		comboBox_TK.setBounds(568, 370, 212, 20);
		pThongKe.add(comboBox_TK);
		scrollPaneTK = new JScrollPane();
		scrollPaneTK.setEnabled(false);
		scrollPaneTK.setBounds(10, 14, 883, 103);
		panelTK.add(scrollPaneTK);
		tableTK = new JTable();
		tableTK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					loadDSCTTK();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		scrollPaneTK.setViewportView(tableTK);
		
		scrollPaneTK2 = new JScrollPane();
		scrollPaneTK2.setEnabled(false);
		scrollPaneTK2.setBounds(20, 188, 538, 136);
		pThongKe.add(scrollPaneTK2);
		tableTK2 = new JTable();
		tableTK2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					loadDSCVTK();
					loadDSNVTK();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		scrollPaneTK2.setViewportView(tableTK2);
		
		scrollPane_TK3 = new JScrollPane();
		scrollPane_TK3.setEnabled(false);
		scrollPane_TK3.setBounds(20, 350, 212, 162);
		pThongKe.add(scrollPane_TK3);
		tableTK3 = new JTable();
		
		scrollPane_TK3.setViewportView(tableTK3);
		
		JLabel lblNewLabel_2 = new JLabel("Công trình trong dự án");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(20, 168, 135, 14);
		pThongKe.add(lblNewLabel_2);
		
		lblCngVicTrong = new JLabel("Công việc trong công trình");
		lblCngVicTrong.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblCngVicTrong.setBounds(20, 330, 152, 14);
		pThongKe.add(lblCngVicTrong);
		
		JScrollPane scrollPane_TK4 = new JScrollPane();
		scrollPane_TK4.setEnabled(false);
		scrollPane_TK4.setBounds(242, 350, 316, 75);
		pThongKe.add(scrollPane_TK4);
		tableTK4 = new JTable();
		scrollPane_TK4.setViewportView(tableTK4);
		tableTK4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					loadDSNCTK();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		lblNhnVinTrong = new JLabel("Nhân viên trong công trình");
		lblNhnVinTrong.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNhnVinTrong.setBounds(242, 330, 152, 14);
		pThongKe.add(lblNhnVinTrong);
		
		lblNewLabel_8 = new JLabel("Tổng dự án:");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_8.setBounds(568, 186, 177, 21);
		pThongKe.add(lblNewLabel_8);
		
		lblTngCngTrnh = new JLabel("Tổng công trình:");
		lblTngCngTrnh.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTngCngTrnh.setBounds(568, 218, 177, 21);
		pThongKe.add(lblTngCngTrnh);
		
		lblTngCngTrnh_1 = new JLabel("Tổng nhân viên:");
		lblTngCngTrnh_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTngCngTrnh_1.setBounds(568, 250, 177, 21);
		pThongKe.add(lblTngCngTrnh_1);
		
		JTextField txtTDA = new JTextField();
		txtTDA.setEnabled(false);
		txtTDA.setBounds(750, 186, 86, 20);
		pThongKe.add(txtTDA);
		txtTDA.setColumns(10);
		
		txtTCT = new JTextField();
		txtTCT.setEnabled(false);
		txtTCT.setColumns(10);
		txtTCT.setBounds(750, 217, 86, 20);
		pThongKe.add(txtTCT);
		
		txtTNV = new JTextField();
		txtTNV.setEnabled(false);
		txtTNV.setColumns(10);
		txtTNV.setBounds(750, 248, 86, 20);
		pThongKe.add(txtTNV);
		
		lblNhnVinC = new JLabel("Tổng số trưởng phòng ban:");
		lblNhnVinC.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNhnVinC.setBounds(568, 282, 177, 21);
		pThongKe.add(lblNhnVinC);
		
		txtTTPB = new JTextField();
		txtTTPB.setEnabled(false);
		txtTTPB.setColumns(10);
		txtTTPB.setBounds(750, 279, 86, 20);
		pThongKe.add(txtTTPB);
		
		lblTngSNvqlda = new JLabel("Tổng số NVQLDA:");
		lblTngSNvqlda.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTngSNvqlda.setBounds(568, 314, 177, 21);
		pThongKe.add(lblTngSNvqlda);
		
		txtTNVQLDA = new JTextField();
		txtTNVQLDA.setEnabled(false);
		txtTNVQLDA.setColumns(10);
		txtTNVQLDA.setBounds(750, 310, 86, 20);
		pThongKe.add(txtTNVQLDA);
		
		JLabel lblNgyCngCa = new JLabel("Ngày công của nhân viên");
		lblNgyCngCa.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNgyCngCa.setBounds(242, 431, 152, 14);
		pThongKe.add(lblNgyCngCa);
		
		JScrollPane scrollPane_TK6 = new JScrollPane();
		scrollPane_TK6.setEnabled(false);
		scrollPane_TK6.setBounds(242, 447, 316, 65);
		pThongKe.add(scrollPane_TK6);
		tableTK6 = new JTable();
		scrollPane_TK6.setViewportView(tableTK6);
		

		
		pNV = new JPanel();
		pNV.setBackground(Color.LIGHT_GRAY);
		pnlHome.add(pNV, "name_269482229677300");
		pNV.setLayout(null);
		ImageIcon img = new ImageIcon("quan-ly-nhan-vien-bang-phan-mem-ban-hang.jpg");
		JLabel lblQunLNhn = new JLabel("QUẢN LÝ NHÂN VIÊN");
	
		lblQunLNhn.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLNhn.setBounds(0, 0, 919, 69);
		lblQunLNhn.setFont(new Font("Tahoma", Font.BOLD, 24));
		pNV.add(lblQunLNhn);

		panelDSNV = new JPanel();
		panelDSNV.setBackground(Color.LIGHT_GRAY);
		panelDSNV.setBounds(0, 66, 919, 364);
		panelDSNV.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 255), 5, true),
				"Danh s\u00E1ch nh\u00E2n vi\u00EAn", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pNV.add(panelDSNV);
		panelDSNV.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 14, 899, 339);
		panelDSNV.add(scrollPane);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * table danh sach nhan vien
		 */
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

		panelQLNVacction = new JPanel();
		panelQLNVacction.setBackground(SystemColor.activeCaption);
		panelQLNVacction.setBounds(10, 441, 505, 105);
		panelQLNVacction.setBorder(new LineBorder(Color.LIGHT_GRAY));
		pNV.add(panelQLNVacction);
		panelQLNVacction.setLayout(null);
		
				lblMNhnVin = new JLabel("Mã nhân viên");
				lblMNhnVin.setBounds(10, 11, 80, 14);
				panelQLNVacction.add(lblMNhnVin);
				lblMNhnVin.setFont(new Font("Tahoma", Font.BOLD, 11));
				
						lblTnNhnVin = new JLabel("Tên nhân viên");
						lblTnNhnVin.setBounds(10, 36, 80, 14);
						panelQLNVacction.add(lblTnNhnVin);
						lblTnNhnVin.setFont(new Font("Tahoma", Font.BOLD, 11));
						
								lblNewLabel = new JLabel("Ngày sinh");
								lblNewLabel.setBounds(10, 61, 54, 14);
								panelQLNVacction.add(lblNewLabel);
								lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
								
										txtNVdate = new JTextField();
										txtNVdate.setBounds(96, 58, 160, 20);
										panelQLNVacction.add(txtNVdate);
										txtNVdate.setColumns(10);
										
												txtNVten = new JTextField();
												txtNVten.setBounds(96, 33, 160, 20);
												panelQLNVacction.add(txtNVten);
												txtNVten.setColumns(10);
												
														txtNVma = new JTextField();
														txtNVma.setBounds(96, 8, 160, 20);
														panelQLNVacction.add(txtNVma);
														txtNVma.setEditable(false);
														txtNVma.setColumns(10);
														
																lblaCh = new JLabel("Địa chỉ");
																lblaCh.setBounds(266, 11, 38, 14);
																panelQLNVacction.add(lblaCh);
																lblaCh.setFont(new Font("Tahoma", Font.BOLD, 11));
																
																		lblNewLabel_1 = new JLabel("Giới tính");
																		lblNewLabel_1.setBounds(266, 36, 46, 14);
																		panelQLNVacction.add(lblNewLabel_1);
																		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
																		
																				JLabel lblMPhngBan = new JLabel("Mã phòng ban");
																				lblMPhngBan.setBounds(266, 61, 91, 14);
																				panelQLNVacction.add(lblMPhngBan);
																				lblMPhngBan.setFont(new Font("Tahoma", Font.BOLD, 11));
																						
																								cbNVsex = new JComboBox<String>();
																								cbNVsex.setBounds(334, 33, 160, 20);
																								panelQLNVacction.add(cbNVsex);
																								cbNVsex.setModel(new DefaultComboBoxModel<String>(new String[] { "Nam", "Nữ" }));
																												loadDSPB();
																												JComboBox comboBox_MPBNV = new JComboBox(dspb);
																												comboBox_MPBNV.setBounds(355, 57, 139, 22);
																												panelQLNVacction.add(comboBox_MPBNV);
																												
																												comboBox_NVDC = new JComboBox(dsTT);
																												comboBox_NVDC.setBounds(334, 7, 160, 22);
																												panelQLNVacction.add(comboBox_NVDC);
										
										JPanel panel = new JPanel();
										panel.setBackground(Color.GRAY);
										panel.setBounds(572, 441, 347, 105);
										pNV.add(panel);
										panel.setLayout(null);
										
												JButton btnSuaNV = new JButton("Sửa");
												btnSuaNV.setBounds(10, 72, 160, 25);
												panel.add(btnSuaNV);
												btnSuaNV.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														try {
															updateNV(comboBox_MPBNV.getSelectedItem().toString(),comboBox_NVDC.getSelectedItem().toString());
														} catch (HeadlessException e1) {
															// TODO Auto-generated catch block
															e1.printStackTrace();
														} catch (SQLException e1) {
															// TODO Auto-generated catch block
															e1.printStackTrace();
														}
													}
												});
												btnSuaNV.setIcon(new ImageIcon(MainFrame.class.getResource("/images/config.png")));
												
														JButton btnThemNV = new JButton("Thêm");
														btnThemNV.setBounds(10, 36, 160, 25);
														panel.add(btnThemNV);
														btnThemNV.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																try {
																	addNV(comboBox_MPBNV.getSelectedItem().toString(),comboBox_NVDC.getSelectedItem().toString());
																} catch (SQLException e1) {
																	// TODO Auto-generated catch block
																	e1.printStackTrace();
																} catch (ParseException e1) {
																	// TODO Auto-generated catch block
																	e1.printStackTrace();
																}
															}
														});
														btnThemNV.setIcon(new ImageIcon(MainFrame.class.getResource("/images/btn_add.png")));
														
														btnClearNV = new JButton("Làm mới");
														btnClearNV.setBounds(177, 72, 160, 25);
														panel.add(btnClearNV);
														btnClearNV.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																ClearQLNV();
															}
														});
														btnClearNV.setIcon(new ImageIcon(MainFrame.class.getResource("/images/edit-clear.png")));
														
																JButton btnXoaNV = new JButton("Xóa");
																btnXoaNV.setBounds(177, 36, 160, 25);
																panel.add(btnXoaNV);
																btnXoaNV.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		try {
																			xoaNV();
																		} catch (SQLException e1) {
																			// TODO Auto-generated catch block
																			e1.printStackTrace();
																		}
																	}
																});
																btnXoaNV.setIcon(new ImageIcon(MainFrame.class.getResource("/images/btn_delete.png")));
																
																JLabel lblNewLabel_4 = new JLabel("Nhập tên nhân viên cần tìm:");
																lblNewLabel_4.setBounds(10, 11, 160, 14);
																panel.add(lblNewLabel_4);
																lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
																
																		txtNVsearchtext = new JTextField();
																		txtNVsearchtext.setBounds(177, 11, 160, 20);
																		panel.add(txtNVsearchtext);
																		txtNVsearchtext.addKeyListener(new KeyAdapter() {
																			@Override
																			public void keyReleased(KeyEvent e) {
																				try {
																					searchNVtest();
																				} catch (SQLException e1) {
																					// TODO Auto-generated catch block
																					e1.printStackTrace();
																				}
																			}
																		});
																		txtNVsearchtext.setColumns(10);
		
		tableDSNV = new JTable();
		tableDSNV.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tblDSNVmouse();			
				int x = tableDSNV.getSelectedRow();
				comboBox_MPBNV.setSelectedItem(tblDSNVmd.getValueAt(x, 5).toString());
				System.out.println(tblDSNVmd.getValueAt(x, 4).toString().trim());
				comboBox_NVDC.setSelectedItem(tblDSNVmd.getValueAt(x, 4).toString().trim());
			}
		});
		scrollPane.setViewportView(tableDSNV);
		/*
		 * btnNewButton.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { } });
		 */

		pPhanCong = new JPanel();
		pPhanCong.setBackground(Color.LIGHT_GRAY);
		pnlHome.add(pPhanCong, "name_269484714075400");
		pPhanCong.setLayout(null);

		PCNVlb0 = new JLabel("Bảng Công Trình ");
		PCNVlb0.setHorizontalAlignment(SwingConstants.CENTER);
		PCNVlb0.setBounds(20, 0, 893, 43);
		PCNVlb0.setFont(new Font("Tahoma", Font.BOLD, 24));
		pPhanCong.add(PCNVlb0);

		panelDSCT = new JPanel();
		panelDSCT.setBackground(Color.LIGHT_GRAY);
		panelDSCT.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 255), 5, true),
				"Danh s\u00E1ch c\u00E1c c\u00F4ng tr\u00ECnh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDSCT.setBounds(10, 40, 903, 288);
		pPhanCong.add(panelDSCT);
		panelDSCT.setLayout(null);

		JScrollPane scrollPaneDSCT = new JScrollPane();
		scrollPaneDSCT.setBounds(10, 14, 883, 263);
		panelDSCT.add(scrollPaneDSCT);
//////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * table danh sach cong trinh ben tab phan cong
		 */
		tableDSCTchuahoanthanh = new JTable();
		tableDSCTchuahoanthanh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPaneDSCT.setViewportView(tableDSCTchuahoanthanh);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 354, 607, 190);
		pPhanCong.add(scrollPane_1);
		
		tableDSPCNV = new JTable();
		scrollPane_1.setViewportView(tableDSPCNV);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(637, 354, 276, 168);
		pPhanCong.add(panel_1);
		panel_1.setLayout(null);
		
				PCNVlb1 = new JLabel("Tên Công Việc");
				PCNVlb1.setBounds(10, 11, 80, 14);
				panel_1.add(PCNVlb1);
				PCNVlb1.setFont(new Font("Tahoma", Font.BOLD, 11));
						
								PCNVlb2 = new JLabel("Ngày bắt đầu");
								PCNVlb2.setBounds(10, 36, 80, 14);
								panel_1.add(PCNVlb2);
								PCNVlb2.setFont(new Font("Tahoma", Font.BOLD, 11));
								
								JDateChooser dateChooser_begin = new JDateChooser();
								dateChooser_begin.setBounds(101, 36, 165, 20);
								panel_1.add(dateChooser_begin);
								
								JDateChooser dateChooser_end = new JDateChooser();
								dateChooser_end.setBounds(101, 61, 165, 20);
								panel_1.add(dateChooser_end);
								
										PCNVlb3 = new JLabel("Ngày kết thúc");
										PCNVlb3.setBounds(10, 61, 80, 14);
										panel_1.add(PCNVlb3);
										PCNVlb3.setFont(new Font("Tahoma", Font.BOLD, 11));
										
										JButton btnPCNVadd = new JButton("Phân công");
										btnPCNVadd.setBounds(11, 101, 255, 43);
										panel_1.add(btnPCNVadd);
										btnPCNVadd.setIcon(new ImageIcon(MainFrame.class.getResource("/images/personal.png")));
										btnPCNVadd.setFont(new Font("Tahoma", Font.BOLD, 11));
										btnPCNVadd.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
													try {
														PhanCong(dateChooser_begin.getDate(), dateChooser_end.getDate(),comboBox_1.getSelectedItem().toString());
													} catch (SQLException e1) {
														// TODO Auto-generated catch block
														e1.printStackTrace();
												}
											}
										});
										btnPCNVadd.setBackground(Color.CYAN);
										btnPCNVadd.setForeground(Color.RED);
										String[] dscv = new String[] {"Tính toán nguyên vật liệu","Xây Dựng","Thiết kế","Kiểm tra công trình","Bàn Giao"};
										comboBox_1 = new JComboBox(dscv);
										comboBox_1.setBounds(100, 7, 166, 22);
										panel_1.add(comboBox_1);
										
										JLabel lblNewLabel_6 = new JLabel("Chọn nhân viên cần phân công:");
										lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
										lblNewLabel_6.setBounds(23, 339, 185, 14);
										pPhanCong.add(lblNewLabel_6);
										
										
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////

		getContentPane().add(spltPane, java.awt.BorderLayout.CENTER);

		pDA = new JPanel();
		pDA.setBackground(Color.LIGHT_GRAY);
		pnlHome.add(pDA, "name_269484714075400");
		pDA.setLayout(null);

		lblAsd = new JLabel("QUẢN LÝ DỰ ÁN");
		lblAsd.setBounds(343, 0, 217, 29);
		lblAsd.setFont(new Font("Tahoma", Font.BOLD, 24));
		pDA.add(lblAsd);

		panelDSDA = new JPanel();
		panelDSDA.setBackground(Color.LIGHT_GRAY);
		panelDSDA.setBounds(10, 40, 903, 265);
		panelDSDA.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 255), 5, true),
				"Danh s\u00E1ch c\u00E1c d\u1EF1 \u00E1n", TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		pDA.add(panelDSDA);
		panelDSDA.setLayout(null);

		JScrollPane scrollPaneDSDA = new JScrollPane();
		scrollPaneDSDA.setBounds(10, 14, 883, 240);
		panelDSDA.add(scrollPaneDSDA);
///////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * table danh sach du an
		 */
		tableDSDA = new JTable();
		tableDSDA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tblDSDAmouse();
			}
		});
		scrollPaneDSDA.setViewportView(tableDSDA);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		JPanel panelQLDAacction = new JPanel();
		panelQLDAacction.setBackground(Color.GRAY);
		panelQLDAacction.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelQLDAacction.setBounds(598, 305, 315, 147);
		pDA.add(panelQLDAacction);
		panelQLDAacction.setLayout(null);

		txtDAsearchtext = new JTextField();
		txtDAsearchtext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					searchDAtest();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		txtDAsearchtext.setBounds(160, 21, 140, 20);
		panelQLDAacction.add(txtDAsearchtext);
		txtDAsearchtext.setColumns(10);

		JButton btnThemDA = new JButton("Thêm");
		btnThemDA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					addDA();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnThemDA.setBounds(10, 50, 140, 23);
		panelQLDAacction.add(btnThemDA);
		btnThemDA.setIcon(new ImageIcon(MainFrame.class.getResource("/images/btn_add.png")));

		JButton btnXoaDA = new JButton("Xóa");
		btnXoaDA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					xoaDA();
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnXoaDA.setBounds(160, 50, 140, 23);
		panelQLDAacction.add(btnXoaDA);
		btnXoaDA.setIcon(new ImageIcon(MainFrame.class.getResource("/images/btn_delete.png")));

		JButton btnSuaDA = new JButton("Sửa");
		btnSuaDA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					updateDA();
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSuaDA.setBounds(10, 84, 140, 23);
		panelQLDAacction.add(btnSuaDA);
		btnSuaDA.setIcon(new ImageIcon(MainFrame.class.getResource("/images/config.png")));
		
		btnClearDA = new JButton("Làm mới");
		btnClearDA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClearQLDA();
			}
		});
		btnClearDA.setIcon(new ImageIcon(MainFrame.class.getResource("/images/edit-clear.png")));
		btnClearDA.setBounds(160, 84, 140, 23);
		panelQLDAacction.add(btnClearDA);
		
		lblNewLabel_12 = new JLabel("Nhập tên dự án cần tìm:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_12.setBounds(10, 25, 140, 14);
		panelQLDAacction.add(lblNewLabel_12);
		
		panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.textHighlight);
		panel_5.setBounds(10, 311, 578, 97);
		pDA.add(panel_5);
		panel_5.setLayout(null);
		
				JLabel lMaDA = new JLabel("Mã dự án");
				lMaDA.setBounds(10, 11, 80, 14);
				panel_5.add(lMaDA);
				lMaDA.setFont(new Font("Tahoma", Font.BOLD, 11));
				
						txtDAma = new JTextField();
						txtDAma.setBounds(88, 8, 180, 20);
						panel_5.add(txtDAma);
						txtDAma.setEditable(false);
						txtDAma.setColumns(10);
						
								JLabel lblTenDA = new JLabel("Tên dự án");
								lblTenDA.setBounds(278, 11, 80, 14);
								panel_5.add(lblTenDA);
								lblTenDA.setFont(new Font("Tahoma", Font.BOLD, 11));
								
										JLabel MaMain = new JLabel("Mã NVQLDA");
										MaMain.setBounds(10, 61, 80, 14);
										panel_5.add(MaMain);
										MaMain.setFont(new Font("Tahoma", Font.BOLD, 11));
										
												txtDAmamain = new JTextField();
												txtDAmamain.setBounds(88, 58, 180, 20);
												panel_5.add(txtDAmamain);
												txtDAmamain.setColumns(10);
												
														txtDAten = new JTextField();
														txtDAten.setBounds(355, 8, 180, 20);
														panel_5.add(txtDAten);
														txtDAten.setColumns(10);

		pQLCT = new JPanel();
		pQLCT.setBackground(Color.LIGHT_GRAY);
		pQLCT.setLayout(null);
		pnlHome.add(pQLCT, "name_9410183188881");

		QLCTlb1 = new JLabel("QUẢN LÝ CÔNG TRÌNH");
		QLCTlb1.setHorizontalAlignment(SwingConstants.CENTER);
		QLCTlb1.setFont(new Font("Tahoma", Font.BOLD, 24));
		QLCTlb1.setBounds(10, 0, 903, 40);
		pQLCT.add(QLCTlb1);

		panelQLCTacction = new JPanel();
		panelQLCTacction.setBackground(Color.GRAY);
		panelQLCTacction.setLayout(null);
		panelQLCTacction.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panelQLCTacction.setBounds(554, 421, 359, 115);
		pQLCT.add(panelQLCTacction);

		txtQLCTsearchtext = new JTextField();
		txtQLCTsearchtext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					searchTestQLCT();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		txtQLCTsearchtext.setColumns(10);
		txtQLCTsearchtext.setBounds(185, 8, 165, 20);
		panelQLCTacction.add(txtQLCTsearchtext);

		btnQLCTadd = new JButton("Thêm");
		btnQLCTadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					addCT(comboBox_CTDC.getSelectedItem().toString(),comboBox_MDA.getSelectedItem().toString());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnQLCTadd.setIcon(new ImageIcon(MainFrame.class.getResource("/images/btn_add.png")));
		btnQLCTadd.setBounds(10, 36, 165, 23);
		panelQLCTacction.add(btnQLCTadd);

		btnQLCTdel = new JButton("Xóa");
		btnQLCTdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					xoaCT();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnQLCTdel.setIcon(new ImageIcon(MainFrame.class.getResource("/images/btn_delete.png")));
		btnQLCTdel.setBounds(185, 36, 165, 23);
		panelQLCTacction.add(btnQLCTdel);

		btnQLCTupdate = new JButton("Sửa");
		btnQLCTupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					updateCT(comboBox_CTDC.getSelectedItem().toString(),comboBox_MDA.getSelectedItem().toString());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnQLCTupdate.setIcon(new ImageIcon(MainFrame.class.getResource("/images/config.png")));
		btnQLCTupdate.setBounds(10, 70, 165, 23);
		panelQLCTacction.add(btnQLCTupdate);
		
		btnXaDLiu = new JButton("Làm mới");
		btnXaDLiu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClearQLCT();
			}
		});
		btnXaDLiu.setIcon(new ImageIcon(MainFrame.class.getResource("/images/edit-clear.png")));
		btnXaDLiu.setBounds(185, 70, 165, 23);
		panelQLCTacction.add(btnXaDLiu);
		
		lblNhpTnCng = new JLabel("Nhập tên công trình cần tìm:");
		lblNhpTnCng.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNhpTnCng.setBounds(10, 11, 165, 14);
		panelQLCTacction.add(lblNhpTnCng);

		JPanel panelQLDSCT = new JPanel();
		panelQLDSCT.setBackground(Color.LIGHT_GRAY);
		panelQLDSCT.setLayout(null);
		panelQLDSCT.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 255), 5, true),
				"Danh s\u00E1ch c\u00E1c c\u00F4ng tr\u00ECnh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelQLDSCT.setBounds(10, 40, 903, 370);
		pQLCT.add(panelQLDSCT);

		JScrollPane scrollPaneQLCT2 = new JScrollPane();
		scrollPaneQLCT2.setBounds(10, 14, 883, 350);
		panelQLDSCT.add(scrollPaneQLCT2);
		/////////////////////////////////////////////////////////////////////////////////////
		/*
		 * Table QUan ly Cong trinh ben tab Cong trinh
		 */
		tableQLCT2 = new JTable();
		tableQLCT2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tblQLCT2mouse();
				int x = tableQLCT2.getSelectedRow();
				comboBox_CTDC.setSelectedItem(tblDSCTmd.getValueAt(x, 2).toString());
				comboBox_MDA.setSelectedItem(tblDSCTmd.getValueAt(x, 7).toString());
			}
		});
		scrollPaneQLCT2.setViewportView(tableQLCT2);/// muc dich de hien thi view tren scrpanel
		
		panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.textHighlight);
		panel_6.setBounds(10, 421, 540, 115);
		pQLCT.add(panel_6);
		panel_6.setLayout(null);
		
				QLCTlb2 = new JLabel("Mã công trình");
				QLCTlb2.setBounds(10, 11, 100, 14);
				panel_6.add(QLCTlb2);
				QLCTlb2.setFont(new Font("Tahoma", Font.BOLD, 11));
				
						QLCTlb3 = new JLabel("Tên công trình");
						QLCTlb3.setBounds(10, 36, 100, 14);
						panel_6.add(QLCTlb3);
						QLCTlb3.setFont(new Font("Tahoma", Font.BOLD, 11));
						
								QLCTlb4 = new JLabel("Địa điểm");
								QLCTlb4.setBounds(10, 61, 54, 14);
								panel_6.add(QLCTlb4);
								QLCTlb4.setFont(new Font("Tahoma", Font.BOLD, 11));
								
								JLabel lblTrangThai = new JLabel("Trạng thái");
								lblTrangThai.setBounds(10, 86, 79, 14);
								panel_6.add(lblTrangThai);
								lblTrangThai.setFont(new Font("Tahoma", Font.BOLD, 11));
								
								txtQLCTtrangthai = new JTextField();
								txtQLCTtrangthai.setBounds(102, 83, 135, 20);
								panel_6.add(txtQLCTtrangthai);
								txtQLCTtrangthai.setColumns(10);
										
												txtQLCTTen = new JTextField();
												txtQLCTTen.setBounds(102, 33, 135, 20);
												panel_6.add(txtQLCTTen);
												txtQLCTTen.setColumns(10);
												
														txtQLCTMa = new JTextField();
														txtQLCTMa.setBounds(102, 8, 135, 20);
														panel_6.add(txtQLCTMa);
														txtQLCTMa.setEditable(false);
														txtQLCTMa.setColumns(10);
														
														
														lblNewLabel_3 = new JLabel("Mã dự án");
														lblNewLabel_3.setBounds(247, 86, 100, 14);
														panel_6.add(lblNewLabel_3);
														lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
														
																QLCTlb7 = new JLabel("Ngày hoàn thành");
																QLCTlb7.setBounds(247, 61, 100, 14);
																panel_6.add(QLCTlb7);
																QLCTlb7.setFont(new Font("Tahoma", Font.BOLD, 11));
																
																		QLCTlb6 = new JLabel("Ngày khởi công");
																		QLCTlb6.setBounds(247, 36, 100, 14);
																		panel_6.add(QLCTlb6);
																		QLCTlb6.setFont(new Font("Tahoma", Font.BOLD, 11));
																		
																				QLCTlb5 = new JLabel("Ngày cấp phép xây dựng");
																				QLCTlb5.setBounds(247, 11, 170, 14);
																				panel_6.add(QLCTlb5);
																				QLCTlb5.setFont(new Font("Tahoma", Font.BOLD, 11));
																				
																						txtQLCTNgayht = new JTextField();
																						txtQLCTNgayht.setBounds(390, 58, 135, 20);
																						panel_6.add(txtQLCTNgayht);
																						txtQLCTNgayht.setColumns(10);
																						
																								txtQLCtNgaykc = new JTextField();
																								txtQLCtNgaykc.setBounds(390, 33, 135, 20);
																								panel_6.add(txtQLCtNgaykc);
																								txtQLCtNgaykc.setColumns(10);
																								
																										txtQLCTCpxd = new JTextField();
																										txtQLCTCpxd.setBounds(390, 8, 135, 20);
																										panel_6.add(txtQLCTCpxd);
																										txtQLCTCpxd.setColumns(10);
																										
																										comboBox_CTDC = new JComboBox(dsTT);
																										comboBox_CTDC.setBounds(102, 57, 135, 22);
																										panel_6.add(comboBox_CTDC);
																										loadDSDA();
																										comboBox_MDA = new JComboBox(dsmdan);
																										comboBox_MDA.setBounds(390, 82, 135, 22);
																										panel_6.add(comboBox_MDA);
		
		pDieuDong = new JPanel();
		pDieuDong.setBackground(Color.LIGHT_GRAY);
		pDieuDong.setLayout(null);
		pnlHome.add(pDieuDong, "name_259352065400900");
		
		lblBngiung = new JLabel("Bảng Điều Động");
		lblBngiung.setHorizontalAlignment(SwingConstants.CENTER);
		lblBngiung.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBngiung.setBounds(10, 0, 909, 39);
		pDieuDong.add(lblBngiung);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 255), 5, true),
						"Danh s\u00E1ch c\u00E1c nhân viên", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 40, 640, 265);
		pDieuDong.add(panel_2);
		
		scrollPane_DieuDong = new JScrollPane();
		scrollPane_DieuDong.setBounds(10, 14, 620, 243);
		panel_2.add(scrollPane_DieuDong);
		tableDieuDong = new JTable();
		scrollPane_DieuDong.setViewportView(tableDieuDong);
		
		
		scrollPane_CTmoi = new JScrollPane();
		scrollPane_CTmoi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane_CTmoi.setBounds(10, 334, 887, 210);
		pDieuDong.add(scrollPane_CTmoi);
		tableDSCTmoi = new JTable();
		scrollPane_CTmoi.setViewportView(tableDSCTmoi);
		
		JLabel lblNewLabel_11 = new JLabel("Chọn công trình cần điều động:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(20, 316, 180, 14);
		pDieuDong.add(lblNewLabel_11);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GRAY);
		panel_4.setBounds(660, 50, 259, 210);
		pDieuDong.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblCngTrnh = new JLabel("Công trình");
		lblCngTrnh.setBounds(10, 11, 83, 20);
		panel_4.add(lblCngTrnh);
		lblCngTrnh.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
		JComboBox comboBoxCTcu = new JComboBox(loadDSNVDieuDong());
		comboBoxCTcu.setBounds(95, 11, 154, 20);
		panel_4.add(comboBoxCTcu);
		
		JLabel lblNgyiung = new JLabel("Ngày điều động");
		lblNgyiung.setBounds(10, 42, 83, 30);
		panel_4.add(lblNgyiung);
		lblNgyiung.setFont(new Font("Times New Roman", Font.BOLD, 12));
		
				JDateChooser dateChoseDD = new JDateChooser();
				dateChoseDD.setBounds(95, 43, 154, 29);
				panel_4.add(dateChoseDD);
				
				JLabel lblNgyDng = new JLabel("Ngày dừng");
				lblNgyDng.setBounds(10, 76, 83, 30);
				panel_4.add(lblNgyDng);
				lblNgyDng.setFont(new Font("Times New Roman", Font.BOLD, 12));
				
				JDateChooser dateChooser_DungDD = new JDateChooser();
				dateChooser_DungDD.setBounds(95, 77, 154, 29);
				panel_4.add(dateChooser_DungDD);
				
				JLabel lblNewLabel_7 = new JLabel("Công việc");
				lblNewLabel_7.setBounds(10, 106, 105, 30);
				panel_4.add(lblNewLabel_7);
				lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 12));
				
				btDieuDong = new JButton("Điều Động");
				btDieuDong.setBounds(10, 147, 239, 43);
				panel_4.add(btDieuDong);
				
				btDieuDong.setForeground(Color.RED);
				btDieuDong.setFont(new Font("Tahoma", Font.BOLD, 11));
				btDieuDong.setBackground(Color.CYAN);
				
				
				JComboBox comboBox_CVDD = new JComboBox(dscv);
				comboBox_CVDD.setBounds(95, 110, 154, 22);
				panel_4.add(comboBox_CVDD);
				btDieuDong.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String n = ds[comboBoxCTcu.getSelectedIndex()];
						try {
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							String date = sdf.format(dateChoseDD.getDate());
							String datedung = sdf.format(dateChooser_DungDD.getDate());
							DieuDong(n,date,datedung,comboBox_CVDD.getSelectedItem().toString());
						} catch (HeadlessException | SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
		
		comboBoxCTcu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String n = ds[comboBoxCTcu.getSelectedIndex()];
					loadDSNV(n);
					loadDSCTmoi(n);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		
		pCongViec = new JPanel();
		pCongViec.setBackground(Color.LIGHT_GRAY);
		pCongViec.setLayout(null);
		pnlHome.add(pCongViec, "name_283678053101700");
		
		label = new JLabel("QUẢN LÝ CÔNG VIỆC");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 24));
		label.setBounds(10, 0, 903, 29);
		pCongViec.add(label);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 255, 255), 5, true),
								"Danh s\u00E1ch công việc", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 80, 903, 265);
		pCongViec.add(panel_3);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 14, 883, 243);
		panel_3.add(scrollPane_4);
		tableDSCV = new JTable();
		scrollPane_4.setViewportView(tableDSCV);
		
		comboBox = new JComboBox(loadDSNVDieuDong());
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = ds[comboBox.getSelectedIndex()];
				try {
					try {
						loadDSCV(n);
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		comboBox.setBounds(716, 49, 183, 20);
		pCongViec.add(comboBox);
		
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		getContentPane().add(spltPane, java.awt.BorderLayout.CENTER);

		mnUser.setText("User\r\n");
////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * Me nu i tem Đăng xuất, để đăng xuất ra khỏi main frame và hiện lại đang nhập
		 * frame
		 */
		mnuiLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
		mnuiLogout.setText("Đăng xuất");
		mnuiLogout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mnuiLogoutActionPerformed(evt);
			}
		});
		////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * menu item ddooir mật khẩu, để xác nhận đổi mật khẩu của người dùng hiện tại ?
		 * cần phải so sánh khi nhấn xác nhận ? so mk cũ có trong csdl, upDAte row trong
		 * sql ?
		 * 
		 */
		mnuiDMK = new JMenuItem("Đổi mật khẩu");
		mnuiDMK.setIcon(new ImageIcon(MainFrame.class.getResource("/images/gtk-refresh.png")));
		mnUser.add(mnuiDMK);
		mnUser.add(mnuiLogout);
		mnuiDMK.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DoiMatKhauFrame dmk = new DoiMatKhauFrame(txtINFOuserName.getText());
				dmk.setVisible(true);
			}
		});
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * Menu Item thoát, để thoát khỏi chương trình đóng hết các frame
		 */
		mnuiExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_delete.png"))); // NOI18N
		mnuiExit.setText("Thoát");
		mnuiExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				mnuiExitActionPerformed(evt);
			}
		});
		mnUser.add(mnuiExit);

		menuBarMain.add(mnUser);

		setJMenuBar(menuBarMain);

		mnNhanVien = new JMenu("Nhân viên");
		menuBarMain.add(mnNhanVien);
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * Menu Item Quản Lý Nhân Viên, sau khi đổi panel qua nhân viên, thi load lại
		 * CSDL Nhân viên
		 */
		mnuiQLNV = new JMenuItem("Quản lí nhân viên");
		mnuiQLNV.setIcon(new ImageIcon(MainFrame.class.getResource("/images/personal.png")));
		mnNhanVien.add(mnuiQLNV);
		mnuiQLNV.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				switchPanel(pNV);
				try {
					loadDSNV();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		///////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * Menu Item Phan Cong, can co bang Cong trinh de chọn phân công vào cong trình
		 * nào
		 */
		mnuiPhanCong = new JMenuItem("Phân công nhân viên");
		mnuiPhanCong.setIcon(new ImageIcon(MainFrame.class.getResource("/images/Transfer.png")));
		mnNhanVien.add(mnuiPhanCong);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Chấm công");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				switchPanel(pQLCT);
				ChamCongFrame fra = null;
				try {
					fra = new ChamCongFrame();
					loadDSCT();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fra.setVisible(true);
			}
		});
		
		mntmiung = new JMenuItem("Điều Động");
		mntmiung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanel(pDieuDong);
				
				try {
					loadDSNV("CT001");
					loadDSCTmoi("CT001");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		mntmiung.setIcon(new ImageIcon(MainFrame.class.getResource("/images/config.png")));
		mnNhanVien.add(mntmiung);

		mntmNewMenuItem.setIcon(new ImageIcon(MainFrame.class.getResource("/images/Select.png")));
		mnNhanVien.add(mntmNewMenuItem);
		mnuiPhanCong.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				switchPanel(pPhanCong);
				try {
					loadDSCTChuahoanthanh("Hoàn Thành");
					loadDSNV();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		mnDn = new JMenu("Dự án");
		menuBarMain.add(mnDn);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * Menu Item Quản lý Dự án, ( thêm- xóa -sửa dự án)
		 */
		mnuiQLDA = new JMenuItem("Quản lí dự án");
		mnuiQLDA.setIcon(new ImageIcon(MainFrame.class.getResource("/images/project_open.png")));
		mnDn.add(mnuiQLDA);
		mnuiQLDA.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				switchPanel(pDA);
				try {
					loadDSDA();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		mnCongTrinh = new JMenu("Công trình");
		menuBarMain.add(mnCongTrinh);
		/////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * Menu Item Quản lý công trình, đẻ thao tác frame Công trình (Thêm - xóa - sửa
		 * Cong trình )
		 */
		mnuiQLCT = new JMenuItem("Quản lí công trình");
		mnuiQLCT.setIcon(new ImageIcon(MainFrame.class.getResource("/images/Department.png")));
		mnCongTrinh.add(mnuiQLCT);
		
		mnCngVic = new JMenu("Công Việc");
		menuBarMain.add(mnCngVic);
		
		mntmXemCngVic = new JMenuItem("Xem công việc");
		mntmXemCngVic.setIcon(new ImageIcon(MainFrame.class.getResource("/images/btn_search.png")));
		mntmXemCngVic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(pCongViec);
				try {
					try {
						loadDSCV("CT001");
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mnCngVic.add(mntmXemCngVic);
		
		mnBaoCao = new JMenu("Thống kê");
		menuBarMain.add(mnBaoCao);
		
		mntmThngK = new JMenuItem("Thống Kê");
		mntmThngK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switchPanel(pThongKe);
				CongtrinhCtrl ct = new CongtrinhCtrl();
				try {
					loadDSTK();
					txtTDA.setText(String.valueOf(ct.getTKCTtext()[0]));
					txtTCT.setText(String.valueOf(ct.getTKCTtext()[1]));
					txtTNV.setText(String.valueOf(ct.getTKCTtext()[2]));
					txtTTPB.setText(String.valueOf(ct.getTKCTtext()[3]));
					txtTNVQLDA.setText(String.valueOf(ct.getTKCTtext()[4]));
					txtTAC.setText(String.valueOf(ct.getTKCTtext()[5]));
					loadNVNC(comboBox_TK.getSelectedIndex());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		mntmThngK.setIcon(new ImageIcon(MainFrame.class.getResource("/images/table.png")));
		mnBaoCao.add(mntmThngK);
		mnuiQLCT.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				switchPanel(pQLCT);
				try {
					loadDSCT();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}// </editor-fold>//GEN-END:initComponents

	private void mnuiLogoutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnuiLogoutActionPerformed
		logOut();
	}// GEN-LAST:event_mnuiLogoutActionPerformed

	// Thoát khỏi ứng dụng
	private void mnuiExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_mnuiExitActionPerformed
		if (JOptionPane.showConfirmDialog(this, "Bạn thực sự muốn thoát khỏi ?", "Đã thoát",
				JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
			System.exit(0);
		}
	}// GEN-LAST:event_mnuiExitActionPerformed

	private void btnEmployeeManageActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEmployeeManageActionPerformed
//        PnlAdminEmployeeManage pnlEmp = new PnlAdminEmployeeManage();
//        spltPane.setRightComponent(pnlEmp);
	}// GEN-LAST:event_btnEmployeeManageActionPerformed

	private void formWindowClosing(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowClosing
		Main.frmLogin.setVisible(true);

	}// GEN-LAST:event_formWindowClosing

	private void btnProjectManageActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnProjectManageActionPerformed
//        PnlAdminProjectManage pnlPrj = new PnlAdminProjectManage();
//        spltPane.setRightComponent(pnlPrj);
	}// GEN-LAST:event_btnProjectManageActionPerformed

	private void btnEmpTransferManageActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEmpTransferManageActionPerformed

	}// GEN-LAST:event_btnEmpTransferManageActionPerformed

	private void btnRequestTransferActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRequestTransferActionPerformed

	}// GEN-LAST:event_btnRequestTransferActionPerformed

	private void btnHomeEmpActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnHomeEmpActionPerformed

	}// GEN-LAST:event_btnHomeEmpActionPerformed

	private void btnDepartmentListActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDepartmentListActionPerformed
//        PnlUserDepartmentList deptEmpPnl = new PnlUserDepartmentList();
//        spltPane.setRightComponent(deptEmpPnl);
	}// GEN-LAST:event_btnDepartmentListActionPerformed

	private void btnProjectListActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnProjectListActionPerformed

	}// GEN-LAST:event_btnProjectListActionPerformed

	private void btnLocationListActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLocationListActionPerformed
//        PnlUserLocationList empLocLst = new PnlUserLocationList();
//        spltPane.setRightComponent(empLocLst);
	}// GEN-LAST:event_btnLocationListActionPerformed

	private void btnLogout1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLogout1ActionPerformed
		logOut();
	}// GEN-LAST:event_btnLogout1ActionPerformed

	private void btnEmpMyProfileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEmpMyProfileActionPerformed

	}// GEN-LAST:event_btnEmpMyProfileActionPerformed

	/* Xác nhận và đăng nhập hệ thống */
	private void logOut() {
		if (JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất khỏi hệ thống ?", "Thoát",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			this.dispose();
			LoginFrame frmlogin = new LoginFrame();
			frmlogin.setVisible(true);
			
		}
	}

	//////////////////////////////////////////////////////////////////////
	/*
	 * Phuong thuc load du lieu Cong trinh
	 */
	public void loadDSCT() throws SQLException {
		CongtrinhCtrl a = new CongtrinhCtrl();
		List<CongTrinh> temp = a.getDSCT();
		List<CongTrinh> temp1 = a.getDSCTView();
		System.out.println("Load Cong Trinh thanh cong");
		String arr[] = { "Mã CT", "Tên CT", "Địa Điểm", "Ngày Khởi Công", "Ngày Hoành Thành", "Ngày Cấp GPXD","Trang Thai","Ma DA","So luong NV"};
		tblDSCTmd = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			if (i>=temp1.size())
				tblDSCTmd.addRow(new Object[] { temp.get(i).getMaCT(), temp.get(i).getTenCT(), temp.get(i).getDiaChi(),
					temp.get(i).getNgayKhoiCong(), temp.get(i).getNgayHoanThanh(), temp.get(i).getNgayCapGPXD(),temp.get(i).getTrangthai(),temp.get(i).getMaDA(), temp.get(i).getSoluongNV() });
			else tblDSCTmd.addRow(new Object[] { temp.get(i).getMaCT(), temp.get(i).getTenCT(), temp.get(i).getDiaChi(),
					temp.get(i).getNgayKhoiCong(), temp.get(i).getNgayHoanThanh(), temp.get(i).getNgayCapGPXD(),temp.get(i).getTrangthai(),temp.get(i).getMaDA(), temp1.get(i).getSoluongNV() });
		}
		tableDSCTchuahoanthanh.setModel(tblDSCTmd);
		tableQLCT2.setModel(tblDSCTmd);

	}

	//////////////////////////////////////////////////////////////////////
	/*
	 * Phuong thuc load du lieu Nhan vien
	 */
	public void loadDSNV() throws SQLException {
		NhanVienCtrl a = new NhanVienCtrl();
		System.out.println("Load DS NV thanh cong");
		List<Nhanvien> temp = a.getDSNV();
		String arr[] = { "Mã NV", "Tên NV", "Ngày Sinh", "Giới Tính", "Địa CHỉ","Mã Phòng Ban" };
		tblDSNVmd = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			tblDSNVmd.addRow(new Object[] { temp.get(i).getMaNV(), temp.get(i).getTenNV(), temp.get(i).getNgaysinh(),
					temp.get(i).getGioitinh(), temp.get(i).getDiaChi(),temp.get(i).getMaPB() });
		}
		tableDSNV.setModel(tblDSNVmd);
		tableDSPCNV.setModel(tblDSNVmd);

	}

	//////////////////////////////////////////////////////////////////////
	/*
	 * Phuong thuc load du lieu Du An
	 */
	public void loadDSDA() throws SQLException {
		DuAnCtrl a = new DuAnCtrl();
		List<DuAn> temp = a.getDSDA();
		dsmdan = new String[temp.size()];
		String arr[] = { "Mã Dự Án", "Tên Dự Án", "Mã Nhân Viên Quản lý" };
		tblDSDAmd = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			dsmdan[i]= temp.get(i).getMaDA();
			tblDSDAmd.addRow(new Object[] { temp.get(i).getMaDA(), temp.get(i).getTenDA(),
					temp.get(i).getMaNVQLDA() });
		}
		tableDSDA.setModel(tblDSDAmd);

	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*
	 * Phuong Thuc Them COng Trinh
	 */
	public void addCT(String dc,String ma) throws SQLException {
		CongtrinhCtrl a = new CongtrinhCtrl();

		CongTrinh temp = new CongTrinh();
	//	temp.setMaCT(txtQLCTMa.getText());
		temp.setTenCT(txtQLCTTen.getText());
		temp.setDiaChi(dc);
		temp.setTrangthai(txtQLCTtrangthai.getText());
		temp.setMaDA(ma);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		try {
			temp.setNgayKhoiCong(df.parse(txtQLCtNgaykc.getText()));

			System.out.println(temp.getNgayKhoiCong());
			temp.setNgayHoanThanh(df.parse(txtQLCTNgayht.getText()));

			temp.setNgayCapGPXD(df.parse(txtQLCTCpxd.getText()));

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(temp);
		
		
		if (a.themCongTrinh(temp) == true) {
			JOptionPane.showMessageDialog(panelDSCT, "Thêm Công Trình Thành Công");

		} else {
			JOptionPane.showMessageDialog(panelDSCT, "Thêm Không Thành Công");
		}
		loadDSCT();
		ClearQLCT();
	}

//////////////////////////////////////////////////////////////////////////////////
	/*
	 * Phuong Thuc them Du An
	 */
	public void addDA() throws SQLException {
		DuAnCtrl a = new DuAnCtrl();
		DuAn temp = new DuAn();
		//temp.setMaDA(txtDAma.getText());
		temp.setTenDA(txtDAten.getText());
		temp.setMaNVQLDA(txtDAmamain.getText());
		if (a.themDuAn(temp) == true) {
			JOptionPane.showMessageDialog(pDA, "Thêm Dự Án Thành Công");
		} else {
			JOptionPane.showMessageDialog(pDA, "Thêm Không Thành Công");
		}
		loadDSDA();
	}

	//////////////////////////////////////////////////////////////////////////////////////
	/*
	 * Phuong thuc them Nhan Vien
	 */
	public void addNV(String mapb,String tt) throws SQLException, ParseException {
		NhanVienCtrl a = new NhanVienCtrl();
		Nhanvien temp = new Nhanvien();

		//temp.setMaNV(txtNVma.getText());
		temp.setTenNV(txtNVten.getText());
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			temp.setNgaysinh(df.parse(txtNVdate.getText()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		temp.setGioitinh(cbNVsex.getSelectedItem().toString());
		temp.setDiaChi(tt);
		temp.setMaPB(mapb);
		System.out.println(mapb);
		if (a.themNhanVien(temp) == true) {
			JOptionPane.showMessageDialog(pNV, "Thêm Nhân Viên Thành Công");
		} else {
			JOptionPane.showMessageDialog(pNV, "Thêm Không Thành Công");
		}
		loadDSNV();
	}
	//////////////////////////////////////////////////////////////////////////////////////
	/*
	* Phuong thuc them CongViec
	*/
	public void addCVDD(String mact,String manv,String tenCV,Date Ngaybatdau,Date NgayDung) throws SQLException {
		CongViecCtrl a = new CongViecCtrl();
		CongViec temp = new CongViec();

		temp.setMaCT(mact);
		temp.setMaNV(manv);
		temp.setTenCV(tenCV);
		temp.setNgayBatDau(Ngaybatdau);
		temp.setNgayDung(NgayDung);
		System.out.println("Them Cong Viec");
		if (a.themCongViec(temp) == true) {
			JOptionPane.showMessageDialog(pPhanCong, "Thêm Công Việc Thành Công");
		} else {
			JOptionPane.showMessageDialog(pPhanCong, "Thêm Không Thành Công");
		}
	}
	///////////////////////////////////////////////////////////
	/*
	 * Mouse Click event
	 */
////////////// phuong thuc chon 1 nhan vien trong table nhan vien 
	public void tblDSNVmouse() {
		int i = tableDSNV.getSelectedRow();
		txtNVma.setText(tblDSNVmd.getValueAt(i, 0).toString());
		txtNVten.setText(tblDSNVmd.getValueAt(i, 1).toString());
		txtNVdate.setText(tblDSNVmd.getValueAt(i, 2).toString());		
		String option = tblDSNVmd.getValueAt(i, 3).toString();
		if (option.equalsIgnoreCase("Nam")) 
			cbNVsex.setSelectedItem("Nam");
		else
			cbNVsex.setSelectedItem("Nữ");
	}

	////////////////////////////////////////////////////////////////////////////////////
	///////////////////////// Phuong thuc chon 1 Du an trong table quan ly du an
	public void tblDSDAmouse() {
		int i = tableDSDA.getSelectedRow();
		txtDAma.setText(tblDSDAmd.getValueAt(i, 0).toString());
		txtDAten.setText(tblDSDAmd.getValueAt(i, 1).toString());
		txtDAmamain.setText(tblDSDAmd.getValueAt(i, 2).toString());
	}

	//////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////// Phuong thuc chon 1 cong tronh trong quan ly cong trinh
	public void tblQLCT2mouse() {
		int i = tableQLCT2.getSelectedRow();
		txtQLCTMa.setText(tblDSCTmd.getValueAt(i, 0).toString());
		txtQLCTTen.setText(tblDSCTmd.getValueAt(i, 1).toString());
		txtQLCtNgaykc.setText(tblDSCTmd.getValueAt(i, 3).toString());
		txtQLCTNgayht.setText(tblDSCTmd.getValueAt(i, 4).toString());
		txtQLCTCpxd.setText(tblDSCTmd.getValueAt(i, 5).toString());
		txtQLCTtrangthai.setText(tblDSCTmd.getValueAt(i, 6).toString());
	}
	

	///////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////
	/*
	 * Cac phungo thuc update
	 */
	////////////////// update cong trinh trong quan ly cong trinh
	public void updateCT(String dc,String ma) throws SQLException {
		CongtrinhCtrl a = new CongtrinhCtrl();
		int i = tableQLCT2.getSelectedRow();
		String tempstr = tblDSCTmd.getValueAt(i, 0).toString();
		CongTrinh temp = new CongTrinh();
		temp.setMaCT(txtQLCTMa.getText());
		temp.setTenCT(txtQLCTTen.getText());
		temp.setDiaChi(dc);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			temp.setNgayKhoiCong(df.parse(txtQLCtNgaykc.getText()));
			System.out.println(temp.getNgayKhoiCong());
			temp.setNgayHoanThanh(df.parse(txtQLCTNgayht.getText()));
			temp.setNgayCapGPXD(df.parse(txtQLCTCpxd.getText()));
		}catch (Exception e) {
			// TODO: handle exception
		}
		temp.setTrangthai(txtQLCTtrangthai.getText());
		temp.setMaDA(ma);
		

		if (a.updateCongTrinh(tempstr, temp) == true) {
			JOptionPane.showMessageDialog(panelDSCT, "Cập Nhật Công trình " + tempstr + " Thành Công");
		} else {
			JOptionPane.showMessageDialog(panelDSCT, "Cập Nhật Thất bai");
		}
		loadDSCT();
		ClearQLCT();
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////// Phuong thuc cap nhat nhan vien o quan ly nhan vien
	public void updateNV(String mapb,String dc) throws HeadlessException, SQLException {
		NhanVienCtrl a = new NhanVienCtrl();
		int i = tableDSNV.getSelectedRow();
		String tempstr = tblDSNVmd.getValueAt(i, 0).toString();
		Nhanvien temp = new Nhanvien();
		temp.setMaNV(txtNVma.getText());
		temp.setTenNV(txtNVten.getText());
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			temp.setNgaysinh(df.parse(txtNVdate.getText()));
		} catch (Exception e) {
			// TODO: handle exception
		}
		temp.setGioitinh(cbNVsex.getSelectedItem().toString());
		temp.setDiaChi(dc);
		temp.setMaPB(mapb);
		if (a.updateNhanVien(tempstr, temp) == true) {
			JOptionPane.showMessageDialog(pNV, "Cập Nhật Nhân Viên " + tempstr + " Thành Công");
		} else {
			JOptionPane.showMessageDialog(pNV, "Cập Nhật Không Thành Công");
		}
		loadDSNV();

	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////// phuong thuc cap nhat du an trong quan ly du an
	public void updateDA() throws HeadlessException, SQLException {
		DuAnCtrl a = new DuAnCtrl();
		int i = tableDSDA.getSelectedRow();
		String tempstr = tblDSDAmd.getValueAt(i, 0).toString();
		DuAn temp = new DuAn();
		temp.setTenDA(txtDAten.getText());
		temp.setMaNVQLDA(txtDAmamain.getText());
		if (a.updateDuAn(tempstr, temp) == true) {
			JOptionPane.showMessageDialog(pDA, "Cập Nhật Dự Án " + tempstr + " Thành Công");
		} else {
			JOptionPane.showMessageDialog(pDA, "Cập Nhật không thành công");
		}
		loadDSDA();
		
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/*
	 * các phương thức xóa dưu jans công trình nhân viên
	 */
///////////////////////phướng thức xóa công trình trong quan ly công trjinhf
	public void xoaCT() throws SQLException {
		CongtrinhCtrl a = new CongtrinhCtrl();
		int i = tableQLCT2.getSelectedRow();
		String tempstr = tblDSCTmd.getValueAt(i, 0).toString();

		if (a.xoaCongTrinh(tempstr) == true) {
			JOptionPane.showMessageDialog(panelDSCT, "Xóa Công trình " + tempstr + " Thành Công");
			ClearQLCT();
		} else {
			JOptionPane.showMessageDialog(panelDSCT, "Xóa Không Thành Công");
		}

		loadDSCT();
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////	
///////////////////////phướng thức xóa nhan viên trong quan ly nhân viên
	public void xoaNV() throws SQLException {
		NhanVienCtrl a = new NhanVienCtrl();
		int i = tableDSNV.getSelectedRow();
		String tempstr = tblDSNVmd.getValueAt(i, 0).toString();
		XoaCVn();
		if (a.xoaNhanVien(tempstr) == true) {
			JOptionPane.showMessageDialog(pNV, "Xóa Nhân Viên " + tempstr + " Thành Công");
		} else {
			JOptionPane.showMessageDialog(pNV, "Xóa Nhân Viên Không Thành Công");
		}
	
		loadDSNV();
	}
////////////////////////////////////////////////////////////////////////
//////// phuong thuc con sau khi xoa nhan vien thi xoa tat ca cong viec ma nhan vien do dang lam 
	public void XoaCVn() throws HeadlessException, SQLException {
		CongViecCtrl a = new CongViecCtrl();
		int  i = tableDSNV.getSelectedRow();
		String Manv = tableDSNV.getValueAt(i, 0).toString();
		a.XoaCongViecN(Manv);
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////	
///////////////////////phướng thức xóa Dự Án  trong quan ly dự án
	public void xoaDA() throws HeadlessException, SQLException {
		DuAnCtrl a = new DuAnCtrl();
		int i = tableDSDA.getSelectedRow();
		String tempstr = tblDSDAmd.getValueAt(i, 0).toString();
		if (a.xoaDuAn(tempstr) == true) {
			JOptionPane.showMessageDialog(pDA, "Xóa Dự Án " + tempstr + " Thành Công");
		} else {
			JOptionPane.showMessageDialog(pDA, "Xóa Dự Án Không Thành Công");
		}
		loadDSDA();
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////// Phuong thuc xoa Cong viec
	public void XoaCV() throws SQLException, ParseException {
		CongViecCtrl a = new CongViecCtrl();
		int i  = tableDSCV.getSelectedColumn();
		String Manv = tableDSCV.getValueAt(i, 4).toString();
		String Mact = ds[comboBox.getSelectedIndex()];
		if (a.XoaCongViec1(Manv, Mact) == true) {
			JOptionPane.showMessageDialog(pCongViec, "Xóa Công Việc Thành Công");
		}else {
			JOptionPane.showMessageDialog(pCongViec, "Xóa Công Viêc Không Thành Công");
		}
		loadDSCV(Mact);
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////	
///////////////////////phướng Search Test o quan ly cong trinh 
	public void searchTestQLCT() throws SQLException {
		Connection a = new ConnectSQL().getConnection();
		String temp = txtQLCTsearchtext.getText();
		System.out.println(temp);
		String sql = "select * from CongTrinh where TenCT like '%" + temp + "%';";
//	PreparedStatement pstm = a.prepareStatement(sql);
		Statement ptm = a.createStatement();
//	pstm.setString(1, temp);
		ResultSet rs = ptm.executeQuery(sql);
		String arr[] = { "Mã CT", "Tên CT", "Địa Điểm", "Ngày Khởi Công", "Ngày Hoành Thành", "Ngày Cấp GPXD","Trạng Thái","Mã Dự Án" };
		DefaultTableModel tblDSCTmdtest = new DefaultTableModel(arr, 0);
		while (rs.next()) {
			Vector value = new Vector();
			value.add(rs.getString(1));
			value.add(rs.getString(2));
			value.add(rs.getString(3));
			value.add(rs.getString(4));
			value.add(rs.getString(5));
			value.add(rs.getString(6));
			value.add(rs.getString(7));
			value.add(rs.getString(8));
			tblDSCTmdtest.addRow(value);
		}
		tableQLCT2.setModel(tblDSCTmdtest);
	}

////////////////////////////////////////////////////////////////////////////////////////
///////////// Phuong thuc search Test o quan ly Du An
	public void searchDAtest() throws SQLException {
		Connection a = new ConnectSQL().getConnection();
		String temp = txtDAsearchtext.getText();
		System.out.println(temp);
		String sql = "select * from DuAn where TenDA like '%" + temp + "%';";
//		PreparedStatement pstm = a.prepareStatement(sql);
		Statement ptm = a.createStatement();
//		pstm.setString(1, temp);	
		ResultSet rs = ptm.executeQuery(sql);
		String arr[] = { "Mã Dự Án", "Tên Dự Án", "Mã Nhân Viên Quản lý" };
		DefaultTableModel tblDSDAmdtest = new DefaultTableModel(arr, 0);
		while (rs.next()) {
			Vector value = new Vector();
			value.add(rs.getString(1));
			value.add(rs.getString(2));
			value.add(rs.getString(3));
			tblDSDAmdtest.addRow(value);
		}
		tableDSDA.setModel(tblDSDAmdtest);
	}

/////////////////////////////////////////////////////////////////////////////////////////
//////////// phuong thuc search test o quan ly nhan vien
	public void searchNVtest() throws SQLException {
		Connection a = new ConnectSQL().getConnection();
		String temp = txtNVsearchtext.getText();
		System.out.println(temp);
		String sql = "select * from NhanVien where TenNV like '%" + temp + "%'";
//		PreparedStatement pstm = a.prepareStatement(sql);
		Statement ptm = a.createStatement();
//		pstm.setString(1, temp);
		ResultSet rs = ptm.executeQuery(sql);
		String arr[] = { "Mã NV", "Tên NV", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Mã Phòng Ban" };
		DefaultTableModel tblDSNVmdtest = new DefaultTableModel(arr, 0);
		while (rs.next()) {
			Vector value = new Vector();
			value.add(rs.getString(1));
			value.add(rs.getString(2));
			value.add(rs.getString(3));
			value.add(rs.getString(4));
			value.add(rs.getString(5));
			value.add(rs.getString(6));
			tblDSNVmdtest.addRow(value);
		}
		tableDSNV.setModel(tblDSNVmdtest);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					new MainFrame().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	public void switchPanel(JPanel panel) {
		pnlHome.removeAll();
		pnlHome.add(panel);
		pnlHome.repaint();
		pnlHome.revalidate();
	}

	/* Quản trị */
	private void setAdminLayout() {
		scrlPaneLeftUser.setVisible(false);

		this.setTitle(this.getTitle() + " - SYSTEM ADMINISTRATOR");
	}

	/*
	 * Phong cửa sổ bình thường private void setUserLayout() {
	 * scrlpaneLeftAdmin.setVisible(false);//ẩn bảng Admin
	 * 
	 * scrlPaneLeftUser.setVisible(true);
	 * spltPane.setLeftComponent(this.scrlPaneLeftUser);//hiện và thêm bảng người
	 * dùng
	 * 
	 * this.setTitle(this.getTitle() + " - NORMAL USER"); }
	 */

	private void setFrameStyle() {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;

		setBounds((width - 1024) / 2, (height - 768) / 2, 935, 620);

		setIconImage((new ImageIcon("wire_transfer.png")).getImage());

		setFont(new Font("Verdana", Font.BOLD, 10));
		spltPane.add(pnlHome);
	}

	/////////////////////////////////////////////////////////////////////////
	/*
	 * cac phuong thuc xoa clear text field
	 */
	public void ClearQLCT() {
		txtQLCTMa.setText("");
		txtQLCTTen.setText("");
		txtQLCTCpxd.setText("");
		txtQLCTNgayht.setText("");
		txtQLCtNgaykc.setText("");
		txtQLCTtrangthai.setText("");
	}
	public void ClearQLDA() {
		txtDAten.setText("");
		txtDAmamain.setText("");
		txtDAma.setText("");
	}
	public void ClearQLNV() {
		txtNVdate.setText("");
		txtNVma.setText("");
		txtNVten.setText("");
		cbNVsex.setSelectedItem("Nam");
	}
	public String[] loadDSPB() throws SQLException {
		PhongBanCtrl a = new PhongBanCtrl();
		List<PhongBan> temp = a.getDSPB();
		String[] array = new String[temp.size()];
		dspb = new String[temp.size()];
		for (int i = 0; i < temp.size(); i++) {
			dspb[i] = temp.get(i).getMaPB();
		}
		for (int i = 0; i < temp.size(); i++) {
			array[i] = temp.get(i).getTenPB();
		}
		return array;
	}
	public String[] loadDSNVDieuDong() throws SQLException {
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
	public void loadDSNV(String mact) throws SQLException {
		DieuDongCtrl a = new DieuDongCtrl();
		System.out.println("Load DS NV thanh cong");
		List<Nhanvien> temp = a.getDSNV(mact);
		String arr[] = { "Mã NV", "Tên NV", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Mã Phòng Ban" };
		tblDSDD = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			tblDSDD.addRow(new Object[] { temp.get(i).getMaNV(), temp.get(i).getTenNV(), temp.get(i).getNgaysinh(),
					temp.get(i).getGioitinh(), temp.get(i).getDiaChi(),temp.get(i).getMaPB() });
		}
		tableDieuDong.setModel(tblDSDD);
	}
	////////////////////Dieu Dong//////////////////////////////////
	public void loadDSCTmoi(String mact) throws SQLException {
		DieuDongCtrl a = new DieuDongCtrl();
		List<CongTrinh> temp = a.getDSCTmoi(mact);
		System.out.println("Load Cong Trinh thanh cong");
		String arr[] = { "Mã CT", "Tên CT", "Địa Điểm", "Ngày Khởi Công", "Ngày Hoành Thành", "Ngày Cấp GPXD","Trang Thai","Ma DA"};
		tblDSCTmoi = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			tblDSCTmoi.addRow(new Object[] { temp.get(i).getMaCT(), temp.get(i).getTenCT(), temp.get(i).getDiaChi(),
					temp.get(i).getNgayKhoiCong(), temp.get(i).getNgayHoanThanh(), temp.get(i).getNgayCapGPXD(),temp.get(i).getTrangthai(),temp.get(i).getMaDA()});
		}
		tableDSCTmoi.setModel(tblDSCTmoi);
	}
	public boolean UpdateCVDung(Date ngaydung,String manv,String maCT) throws SQLException {
		CongViecCtrl a = new CongViecCtrl();
		return a.UppDateNgayDung(ngaydung, manv, maCT);
	}
	
	public void DieuDong(String n,String date,String datedung,String cv) throws HeadlessException, SQLException {
		DieuDongCtrl a = new DieuDongCtrl();
		DieuDong temp = new DieuDong();
		int index1 = tableDieuDong.getSelectedRow();
		int index2 = tableDSCTmoi.getSelectedRow();
		temp.setMaNV((String)tableDieuDong.getValueAt(index1,0));
		temp.setMaCTC(n);
		temp.setMaCTM((String)tableDSCTmoi.getValueAt(index2,0));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = new Date();
		
		if (((String)tableDSCTmoi.getValueAt(index2,6)).equals("Hoàn Thành")==false) {
			try {
				Date date2 = df.parse(date);
				Date date3 = df.parse(datedung);
				if (date2.compareTo(date1)>=0)
					temp.setNgaychuyen(df.parse(date));
				if (date3.compareTo(date2)>=0)
					temp.setNgaydung(df.parse(datedung));
	
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(temp.getMaNV());
			
			if (a.DieuDong(temp)== true && UpdateCVDung(temp.getNgaychuyen(),temp.getMaNV(),temp.getMaCTC())==true) {
					addCVDD(temp.getMaCTM(),temp.getMaNV(),cv,temp.getNgaychuyen(),temp.getNgaydung());
					JOptionPane.showMessageDialog(pDieuDong, "Điều động thành công");
				}
			else 	JOptionPane.showMessageDialog(pDieuDong, "Điều động thất bại","Inane error",JOptionPane.ERROR_MESSAGE);
			loadDSNV(n);
			loadDSCTmoi(n);
		}
		else JOptionPane.showMessageDialog(pDieuDong, "Không thể chọn công trình đã hoàn thành","Inane error",JOptionPane.ERROR_MESSAGE);
	}
	///////////////////////PhanCong/////////////////////
	public void loadDSCV(String n) throws SQLException, ParseException {
		CongViecCtrl a = new CongViecCtrl();
		String date = "1900-01-01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Load DS CV thanh cong");
		List<CongViec> temp = a.getCV(n);
		String arr[] = { "Mã CT", "Tên CV", "Ngày bắt đầu", "Ngày dừng", "Mã NV", "Tên NV" };
		tblDSCV = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			if (temp.get(i).getNgayDung().compareTo(sdf.parse(date))==0) {
				tblDSCV.addRow(new Object[] { temp.get(i).getMaCT(), temp.get(i).getTenCV(), temp.get(i).getNgayBatDau(),
						"Chua Co", temp.get(i).getMaNV(), temp.get(i).getTenNV()});
			}
			else tblDSCV.addRow(new Object[] { temp.get(i).getMaCT(), temp.get(i).getTenCV(), temp.get(i).getNgayBatDau(),
					temp.get(i).getNgayDung(), temp.get(i).getMaNV(), temp.get(i).getTenNV()});
			
		}
		tableDSCV.setModel(tblDSCV);
		
	}
	
	public void loadDSCTChuahoanthanh(String tt) throws SQLException {
		CongtrinhCtrl a = new CongtrinhCtrl();
		List<CongTrinh> temp = a.getDSCTChuaHoanThanh(tt);
		System.out.println("Load Cong Trinh thanh cong");
		String arr[] = { "Mã CT", "Tên CT", "Địa Điểm", "Ngày Khởi Công", "Ngày Hoành Thành", "Ngày Cấp GPXD","Trang Thai","Ma DA"};
		tblDSCTchuahoanthanh = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			tblDSCTchuahoanthanh.addRow(new Object[] { temp.get(i).getMaCT(), temp.get(i).getTenCT(), temp.get(i).getDiaChi(),
					temp.get(i).getNgayKhoiCong(), temp.get(i).getNgayHoanThanh(), temp.get(i).getNgayCapGPXD(),temp.get(i).getTrangthai(),temp.get(i).getMaDA() });
		}
		tableDSCTchuahoanthanh.setModel(tblDSCTchuahoanthanh);
	}
	public void PhanCong(Date ngaybatdau, Date ngaydung,String cv) throws SQLException {
		CongViec temp = new CongViec();
		int index1 = tableDSCTchuahoanthanh.getSelectedRow();
		int index2 = tableDSPCNV.getSelectedRow();
		temp.setMaCT((String)tableDSCTchuahoanthanh.getValueAt(index1,0));
		temp.setMaNV((String)tableDSPCNV.getValueAt(index2,0));
		temp.setTenCV(cv);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		temp.setNgayBatDau(ngaybatdau);
		temp.setNgayDung(ngaydung);
		addCVDD(temp.getMaCT(),temp.getMaNV(), temp.getTenCV(), temp.getNgayBatDau(), temp.getNgayDung());
	}
////////////////////////// THONG KE /////////////////////////
	public void loadDSTK() throws SQLException {
		DuAnCtrl a = new DuAnCtrl();
		List<ThongKe> temp = a.getDSDATK();
		System.out.println("Load TK thanh cong");
		String arr[] = { "Mã DA", "Tên DA", "Tên NVQL","Tổng số công trình","Tổng số nhân viên"};
		tblDSCTTK = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			tblDSCTTK.addRow(new Object[] { temp.get(i).getMaDA(), temp.get(i).getTenDA(), temp.get(i).getTenNV(),temp.get(i).getTongCT(),temp.get(i).getTongNV() });
		}
		tableTK.setModel(tblDSCTTK);
	}
	public void loadDSCTTK() throws SQLException {
		int index = tableTK.getSelectedRow();
		CongtrinhCtrl a = new CongtrinhCtrl();
		List<CongTrinh> temp = a.getDSCTView();
		System.out.println("Load Cong Trinh thanh cong");
		String arr[] = { "Mã CT", "Tên CT", "Địa Điểm","Trang Thai","So luong NV","So luong CV"};
		tblDSCTTK2 = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			if (temp.get(i).getMaDA().equals(tableTK.getValueAt(index,0)))
			tblDSCTTK2.addRow(new Object[] { temp.get(i).getMaCT(), temp.get(i).getTenCT(), temp.get(i).getDiaChi(),
					 temp.get(i).getTrangthai(), temp.get(i).getSoluongNV(), temp.get(i).getSoluongNV()});
		}	
		tableTK2.setModel(tblDSCTTK2);
	}
	public void loadDSCVTK() throws SQLException {
		int index = tableTK2.getSelectedRow();
		CongViecCtrl a = new CongViecCtrl();
		System.out.println("Load TKCong Viec thanh cong");
		List<ThongKe> temp = a.getDSCVTK((String) tableTK2.getValueAt(index,0));
		
		String arr[] = {"Tên công việc","So luong NV tham gia"};
		tblDSCTTK3 = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			tblDSCTTK3.addRow(new Object[] { temp.get(i).getTenCV(), temp.get(i).getTongNV()});
		}	
		tableTK3.setModel(tblDSCTTK3);
	}
	public void loadDSNVTK() throws SQLException {
		int index = tableTK2.getSelectedRow();
		NhanVienCtrl a = new NhanVienCtrl();
		List<ThongKe> temp = a.getDSNVTK((String) tableTK2.getValueAt(index,0));
		System.out.println("Load TKNhanVien thanh cong");
		String arr[] = {"Mã NV","Tên NV","Ngày công CT","Tổng ngày công"};
		tblDSCTTK4 = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			tblDSCTTK4.addRow(new Object[] {temp.get(i).getMaNV(),temp.get(i).getTenNV(), temp.get(i).getTongCT(), temp.get(i).getTongNV()});
		}	
		tableTK4.setModel(tblDSCTTK4);
	}
	public void loadDSNCTK() throws SQLException {
		int index = tableTK2.getSelectedRow();
		int index1 = tableTK4.getSelectedRow();
		ChamCongCtrl a = new ChamCongCtrl();
		List<ThongKe> temp = a.getDSNC((String) tableTK4.getValueAt(index1,0),(String) tableTK2.getValueAt(index,0));
		System.out.println(tableTK4.getValueAt(index1,0));
		String arr[] = {"Ngày Công"};
		tblDSCTTK6 = new DefaultTableModel(arr, 0);
		for (int i = 0; i < temp.size(); i++) {
			tblDSCTTK6.addRow(new Object[] { temp.get(i).getNgayCong()});
		}	
		tableTK6.setModel(tblDSCTTK6);
	}
	public void loadNVNC(int ma) throws SQLException {
		NhanVienCtrl a = new NhanVienCtrl();
		String arr[] = {"Mã NV","Tên NV","Ngày công"};
		tblDSCTTK5 = new DefaultTableModel(arr, 0);
		if (ma==0) {
			List<ThongKe> temp = a.getNVNCMIN();
			System.out.println("Load TKNhanVien thanh cong");
			for (int i = 0; i < temp.size(); i++) {
				tblDSCTTK5.addRow(new Object[] {temp.get(i).getMaNV(), temp.get(i).getTenNV(), temp.get(i).getTongCT()});
			}
		}
		else {
			List<ThongKe> temp = a.getNVNCMAX();
			System.out.println("Load TKNhanVien thanh cong");
			for (int i = 0; i < temp.size(); i++) {
				tblDSCTTK5.addRow(new Object[] {temp.get(i).getMaNV(), temp.get(i).getTenNV(), temp.get(i).getTongCT()});
			}
		}
		tableTK5.setModel(tblDSCTTK5);
	}
//////////////////////////////////////////////////////////////////////////////////////
///////////// cac ham phan quyen 
	public void TruongPhongBan() {
		mnNhanVien.setVisible(true);
		mnDn.setVisible(false);
		mnCongTrinh.setVisible(false);
		mnBaoCao.setVisible(false);

	}
	public void NhanVienQLDA() {
		mnNhanVien.setVisible(false);
		mnDn.setVisible(true);
		mnCongTrinh.setVisible(true);
		mnBaoCao.setVisible(true);

	}
	public void Admin() {
		System.out.println("chay Ham set admin");
		mnNhanVien.setVisible(true);
		mnDn.setVisible(true);
		mnCongTrinh.setVisible(true);
		mnBaoCao.setVisible(true);
		
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnDepartmentList;
	private javax.swing.JButton btnEmpMyProfile;
	private javax.swing.JButton btnEmpTransferManage;
	private javax.swing.JButton btnHomeEmp;
	private javax.swing.JButton btnLocationList;
	private javax.swing.JButton btnLogout1;
	private javax.swing.JButton btnProjectList;
	private javax.swing.JButton btnRequestTransfer;
	private javax.swing.JMenuBar menuBarMain;
	private javax.swing.JMenu mnUser;
	private javax.swing.JMenuItem mnuiExit;
	private javax.swing.JMenuItem mnuiLogout;
	private javax.swing.JPanel pnlHome;
	private javax.swing.JScrollPane scrlPaneLeftUser;
	private JPanel spltPane;
	private javax.swing.JScrollPane scrollPane_TK5;
	// End of variables declaration//GEN-END:variables
	private int EmployeeId;

	private JLabel lblMNhnVin;
	private JLabel lblTnNhnVin;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtNVsearchtext;
	private JLabel lblaCh;
	private JLabel lblAsd;

	private JPanel panelQLNVacction;
/////////////////////////////////////////////////////////
////////////// cac gia tri cua menu
	private JMenu mnNhanVien;
	private JMenuItem mnuiQLNV;
	private JMenuItem mnuiPhanCong;
	private JMenu mnDn;
	private JMenuItem mnuiQLDA;
	private JMenu mnCongTrinh;
	private JMenuItem mnuiQLCT;
	private JMenuItem mnuiDMK;
	private JLabel lblNewLabel_5;
	private JLabel txtINFOuserName;
	private JLabel lblChcV;
	private JLabel txtINFOuserWork;
//////////////////////////////////////////////
/////////// cac kieu table co trong chuong trinh   
	private JTable tableDSNV;
	private JTable tableDSCTchuahoanthanh;
	private JTable tableDSDA;
	private JTable tableQLCT2;
	private JTable tableDieuDong;
	private JTable tableDSCTmoi;
	private JTable tableDSCV;
	private JTable tableTK;
	private JTable tableTK2;
	private JTable tableTK3;
	private JTable tableTK4;
	private JTable tableTK5;
	private JTable tableTK6;
	//////////////////////////////////////////////////////
	/////////// cac gia tri cua table model
	private DefaultTableModel tblDSCTmd;
	private DefaultTableModel tblDSNVmd;
	private DefaultTableModel tblDSDD;
	private DefaultTableModel tblDSDAmd;
	private DefaultTableModel tblDSCTmoi;
	private DefaultTableModel tblDSCV;
	private DefaultTableModel tblDSCTchuahoanthanh;
	private DefaultTableModel tblDSCTTK;
	private DefaultTableModel tblDSCTTK2;
	private DefaultTableModel tblDSCTTK3;
	private DefaultTableModel tblDSCTTK4;
	private DefaultTableModel tblDSCTTK5;
	private DefaultTableModel tblDSCTTK6;
	////////////////////////////////////////
	////////// cac gia tri cua panel Du An
	private JTextField txtDAma;
	private JTextField txtDAten;
	private JTextField txtDAmamain;
	private JPanel panelDSDA;
	private JTextField txtDAsearchtext;
	private JPanel pDA;
/////////////////////////////////////////
////////// cac gia tri cua panel Nhan vien
	private JTextField txtNVten;
	private JTextField txtNVdate;
	private JTextField txtNVma;
	private JComboBox<String> cbNVsex;
	private JPanel panelDSNV;
	private JPanel pNV;
	private JButton btnQLCTadd;
	private JButton btnQLCTdel;
	private JButton btnQLCTupdate;
	private JPanel panelQLCTacction;
	private JTextField txtQLCTsearchtext;
	private JTextField txtQLCTNgayht;
	private JTextField txtQLCtNgaykc;
	private JTextField txtQLCTCpxd;
	private JTextField txtQLCTMa;
	private JTextField txtQLCTTen;
	private JLabel QLCTlb1;
	private JLabel QLCTlb2;
	private JLabel QLCTlb3;
	private JLabel QLCTlb4;
	private JLabel QLCTlb5;
	private JLabel QLCTlb6;
	private JLabel QLCTlb7;
	private JPanel pQLCT;
////////////////////////////////////////////////////
//////////////////////cac gia tri cua panel Phan Cong nhan vien 
	private JLabel PCNVlb0;
	private JLabel PCNVlb1;
	private JLabel PCNVlb2;
	private JLabel PCNVlb3;
	private JPanel panelDSCT;
	private JPanel pPhanCong;
	private JTextField txtQLCTtrangthai;
	private JLabel lblNewLabel_3;
	private JButton btnClearNV;
	private JButton btnClearDA;
	private JButton btnXaDLiu;
	private JTable tableDSPCNV;
	private JPanel pDieuDong;
	private JLabel lblBngiung;
	private JButton btDieuDong;
	private JPanel panel_2;
	private JScrollPane scrollPane_DieuDong;
	private JScrollPane scrollPane_CTmoi;
	private String[] ds;
	private String[] dspb;
	private String[] dsmdan;
	private JMenuItem mntmiung;
	private JPanel pCongViec;
	private JLabel label;
	private JPanel panel_3;
	private JScrollPane scrollPane_4;
	private JComboBox comboBox;
	private JMenu mnBaoCao;
	private JMenuItem mntmThngK;
	private JPanel pThongKe;
	private JLabel lblThngK;
	private JPanel panelTK;
	private JScrollPane scrollPaneTK;
	private JScrollPane scrollPaneTK2;
	private JScrollPane scrollPane_TK3;
	private JLabel lblCngVicTrong;
	private JLabel lblNhnVinTrong;
	private JLabel lblNewLabel_8;
	private JLabel lblTngCngTrnh;
	private JLabel lblTngCngTrnh_1;
	private JTextField txtTCT;
	private JTextField txtTNV;
	private JLabel lblNhnVinC;
	private JTextField txtTTPB;
	private JLabel lblTngSNvqlda;
	private JTextField txtTNVQLDA;
	private JLabel lblTngSTi;
	private JTextField txtTAC;
	private byte[] userimage;
	private JMenu mnCngVic;
	private JMenuItem mntmXemCngVic;
	private JPanel panel_1;
	private JLabel lblNewLabel_12;
	private JPanel panel_5;
	private JLabel lblNhpTnCng;
	private JPanel panel_6;
	private JComboBox comboBox_1;
	private JComboBox comboBox_NVDC;
	private JComboBox comboBox_CTDC;
	private JComboBox comboBox_MDA;
}
