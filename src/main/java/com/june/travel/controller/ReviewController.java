package com.june.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.june.travel.model.Location;
import com.june.travel.model.Review;
import com.june.travel.service.ReviewService;

@RestController
@RequestMapping("/api/v1/review/")
@CrossOrigin(origins = "http://localhost:3000")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	@GetMapping("/{locationId}/{reviewId}")
	public Review findById(@PathVariable int reviewId) {
		return reviewService.retrieveById(reviewId).get();
	}
	
	

}
