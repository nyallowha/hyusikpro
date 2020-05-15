package info.dto;


public class RestinfoDto {
	private int restno;
	private String restname;
	private String theme;
	private String themede;
	private String resttel;
	private String restadd;
	private String firstfood;
	private String truck;
	private String maintenance;
	private String wifi;
	private int m_toilet;
	private int w_toilet;
	private int topark;
	private int spark;
	private int bpark;
	private String jpark;
	private String block;
	private String pregnant;
	
	
	public RestinfoDto(String restname,String theme, String themede, String resttel, String restadd, String firstfood, String truck, String maintenance,
			String wifi, int m_toilet, int w_toilet, int topark, int spark, int bpark, String jpark, String block,
			String pregnant) {
		this.restname=restname;
		this.theme=theme;
		this.themede=themede;
		this.resttel=resttel;
		this.restadd=restadd;
		this.firstfood=firstfood;
		this.truck=truck;
		this.maintenance=maintenance;
		this.wifi=wifi;
		this.m_toilet=m_toilet;
		this.w_toilet=w_toilet;
		this.topark=topark;
		this.spark=spark;
		this.bpark=bpark;
		this.jpark=jpark;
		this.block=block;
		this.pregnant=pregnant;
		
	}
	

	public RestinfoDto(int restno, String restname) {
		this.restno=restno;
		this.restname=restname;
	}

	public int getRestno() {
		return restno;
	}
	public void setRestno(int restno) {
		this.restno = restno;
	}
	public String getRestname() {
		return restname;
	}
	public void setRestname(String restname) {
		this.restname = restname;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getThemede() {
		return themede;
	}
	public void setThemede(String themede) {
		this.themede = themede;
	}
	public String getResttel() {
		return resttel;
	}
	public void setResttel(String resttel) {
		this.resttel = resttel;
	}
	public String getRestadd() {
		return restadd;
	}
	public void setRestadd(String restadd) {
		this.restadd = restadd;
	}
	public String getFirstfood() {
		return firstfood;
	}
	public void setFirstfood(String firstfood) {
		this.firstfood = firstfood;
	}
	public String getTruck() {
		return truck;
	}
	public void setTruck(String truck) {
		this.truck = truck;
	}
	public String getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(String maintenance) {
		this.maintenance = maintenance;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public int getM_toilet() {
		return m_toilet;
	}
	public void setM_toilet(int m_toilet) {
		this.m_toilet = m_toilet;
	}
	public int getW_toilet() {
		return w_toilet;
	}
	public void setW_toilet(int w_toilet) {
		this.w_toilet = w_toilet;
	}
	public int getTopark() {
		return topark;
	}
	public void setTopark(int topark) {
		this.topark = topark;
	}
	public int getSpark() {
		return spark;
	}
	public void setSpark(int spark) {
		this.spark = spark;
	}
	public int getBpark() {
		return bpark;
	}
	public void setBpark(int bpark) {
		this.bpark = bpark;
	}
	public String getJpark() {
		return jpark;
	}
	public void setJpark(String jpark) {
		this.jpark = jpark;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public String getPregnant() {
		return pregnant;
	}
	public void setPregnant(String pregnant) {
		this.pregnant = pregnant;
	}

}
