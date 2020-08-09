package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Entity.CongTrinh;
import Entity.DuAn;
import Entity.Nhanvien;
import Entity.ThongKe;
import SQLConnect.ConnectSQL;

public class NhanVienCtrl {

	public NhanVienCtrl() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Nhanvien>  getDSNV() throws SQLException{
		// day la phan hien thi danh sach nhan vien
		// day la phan hien thi danh sach nhan vien 
		//Khoi tao ket noi a
		List<Nhanvien> a = null;
		a = new ArrayList<Nhanvien>();
		Connection b = new ConnectSQL().getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "Select * from NhanVien";
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
	public boolean themNhanVien(Nhanvien a) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		System.out.println("CHay ham them Them Nhan Vien ");
		String sql = "insert into NhanVien(TenNV,NgaySinh,GioiTinh,DiaChi,MaPB)"
				+ "values(?,?,?,?,?)";

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(a.getNgaysinh());
			PreparedStatement pstm = b.prepareStatement(sql);
			//pstm.setString(1,a.getMaNV());
			pstm.setString(1,a.getTenNV());
			pstm.setString(2,date);
			pstm.setString(3,a.getGioitinh());
			pstm.setString(4,a.getDiaChi());
			pstm.setString(5,a.getMaPB());
			return pstm.executeUpdate() >0;		
		
		} catch (Exception e) {
			System.err.println(e.getMessage()+ e.getCause());
		}
		return false;	
	}
	public boolean updateNhanVien(String manv,Nhanvien a) throws SQLException {
		
		Connection b = new ConnectSQL().getConnection();
	
		String sql = "update NhanVien set TenNV=?,NgaySinh=?,GioiTinh=?,DiaChi=?,MaPB=? where MaNV=?";

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(a.getNgaysinh());
			PreparedStatement pstm1 = b.prepareStatement(sql);
			pstm1.setString(1,a.getTenNV());
			pstm1.setString(2,date);
			pstm1.setString(3,a.getGioitinh());
			pstm1.setString(4,a.getDiaChi());
			pstm1.setString(5,a.getMaPB());
			pstm1.setString(6, manv);
			return pstm1.executeUpdate() >0;		
		
		} catch (Exception e) {
			System.err.println(e.getMessage()+ e.getCause());
		}
		return false;	
		
	}
	public boolean xoaNhanVien(String manv) throws SQLException{
		Connection b = new ConnectSQL().getConnection();
		String sql = "delete from ChamCong where MaNV=? delete from DieuDong where MaNV=? delete from NhanVien where MaNV=?";
		PreparedStatement pstm = b.prepareStatement(sql);
		try {
			pstm.setString(1, manv);
			pstm.setString(2, manv);
			pstm.setString(3, manv);
			return pstm.executeUpdate() > 0;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
		
	}
	////////Thong ke/////////////////////
	public List<ThongKe> getDSNVTK(String mact) throws SQLException{
		List<ThongKe> a = null;
		a = new ArrayList<ThongKe>();
		Connection b = new ConnectSQL().getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "Select * from dbo.func_TKNV('"+mact+"')";
		stm = b.createStatement();
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			ThongKe c = new ThongKe();
			c.setMaNV(rs.getString(1));
			c.setTenNV(rs.getString(2));
			c.setTongNV(rs.getInt(3));
			c.setTongCT(rs.getInt(4));
			a.add(c);
			} 
		return a;
	}
	public List<ThongKe> getNVNCMIN() throws SQLException{
		List<ThongKe> a = null;
		a = new ArrayList<ThongKe>();
		Connection b = new ConnectSQL().getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		ResultSet rs1 = null;
		String sql = "select * from NhanVien n where not exists (select * from view_NhanVien v where v.MaNV=n.MaNV)";
		String sql1 = "select * from view_NhanVien where NgayCong<=all (select NgayCong from view_NhanVien)";
		stm = b.createStatement();
		rs = stm.executeQuery(sql);
		
		while (rs.next()) {
			ThongKe c = new ThongKe();
			c.setMaNV(rs.getString(1));
			c.setTenNV(rs.getString(2));
			c.setTongCT(0);
			a.add(c);
		}
		if (a.size()!=0)
			return a;
		else {			
			rs1 = stm.executeQuery(sql1);
			while (rs1.next()) {
				ThongKe c = new ThongKe();
				c.setMaNV(rs1.getString(1));
				c.setTenNV(rs1.getString(2));
				c.setTongCT(rs1.getInt(6));
				a.add(c);
			}
			return  a;
		}
	}
	public List<ThongKe> getNVNCMAX() throws SQLException{
		List<ThongKe> a = null;
		a = new ArrayList<ThongKe>();
		Connection b = new ConnectSQL().getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "select * from view_NhanVien where NgayCong>=all (select NgayCong from view_NhanVien)";
		stm = b.createStatement();
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			ThongKe c = new ThongKe();
			c.setMaNV(rs.getString(1));
			c.setTenNV(rs.getString(2));
			c.setTongCT(rs.getInt(6));
			a.add(c);
		}
		return a;
	}
}
