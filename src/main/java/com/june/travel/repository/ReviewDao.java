package com.june.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.june.travel.model.Review;

public interface ReviewDao extends JpaRepository<Review, Integer>{

}
