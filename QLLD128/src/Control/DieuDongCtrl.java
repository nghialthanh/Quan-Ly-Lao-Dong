package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entity.CongTrinh;
import Entity.Nhanvien;
import Entity.DieuDong;
import SQLConnect.ConnectSQL;

public class DieuDongCtrl {
	public DieuDongCtrl() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Nhanvien>  getDSNV(String maCT) throws SQLException{
		List<Nhanvien> a = null;
		a = new ArrayList<Nhanvien>();
		Connection b = new ConnectSQL().getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "Select * from NhanVien join CongViec on NhanVien.MaNV = CongViec.MaNV where CongViec.MaCT='"+maCT+"'";
		stm = b.createStatement();
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			Nhanvien c = new Nhanvien();
			c.setMaNV(rs.getString(1));
			c.setTenNV(rs.getNString(2));
			c.setNgaysinh(rs.getDate(3));
			c.setGioitinh(rs.getString(4));
			c.setDiaChi(rs.getNString(5));
			c.setMaPB(rs.getString(6));
			a.add(c);
			} 
		return a;
	}
	public List<CongTrinh> getDSCTmoi(String maCT) throws SQLException{
		List<CongTrinh> a = null;
		a = new ArrayList<CongTrinh>();
		Connection b = new ConnectSQL().getConnection();
	
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "Select * from CongTrinh where MaCT !='"+maCT+"'";
		
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
	public boolean DieuDong(DieuDong a) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		System.out.println("Chay ham dieu dong nhan vien ");
		String sql = "insert into DieuDong(MaNV,MaCTcu,MaCTmoi,ngaychuyen)"
				+ "values(?,?,?,?)";		
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String date = sdf.format(a.getNgaychuyen());
				PreparedStatement pstm = b.prepareStatement(sql);
				pstm.setString(1,a.getMaNV());
				pstm.setString(2,a.getMaCTC());
				pstm.setString(3,a.getMaCTM());
				pstm.setString(4,date);;
				return pstm.executeUpdate() >0;		
			
			} catch (Exception e) {
				System.err.println(e.getMessage()+ e.getCause());
			}
			return false;
	}
	public boolean KtrDate(String ngay1,String ngay2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(ngay1);
		Date date2 = sdf.parse(ngay2);
		if (date1.compareTo(date2)>=0)
			return true;
		return false;
	}
}
