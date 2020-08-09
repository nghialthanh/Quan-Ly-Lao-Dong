package Entity;

import java.util.Date;

public class Nhanvien {
	
// Khai bao cac bien su dung trong Nhan Vien	
	private String maNV;
	private String tenNV;
	private Date ngaysinh;
	private String gioitinh;
	private String DiaChi;
	private String maPB;
	private String NgayCong;
	
public String getNgayCong() {
		return NgayCong;
	}
	public void setNgayCong(String ngayCong) {
		NgayCong = ngayCong;
	}
	// Cac Phuong Thuc Getter/ Setter	
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getMaPB() {
		return maPB;
	}
	public void setMaPB(String maPB) {
		this.maPB = maPB;
	}

// Constructer Day Du 
	public Nhanvien(String maNV, String tenNV, Date ngaysinh, String gioitinh, String diaChi,
			String maPB) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.DiaChi = diaChi;
		this.maPB = maPB;
	}
	public Nhanvien() {
		
	}
	// Phuong Thuc To String	
	@Override
	public String toString() {
		return "Nhanvien [maNV=" + maNV + ", tenNV=" + tenNV + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh
				+ ", DiaChi=" + DiaChi + ", maPB=" + maPB + "]";
	}

	
	
}
