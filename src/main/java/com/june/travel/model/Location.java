package com.june.travel.model;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locationGen")
	@SequenceGenerator(name = "locationGen", sequenceName = "location_seq", allocationSize = 1)
	private int locationId;

	private String name;

	@OneToOne(cascade = CascadeType.PERSIST)
	private Review reviews;

	@ManyToOne(cascade = CascadeType.PERSIST)
	private Attraction attractions;

	public Location(String name, Review reviews, Attraction attractions) {
		super();
		this.name = name;
		this.reviews = reviews;
		this.attractions = attractions;
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

	public Review getReviews() {
		return reviews;
	}

	public void setReviews(Review reviews) {
		this.reviews = reviews;
	}

	public Attraction getAttractions() {
		return attractions;
	}

	public void setAttractions(Attraction attractions) {
		this.attractions = attractions;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attractions, locationId, name, reviews);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		return Objects.equals(attractions, other.attractions) && locationId == other.locationId
				&& Objects.equals(name, other.name) && Objects.equals(reviews, other.reviews);
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", name=" + name + ", reviews=" + reviews + ", attractions="
				+ attractions + "]";
	}

}
