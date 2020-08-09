package Entity;

import java.util.Date;

public class CongTrinh {
	private String maCT;
	private String tenCT;
	private String diaChi;
	private Date ngayKhoiCong;
	private Date ngayHoanThanh;
	private Date ngayCapGPXD;
	private String trangthai;
	private String MaDA;
	private int soluongNV;
	private int soluongCV;
	
	public int getSoluongCV() {
		return soluongCV;
	}
	public void setSoluongCV(int soluongCV) {
		this.soluongCV = soluongCV;
	}
	public int getSoluongNV() {
		return soluongNV;
	}
	public void setSoluongNV(int soluongNV) {
		this.soluongNV = soluongNV;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}


	public String getMaDA() {
		return MaDA;
	}
	public void setMaDA(String maDA) {
		MaDA = maDA;
	}
	// get set
	public String getMaCT() {
		return maCT;
	}
	public void setMaCT(String maCT) {
		this.maCT = maCT;
	}
	public String getTenCT() {
		return tenCT;
	}
	public void setTenCT(String tenCT) {
		this.tenCT = tenCT;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public Date getNgayKhoiCong() {
		return ngayKhoiCong;
	}
	public void setNgayKhoiCong(Date ngayKhoiCong) {
		this.ngayKhoiCong = ngayKhoiCong;
	}
	public Date getNgayHoanThanh() {
		return ngayHoanThanh;
	}
	public void setNgayHoanThanh(Date ngayHoanThanh) {
		this.ngayHoanThanh = ngayHoanThanh;
	}
	public Date getNgayCapGPXD() {
		return ngayCapGPXD;
	}
	public void setNgayCapGPXD(Date ngayCapGPXD) {
		this.ngayCapGPXD = ngayCapGPXD;
	}
//Construtor
	public CongTrinh(String maCT, String tenCT, String diaChi, Date ngayKhoiCong, Date ngayHoanThanh,
			Date ngayCapGPXD,String trangthai ,String maDA) {
		super();
		this.maCT = maCT;
		this.tenCT = tenCT;
		this.diaChi = diaChi;
		this.ngayKhoiCong = ngayKhoiCong;
		this.ngayHoanThanh = ngayHoanThanh;
		this.ngayCapGPXD = ngayCapGPXD;
		this.trangthai = trangthai;
		this.MaDA = maDA;
	}
public CongTrinh() {
	
	}
	//toString}
@Override
public String toString() {
	return "CongTrinh [maCT=" + maCT + ", tenCT=" + tenCT + ", diaChi=" + diaChi + ", ngayKhoiCong=" + ngayKhoiCong
			+ ", ngayHoanThanh=" + ngayHoanThanh + ", ngayCapGPXD=" + ngayCapGPXD + ", trangthai=" + trangthai
			+ ", MaDA=" + MaDA + "]";
}

}
