package com.june.travel.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Attraction {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attractionGen")
	@SequenceGenerator(name = "attractionGen", sequenceName = "attraction_seq", allocationSize = 1)
	private int attractionId;

	private String name;

	private int rating;

	public Attraction(String name, int rating) {
		super();
		this.name = name;
		this.rating = rating;
	}

	public Attraction() {
		super();
	}

	public int getAttractionId() {
		return attractionId;
	}

	public void setAttractionId(int attractionId) {
		this.attractionId = attractionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(attractionId, name, rating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attraction other = (Attraction) obj;
		return attractionId == other.attractionId && Objects.equals(name, other.name) && rating == other.rating;
	}

	@Override
	public String toString() {
		return "AAtrtaction [attractionId=" + attractionId + ", name=" + name + ", rating=" + rating + "]";
	}

}
