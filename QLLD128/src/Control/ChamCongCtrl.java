package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entity.ChamCong;
import Entity.CongTrinh;
import Entity.DuAn;
import Entity.Nhanvien;
import Entity.ThongKe;
import SQLConnect.ConnectSQL;
public class ChamCongCtrl {

	public ChamCongCtrl() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Nhanvien>  getDSNV(String maCT,String ngaycham) throws SQLException{
		List<Nhanvien> a = null;
		a = new ArrayList<Nhanvien>();
		Connection b = new ConnectSQL().getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "select * from dbo.func_NV('"+maCT+"','"+ngaycham+"')";
		stm = b.createStatement();
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			Nhanvien c = new Nhanvien();
			c.setMaNV(rs.getString(1));
			c.setTenNV(rs.getNString(2));
			a.add(c);
			} 
		return a;
	}
	public boolean ChamCongNV(ChamCong a) throws SQLException {
		Connection b = new ConnectSQL().getConnection();
		System.out.println("Chay ham cham cong nhan vien ");
		String sql = "insert into ChamCong(MaNV,MaCT,NgayChamCong)"
				+ "values(?,?,?)";

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(a.getNgaycham());
			PreparedStatement pstm = b.prepareStatement(sql);
			//pstm.setString(1,a.getMaNV());
			pstm.setString(1,a.getMaNV());
			pstm.setString(2,a.getMaCT());
			pstm.setString(3,date);;
			return pstm.executeUpdate() >0;		
		
		} catch (Exception e) {
			System.err.println(e.getMessage()+ e.getCause());
		}
		return false;
	}
	public List<ThongKe>  getDSNC(String maNV,String maCT) throws SQLException{
		List<ThongKe> a = null;
		a = new ArrayList<ThongKe>();
		Connection b = new ConnectSQL().getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "select * from dbo.func_TKNC('"+maNV+"','"+maCT+"')";
		stm = b.createStatement();
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			ThongKe c = new ThongKe();
			c.setNgayCong(rs.getString(1));
			a.add(c);
			} 
		return a;
	}
}
