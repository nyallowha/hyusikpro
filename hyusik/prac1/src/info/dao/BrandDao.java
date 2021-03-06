package info.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import info.dto.BrandDto;
import jdbc.JdbcUtil;

//brand 테이블과 연동
public class BrandDao {
	public List<BrandDto> select(Connection conn,int restno) throws SQLException {
		PreparedStatement pstmt=null;
		ResultSet rs=null;
	  try {	
		String sql="select * from brand where restno=?";
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, restno);
		rs=pstmt.executeQuery();
		List<BrandDto> brand =new ArrayList<>();
		while(rs.next()) {
			brand.add(new BrandDto(rs.getString("brandname"),rs.getString("brandde")));
			System.out.println("brand select");
		}return brand;
	  }finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
	}
	}
}
