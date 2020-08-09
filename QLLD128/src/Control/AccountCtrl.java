package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import Entity.Account;
import SQLConnect.ConnectSQL;

public class AccountCtrl {
	public AccountCtrl() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Account getAccount (String tentaikhoan) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		String sql = "Select * from Account where TaiKhoan = '"+tentaikhoan+"'";
		Statement stm = b.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		if (!rs.next()) {
			return null;
		}
		Account temp = new Account();
		temp.setTaikhoan(rs.getString(1));
		temp.setMatkhau(rs.getString(2));
		temp.setChucvu(rs.getString(3));
		temp.setAnh(rs.getBytes(4));
		return temp;
	}
	public Boolean CheckAccount (Account a, Account b) {
		if (a.getMatkhau().compareTo(b.getMatkhau()) == 0) {
			return true;
		}
		return false;
		
	}
	public boolean themAccount(Account a) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		System.out.println("Chay ham them tai hoan");
		String sql = "insert into Account( TaiKhoan,MatKhau,ChucVu,Anh ) values (?,?,?,?)";
		PreparedStatement pstm  = b.prepareStatement(sql);
		try {
			pstm.setString(1,a.getTaikhoan());
			pstm.setString(2, a.getMatkhau());
			pstm.setNString(3,a.getChucvu());
			pstm.setBytes(4,a.getAnh());
			return pstm.executeUpdate() >0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean upAccount(String tentk,String mk) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		
		String sql = "update Account set MatKhau=? where TaiKhoan=?";

			try {
				PreparedStatement pstm1 = b.prepareStatement(sql);
				pstm1.setString(1,mk);
				pstm1.setString(2,tentk);
				return pstm1.executeUpdate() >0;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		

		return false;
	}

	

}
