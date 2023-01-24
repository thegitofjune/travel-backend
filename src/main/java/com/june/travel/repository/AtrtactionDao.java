package com.june.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.june.travel.model.Attraction;

public interface AtrtactionDao extends JpaRepository<Attraction,Integer> {
	
	

}
