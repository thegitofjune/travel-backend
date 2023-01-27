package com.june.travel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.june.travel.model.Attraction;
import com.june.travel.model.Location;

public interface AtrtactionDao extends JpaRepository<Attraction,Integer> {

	List<Attraction> findByLocation(Location location);
	
	

}
