package Entity;

import java.util.Date;

public class ChamCong {
	private String MaNV;
	private String MaCT;
	private Date ngaycham;
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getMaCT() {
		return MaCT;
	}
	public void setMaCT(String maCT) {
		MaCT = maCT;
	}
	public Date getNgaycham() {
		return ngaycham;
	}
	public void setNgaycham(Date ngaycham) {
		this.ngaycham = ngaycham;
	}
	public ChamCong() {
		
	}
	public ChamCong(String manv, String mact,Date ngaycham) {
		this.MaCT= mact;
		this.MaNV = manv;
		this.ngaycham = ngaycham;
	}
}
