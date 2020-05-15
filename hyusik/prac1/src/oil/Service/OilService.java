package oil.Service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import info.dao.OilDao;
import info.dto.OilDto;
import info.service.NotFoundException;
import jdbc.connection.ConnectionProvider;

public class OilService {
	
	private OilDao oilDao=new OilDao();
	
	public OilData getOil() {
		try(Connection conn=ConnectionProvider.getConnection()) {
			System.out.println("OilService");
			List<OilDto> oilgasol=oilDao.selectgasol(conn);
			if(oilgasol==null)
				throw new NotFoundException();
			List<OilDto> oildisel=oilDao.selectdisel(conn);
			if(oildisel==null)
				throw new NotFoundException();
			List<OilDto> oillpg=oilDao.selectlpg(conn);
			if(oillpg==null)
				throw new NotFoundException();
			return new OilData(oilgasol,oildisel,oillpg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
