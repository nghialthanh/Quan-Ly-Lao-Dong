package Entity;

public class PhongBan {
// khia bao cac bien 
	private String maPB;
	private String tenPB;
	private String maTPB;
// Phuong thuc get/ set	
	public String getMaPB() {
		return maPB;
	}
	public void setMaPB(String maPB) {
		this.maPB = maPB;
	}
	public String getTenPB() {
		return tenPB;
	}
	public void setTenPB(String tenPB) {
		this.tenPB = tenPB;
	}
	public String getMaTPB() {
		return maTPB;
	}
	public void setMaTPB(String maTPB) {
		this.maTPB = maTPB;
	}
//Constructor day du 
	public PhongBan(String maPB, String tenPB, String maTPB) {
		super();
		this.maPB = maPB;
		this.tenPB = tenPB;
		this.maTPB = maTPB;
	}
public PhongBan() {
		// TODO Auto-generated constructor stub
	}
	// ToString
	@Override
	public String toString() {
		return "PhongBan [maPB=" + maPB + ", tenPB=" + tenPB + ", maTPB=" + maTPB + "]";
	}
	
	
}
