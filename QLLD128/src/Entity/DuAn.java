package Entity;

public class DuAn {
//khai bao bien
	private String maDA;
	private String tenDA;
	
	private String maNVQLDA;
//Get set
	public String getMaDA() {
		return maDA;
	}
	public void setMaDA(String maDA) {
		this.maDA = maDA;
	}
	public String getTenDA() {
		return tenDA;
	}
	public void setTenDA(String tenDA) {
		this.tenDA = tenDA;
	}
	
	public String getMaNVQLDA() {
		return maNVQLDA;
	}
	public void setMaNVQLDA(String maNVQLDA) {
		this.maNVQLDA = maNVQLDA;
	}
//Constructor
	public DuAn(String maDA, String tenDA, String maNVQLDA) {
		super();
		this.maDA = maDA;
		this.tenDA = tenDA;
		this.maNVQLDA = maNVQLDA;
	}
	public DuAn() {
	
	}

	//toString

	

}
