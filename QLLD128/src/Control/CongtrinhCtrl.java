package Control;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;
import Entity.CongTrinh;


import SQLConnect.*;


public class CongtrinhCtrl {

		public CongtrinhCtrl() {
		
		}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
}
	public List<CongTrinh>  getDSCT() throws SQLException{
		// day la phan hien thi danh sach cong trinh 
		// day la phan hien thi danh sach cong trinh 
		//Khoi tao ket noi a
		List<CongTrinh> a = null;
		a = new ArrayList<CongTrinh>();
		Connection b = new ConnectSQL().getConnection();
	
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "Select * from CongTrinh";
		
		stm = b.createStatement(); 
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			CongTrinh c = new CongTrinh();
			c.setMaCT(rs.getString(1));
			c.setTenCT(rs.getNString(2));
			c.setDiaChi(rs.getNString(3));
			c.setNgayKhoiCong(rs.getDate(4));
			c.setNgayHoanThanh(rs.getDate(5));
			c.setNgayCapGPXD(rs.getDate(6));
			c.setTrangthai(rs.getNString(7));
			c.setMaDA(rs.getString(8));
			a.add(c);
		} 
		return a;
	
		}
	public boolean themCongTrinh(CongTrinh a) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		System.out.println("Chay ham them Cong trinh ");
		String sql = "Insert into CongTrinh(TenCT,DiaDiem,NgayKhoiCong,NgayKetThuc,NgayCapPhepXD,TrangThai,MaDA)"
				+ "values(?,?,?,?,?,?,?)";

		try {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(a.getNgayHoanThanh());
			String date2 = sdf.format(a.getNgayKhoiCong());
			String date3 = sdf.format(a.getNgayCapGPXD());
		//	System.out.println(date+ "//////"+ date2+"////////////////"+date3);
			
			PreparedStatement pstm = b.prepareStatement(sql);
			//pstm.setString(1,a.getMaCT());
			pstm.setString(1,a.getTenCT());
			pstm.setString(2,a.getDiaChi());
			pstm.setString(3, date);;
			pstm.setString(4,date2);
			pstm.setString(5,date3);
			pstm.setNString(6, a.getTrangthai());
			pstm.setString(7, a.getMaDA());
			return pstm.executeUpdate() >0;		
		
		} catch (Exception e) {
			System.err.println(e.getMessage()+ e.getCause()+ e.getClass());
		}
		return false;
	}
	public boolean updateCongTrinh (String mact,CongTrinh a) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		String sql = "update CongTrinh set TenCT=?,DiaDiem=?,NgayKhoiCong=?,NgayKetThuc=?,NgayCapPhepXD=?, TrangThai = ?, MaDA=? where MaCT=?";
		PreparedStatement pstm = b.prepareStatement(sql);
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(a.getNgayHoanThanh());
			String date2 = sdf.format(a.getNgayKhoiCong());
			String date3 = sdf.format(a.getNgayCapGPXD());
			pstm.setString(1,a.getTenCT());
			pstm.setString(2,a.getDiaChi());
			pstm.setString(3,date);
			pstm.setString(4,date2);
			pstm.setString(5,date3);
			pstm.setString(6, a.getTrangthai());
			pstm.setString(7, a.getMaDA());
			pstm.setString(8,mact);
			return pstm.executeUpdate() >0;		
		}catch (Exception e) {
			System.err.println(e.getMessage()+ e.getCause());
		}
		return false;
	}
	public boolean xoaCongTrinh (String mact) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		String sql = "delete from DieuDong where MaCTmoi=? and MaCTcu=? delete from ChamCong where MaCT=? delete from CongViec where MaCT=? delete from CongTrinh where MaCT=? ";
		PreparedStatement pstm = b.prepareStatement(sql);
		
		try {
			pstm.setString(1,mact);
			pstm.setString(2,mact);
			pstm.setString(3,mact);
			pstm.setString(4,mact);
			pstm.setString(5,mact);
			return pstm.executeUpdate() >0;	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}
	public List<CongTrinh>  getDSCTView() throws SQLException{
		List<CongTrinh> a = null;
		a = new ArrayList<CongTrinh>();
		Connection b = new ConnectSQL().getConnection();
	
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "Select * from view_CongTrinh";
		
		stm = b.createStatement(); 
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			CongTrinh c = new CongTrinh();
			c.setMaCT(rs.getString(1));
			c.setTenCT(rs.getNString(2));
			c.setDiaChi(rs.getNString(3));
			c.setNgayKhoiCong(rs.getDate(4));
			c.setNgayHoanThanh(rs.getDate(5));
			c.setNgayCapGPXD(rs.getDate(6));
			c.setTrangthai(rs.getNString(7));
			c.setMaDA(rs.getString(8));
			c.setSoluongNV(rs.getInt(9));
			c.setSoluongCV(rs.getInt(10));
			a.add(c);
		} 
		return a;
	
		}
	public List<CongTrinh>  getDSCTChuaHoanThanh(String tt) throws SQLException{
		List<CongTrinh> a = null;
		a = new ArrayList<CongTrinh>();
		Connection b = new ConnectSQL().getConnection();
	
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "Select * from CongTrinh where TrangThai!='"+tt+"'";
		
		stm = b.createStatement(); 
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			CongTrinh c = new CongTrinh();
			c.setMaCT(rs.getString(1));
			c.setTenCT(rs.getNString(2));
			c.setDiaChi(rs.getNString(3));
			c.setNgayKhoiCong(rs.getDate(4));
			c.setNgayHoanThanh(rs.getDate(5));
			c.setNgayCapGPXD(rs.getDate(6));
			c.setTrangthai(rs.getNString(7));
			c.setMaDA(rs.getString(8));
			a.add(c);
		} 
		return a;
	}
	/////////////Thong Ke ///////////////
	public int[] getTKCTtext() throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		int[] a= new int[6];
		java.sql.Statement stm = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		ResultSet rs3 = null;
		ResultSet rs4 = null;
		ResultSet rs5 = null;
		ResultSet rs6 = null;
		String sql2 = "Select count(MaCT) from CongTrinh";
		String sql1 = "Select count(MaDA) from DuAn";
		String sql3 = "Select count(MaNV) from NhanVien";
		String sql4 = "Select count(MaTPB) from TruongPhongBan";
		String sql5 = "Select count(MaNVQLDA) from NhanVienQLDA";
		String sql6 = "Select count(TaiKhoan) from Account";
		stm = b.createStatement(); 
		rs = stm.executeQuery(sql1);
		while (rs.next()) {
			a[0]= rs.getInt(1);
		} 
		rs2 = stm.executeQuery(sql2);
		while (rs2.next()) {
			a[1]= rs2.getInt(1);
		} 
		rs3 = stm.executeQuery(sql3);
		while (rs3.next()) {
			a[2]= rs3.getInt(1);
		} 
		rs4 = stm.executeQuery(sql4);
		while (rs4.next()) {
			a[3]= rs4.getInt(1);
		}
		rs5 = stm.executeQuery(sql5);
		while (rs5.next()) {
			a[4]= rs5.getInt(1);
		}
		rs6 = stm.executeQuery(sql6);
		while (rs6.next()) {
			a[5]= rs6.getInt(1);
		}
		return a;
	
	}
}
