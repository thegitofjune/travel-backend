package com.june.travel.model;

import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locationGen")
	@SequenceGenerator(name = "locationGen", sequenceName = "location_seq", allocationSize = 1)
	private int locationId;

	private String name;

	private String review;

	private int rating;

	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, mappedBy = "location")
	private List<Attraction> attractions;

	public Location(String name, String review, List<Attraction> attractions, int rating) {
		super();
		this.name = name;
		this.review = review;
		this.attractions = attractions;
		this.rating = rating;
	}

	public Location() {
		super();
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public List<Attraction> getAttractions() {
		return attractions;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setAttractions(List<Attraction> attractions) {
		this.attractions = attractions;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Location location = (Location) o;
		return locationId == location.locationId && rating == location.rating && Objects.equals(name, location.name) && Objects.equals(review, location.review) && Objects.equals(attractions, location.attractions);
	}

	@Override
	public int hashCode() {
		return Objects.hash(locationId, name, review, rating, attractions);
	}
}
