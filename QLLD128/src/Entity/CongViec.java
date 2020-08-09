package Entity;

import java.util.Date;

public class CongViec {
	private String maCT;
	private String maNV;
	private String TenCV;
	private String TenNV;
	private Date ngayBatDau;
	private Date ngayDung;
//get set
	public String getTenNV() {
		return TenNV;
	}
	public void setTenNV(String tenNV) {
		TenNV = tenNV;
	}
	public String getTenCV() {
		return TenCV;
	}
	public void setTenCV(String tenCV) {
		TenCV = tenCV;
	}
	public String getMaCT() {
		return maCT;
	}
	public void setMaCT(String maCT) {
		this.maCT = maCT;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public Date getNgayBatDau() {
		return ngayBatDau;
	}
	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}
	public Date getNgayDung() {
		return ngayDung;
	}
	public void setNgayDung(Date ngayDung) {
		this.ngayDung = ngayDung;
	}
//Consstructor
	public CongViec() {
		
	}
	public CongViec(String maCT, String maNV, String ten,String tennv, Date ngayBatDau, Date ngayDung) {
		super();
		this.maCT = maCT;
		this.maNV = maNV;
		this.TenNV = tennv;
		this.TenCV = ten;
		this.ngayBatDau = ngayBatDau;
		this.ngayDung = ngayDung;
	}

}
