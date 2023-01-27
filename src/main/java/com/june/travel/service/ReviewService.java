package com.june.travel.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.june.travel.model.Location;
import com.june.travel.model.Review;
import com.june.travel.repository.ReviewDao;

@Service
public class ReviewService {
	
	private ReviewDao reviewDao;

	@Autowired
	public ReviewService(ReviewDao reviewDao) {
		super();
		this.reviewDao = reviewDao;
	}

	public void createReview(Review review) {
		reviewDao.save(review);
	}

	public Optional<Review> retrieveById(int reviewId) {
		return reviewDao.findById(reviewId);
	}
	
	

}
