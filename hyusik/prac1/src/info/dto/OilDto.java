package info.dto;

public class OilDto {
	private int restno;
	private String oilname;
	private String oiltel;
	private int gasoline;
	private int disel;
	private int lpg;
	private String company;
	private int air;
	private int cleaner;
	private int mat;
	
	
	public OilDto(String oilname, String oiltel, int gasoline, int disel, int lpg,
			String company,int air, int cleaner, int mat) {
		this.oilname=oilname;
		this.oiltel=oiltel;
		this.gasoline=gasoline;
		this.disel=disel;
		this.lpg=lpg;
		this.company=company;
		this.air=air;
		this.cleaner=cleaner;
		this.mat=mat;
	}
	public OilDto(String oilname, int gasoline, int disel, int lpg) {
		this.oilname=oilname;
		this.gasoline=gasoline;
		this.disel=disel;
		this.lpg=lpg;
	}
	public int getRestno() {
		return restno;
	}
	public void setRestno(int restno) {
		this.restno = restno;
	}
	public String getOilname() {
		return oilname;
	}
	public void setOilname(String oilname) {
		this.oilname = oilname;
	}
	public String getOiltel() {
		return oiltel;
	}
	public void setOiltel(String oiltel) {
		this.oiltel = oiltel;
	}
	public int getGasoline() {
		return gasoline;
	}
	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}
	public int getDisel() {
		return disel;
	}
	public void setDisel(int disel) {
		this.disel = disel;
	}
	public int getLpg() {
		return lpg;
	}
	public void setLpg(int lpg) {
		this.lpg = lpg;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getAir() {
		return air;
	}
	public void setAir(int air) {
		this.air = air;
	}
	public int getCleaner() {
		return cleaner;
	}
	public void setCleaner(int cleaner) {
		this.cleaner = cleaner;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
}
