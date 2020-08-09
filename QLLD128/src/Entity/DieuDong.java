package Entity;

import java.util.Date;

public class DieuDong {
	private String MaNV;
	private String MaCTC;
	private String MaCTM;
	private Date ngaychuyen;
	private Date ngaydung;
	public Date getNgaydung() {
		return ngaydung;
	}
	public void setNgaydung(Date ngaydung) {
		this.ngaydung = ngaydung;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getMaCTC() {
		return MaCTC;
	}
	public void setMaCTC(String maCTC) {
		MaCTC = maCTC;
	}
	public String getMaCTM() {
		return MaCTM;
	}
	public void setMaCTM(String maCTM) {
		MaCTM = maCTM;
	}
	public Date getNgaychuyen() {
		return ngaychuyen;
	}
	public void setNgaychuyen(Date ngaychuyen) {
		this.ngaychuyen = ngaychuyen;
	}
	
	public DieuDong() {
		
	}
	public DieuDong(String manv,String mactc, String mactm,Date ngaychuyen,Date ngaydung) {
		this.MaNV = manv;
		this.MaCTC = mactc;
		this.MaCTM = mactm;
		this.ngaychuyen = ngaychuyen;
		this.ngaydung = ngaydung;
	}
	
}
