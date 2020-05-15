package admin.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import info.dao.RestinfoDao;
import info.dto.RestinfoDto;
import info.service.InfoData;
import info.service.NotFoundException;
import jdbc.connection.ConnectionProvider;

public class AdminInfoService {
	private RestinfoDao restinfoDao=new RestinfoDao();
	
	public InfoData getRestInfo() {
		try(Connection conn=ConnectionProvider.getConnection()){ 
			List<RestinfoDto> restinfo=restinfoDao.selectName(conn);
			if(restinfo==null)
				throw new NotFoundException();
			return new InfoData(restinfo);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
