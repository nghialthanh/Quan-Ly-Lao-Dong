package Entity;

public class TruongPhongBan {
// Khai bao bien 
	private String maTPB;
	private String tenTPB;
	private String taikhoanTPB;
	private String DiaChi;
// Get SEt
	public String getMaTPB() {
		return maTPB;
	}
	public void setMaTPB(String maTPB) {
		this.maTPB = maTPB;
	}
	public String getTenTPB() {
		return tenTPB;
	}
	public void setTenTPB(String tenTPB) {
		this.tenTPB = tenTPB;
	}
	public String getTaikhoanTPB() {
		return taikhoanTPB;
	}
	public void setTaikhoanTPB(String taikhoanTPB) {
		this.taikhoanTPB = taikhoanTPB;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
// Constructor
	public TruongPhongBan(String maTPB, String tenTPB, String taikhoanTPB, String diaChi) {
		super();
		this.maTPB = maTPB;
		this.tenTPB = tenTPB;
		this.taikhoanTPB = taikhoanTPB;
		DiaChi = diaChi;
	}
// toString
	@Override
	public String toString() {
		return "TruongPhongBan [maTPB=" + maTPB + ", tenTPB=" + tenTPB + ", taikhoanTPB=" + taikhoanTPB + ", DiaChi="
				+ DiaChi + "]";
	}
	

	
	
	

	

	
	

}
