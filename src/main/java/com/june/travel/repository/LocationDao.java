package com.june.travel.repository;

import com.june.travel.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.june.travel.model.Location;

import java.util.List;

@Repository
public interface LocationDao extends JpaRepository<Location, Integer>{


    List<Location> findByRegion(Region region);

}
