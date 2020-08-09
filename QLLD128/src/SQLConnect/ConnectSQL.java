package SQLConnect;

import java.sql.*;

public class ConnectSQL {
	 static Connection conn = null;
	 
	 
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection a = new ConnectSQL().getConnection();	
	}
	public Connection getConnection() throws SQLException {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=QLLD;intergratedSecurity = true";
			conn = DriverManager.getConnection(url, "sa", "sapassword");
			if(conn != null) {
				System.out.println("Thanh cong");
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public Connection cutConnection() throws SQLException
	{
		if(conn !=null)
		{
			conn.close();
		}
		return conn;
	}

}
