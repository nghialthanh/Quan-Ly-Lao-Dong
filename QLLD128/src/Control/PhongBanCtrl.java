package Control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.Nhanvien;
import Entity.PhongBan;
import SQLConnect.ConnectSQL;

public class PhongBanCtrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public List<PhongBan> getDSPB() throws SQLException{
		List<PhongBan> a = null;
		a = new ArrayList<PhongBan>();
		Connection b = new ConnectSQL().getConnection();
		java.sql.Statement stm = null;
		ResultSet rs = null;
		String sql = "Select * from PhongBan";
		stm = b.createStatement();
		rs = stm.executeQuery(sql);
		while (rs.next()) {
			PhongBan c = new PhongBan();
			c.setMaPB(rs.getString(1));
			c.setTenPB(rs.getNString(2));
			a.add(c);
			} 
		return a;
	}

}
