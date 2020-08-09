package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entity.DuAn;
import Entity.ThongKe;
import SQLConnect.ConnectSQL;

public class DuAnCtrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<DuAn>  getDSDA() throws SQLException{
		List<DuAn> a = null;
		a = new ArrayList<DuAn>();
		Connection b = new ConnectSQL().getConnection();
	
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "Select * from DuAn";
		
		stm = b.createStatement();
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			DuAn c = new DuAn();
			c.setMaDA(rs.getString(1));
			c.setTenDA(rs.getNString(2));
			//c.setMaCT(rs.getString(3));
			c.setMaNVQLDA(rs.getString(3));
			a.add(c); 
		} 
		return a;
	
		}
	public boolean themDuAn(DuAn a) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		System.out.println("CHay ham them Du An ");
		String sql = "Insert into DuAn(TenDA,MaNVQLDA)"
				+ "values(?,?)";

		try {
			PreparedStatement pstm = b.prepareStatement(sql);
		//	pstm.setString(1,a.getMaDA());
			pstm.setString(1,a.getTenDA());
			pstm.setString(2,a.getMaNVQLDA());
			return pstm.executeUpdate() >0;		
		
		} catch (Exception e) {
			System.err.println(e.getMessage()+ e.getCause());
		}
		return false;	
	}
	public boolean updateDuAn(String mada, DuAn a) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		String sql = "update DuAn set TenDA=?,MaNVQLDA=? where MaDA=?";
		PreparedStatement pstm = b.prepareStatement(sql);
		try {
			
			pstm.setString(1,a.getTenDA());
			pstm.setString(2,a.getMaNVQLDA());
			pstm.setString(3, mada);
			return pstm.executeUpdate() >0;		
		
		} catch (Exception e) {
			System.err.println(e.getMessage()+ e.getCause());
		}
		return false;	
	}
	public boolean xoaDuAn(String mada) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql1 = "Select * from CongTrinh where MaDA='"+mada+"'";
		
		stm = b.createStatement();
		rs = stm.executeQuery(sql1);
		while (rs.next()) {
			String c = rs.getString(1);
			CongtrinhCtrl a = new CongtrinhCtrl();
			a.xoaCongTrinh(c);
		}
		String sql = " delete from DuAn where MaDA=?";
		PreparedStatement pstm = b.prepareStatement(sql);
		try {
			pstm.setString(1, mada);
			return pstm.executeUpdate() > 0;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}
	public List<ThongKe> getDSDATK() throws SQLException{
		List<ThongKe> a = null;
		a = new ArrayList<ThongKe>();
		Connection b = new ConnectSQL().getConnection();
	
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "select * from view_TKCT";
		
		stm = b.createStatement();
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			ThongKe c = new ThongKe();
			c.setMaDA(rs.getString(1));
			c.setTenDA(rs.getNString(2));
			c.setTenNV(rs.getString(3));
			c.setTongCT(rs.getInt(4));
			c.setTongNV(rs.getInt(5));
			a.add(c); 
		} 
		return a;
	}
}
