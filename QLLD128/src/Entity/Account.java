package Entity;

import java.util.Arrays;

public class Account {
// Khai bai bien 
	private String taikhoan;
	private String matkhau;
	private String chucvu;
	private byte[] anh;
	// get Set
	public String getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
// conStructor

public Account() {
		// TODO Auto-generated constructor stub
	}
public byte[] getAnh() {
	return anh;
}
public void setAnh(byte[] anh) {
	this.anh = anh;
}
	//toString
	public Account(String taikhoan, String matkhau, String chucvu, byte[] anh) {
		super();
		this.taikhoan = taikhoan;
		this.matkhau = matkhau;
		this.chucvu = chucvu;
		this.anh = anh;
}
@Override
	public String toString() {
		return "Account [taikhoan=" + taikhoan + ", matkhau=" + matkhau + ", chucvu=" + chucvu + ", anh="
			+ Arrays.toString(anh) + "]";
}
	



}
