package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entity.CongTrinh;
import Entity.CongViec;
import Entity.Nhanvien;
import Entity.ThongKe;
import SQLConnect.ConnectSQL;

public class CongViecCtrl {
	
	public CongViecCtrl(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<CongViec> getCV(String mact) throws SQLException {
		List<CongViec> a = null;
		a = new ArrayList<CongViec>();
		Connection b = new ConnectSQL().getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "Select * from View_CongViec where MaCT='"+mact+"'";
		stm = b.createStatement();
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			CongViec c = new CongViec();
			c.setMaCT(rs.getString(1));
			c.setTenCV(rs.getString(2));
			c.setNgayBatDau(rs.getDate(3));
			c.setNgayDung(rs.getDate(4));
			c.setMaNV(rs.getString(5));
			c.setTenNV(rs.getNString(6));
			a.add(c);
			} 
		return a;
	}
	public boolean UppDateNgayDung(Date ngaydung,String manv,String maCT) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		String sql = "update CongViec set NgayDung=? where MaNV=? and MaCT=?";
		PreparedStatement pstm = b.prepareStatement(sql);
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(ngaydung);
			pstm.setString(1,date);
			pstm.setString(2,manv);
			pstm.setString(3,maCT);
			return pstm.executeUpdate() >0;		
		}catch (Exception e) {
			System.err.println(e.getMessage()+ e.getCause());
		}
		return false;
	}
	public boolean themCongViec(CongViec a) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		System.out.println("Chay ham them Cong viec ");
		String sql = "Insert into CongViec(MaCT,MaNV,TenCV,Ngaybatdau,NgayDung)"
				+ "values(?,?,?,?,?)";
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(a.getNgayBatDau());
			String date2 = sdf.format(a.getNgayDung());
		//	System.out.println(date+ "//////"+ date2+"////////////////"+date3);
			
			PreparedStatement pstm = b.prepareStatement(sql);
			//pstm.setString(1,a.getMaCT());
			pstm.setString(1,a.getMaCT());
			pstm.setString(2,a.getMaNV());
			pstm.setString(3,a.getTenCV());;
			pstm.setString(4,date);
			pstm.setString(5,date2);

			return pstm.executeUpdate() >0;		
		
		} catch (Exception e) {
			System.err.println(e.getMessage()+ e.getCause()+ e.getClass());
		}
		return false;

	}
	public boolean XoaCongViec1(String Manv,String Mact) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		System.out.println("Chay ham xoa cong viec ");	
		System.out.println(Manv+Mact);
		String sql = "delete from CongViec where MaCT = ? and MaNV = ?";
		PreparedStatement pstm = b.prepareStatement(sql);
		try {
			pstm.setString(2, Manv);
			pstm.setString(1, Mact);
			return pstm.executeUpdate() > 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return false;
		
	}
	public boolean XoaCongViecN(String Manv) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		System.out.println("Chay ham xoa cong viec ");	
		System.out.println(Manv);
		String sql = "delete from CongViec where MaNV = ?";
		PreparedStatement pstm = b.prepareStatement(sql);
		try {
			pstm.setString(1, Manv);
	
			return pstm.executeUpdate() > 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return false;
	}
	//////////////////////Thong Ke////////////////////////////////
	public List<ThongKe> getDSCVTK(String mact) throws SQLException{
		List<ThongKe> a = null;
		a = new ArrayList<ThongKe>();
		Connection b = new ConnectSQL().getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "Select * from dbo.func_TKCV('"+mact+"')";
		stm = b.createStatement();
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			ThongKe c = new ThongKe();
			c.setTenCV(rs.getString(1));
			c.setTongNV(rs.getInt(2));
			a.add(c);
			} 
		return a;
	}
}
