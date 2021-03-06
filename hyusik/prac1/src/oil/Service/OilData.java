package oil.Service;

import java.util.List;

import info.dto.OilDto;

public class OilData {
	private List<OilDto> oilgasol;
	private List<OilDto> oildisel;
	private List<OilDto> oillpg;

	public OilData(List<OilDto> oilgasol, List<OilDto> oildisel, List<OilDto> oillpg) {
		this.oilgasol=oilgasol;
		this.oildisel=oildisel;
		this.oillpg=oillpg;
	}

	public List<OilDto> getOilgasol() {
		return oilgasol;
	}

	public List<OilDto> getOildisel() {
		return oildisel;
	}

	public List<OilDto> getOillpg() {
		return oillpg;
	}
	

}
