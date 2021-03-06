package info.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import info.dto.OilconDto;
import jdbc.JdbcUtil;

public class OilconDao {
	public List<OilconDto> select(Connection conn,int restno) throws SQLException {
		PreparedStatement pstmt=null;
		ResultSet rs=null;
	  try {	
		String sql="select * from oilcon where restno=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, restno);
		rs=pstmt.executeQuery();
		List<OilconDto> oilcon =new ArrayList<>();
		while(rs.next()) {
			oilcon.add(new OilconDto(rs.getString("oilconname"),rs.getString("oilconde")));
			System.out.println("oilcon select");
		}return oilcon;
	  }finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
	}
	}
}
