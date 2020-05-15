package info.dto;

public class OilconDto {
	private Integer oilconno;
	private int restno;
	private String oilconname;
	private String oilconde;
	
	
	public OilconDto(String oilconname, String oilconde) {
		this.oilconname=oilconname;
		this.oilconde=oilconde;
	}
	public Integer getOilconno() {
		return oilconno;
	}
	public void setOilconno(Integer oilconno) {
		this.oilconno = oilconno;
	}
	public int getRestno() {
		return restno;
	}
	public void setRestno(int restno) {
		this.restno = restno;
	}
	public String getOilconname() {
		return oilconname;
	}
	public void setOilconname(String oilconname) {
		this.oilconname = oilconname;
	}
	public String getOilconde() {
		return oilconde;
	}
	public void setOilconde(String oilconde) {
		this.oilconde = oilconde;
	}
}
