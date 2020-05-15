package review.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import info.service.NotFoundException;
import jdbc.connection.ConnectionProvider;
import review.dao.ReviewDao;
import review.dto.ReviewDto;

public class ReviewService {
	private ReviewDao ReviewDao=new ReviewDao();
	
	public ReviewData getStis() {
		try(Connection conn=ConnectionProvider.getConnection()) {
			System.out.println("ReviewService");
			List<ReviewDto> review=ReviewDao.selectNameis(conn);
			if(review==null) 
				throw new NotFoundException();
			return new ReviewData(review);
		} catch (SQLException e) {
			throw new RuntimeException(e);
	}

	}
	}
