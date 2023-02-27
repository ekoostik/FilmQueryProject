package com.skilldistillery.filmquery.entities;

import java.util.List;
import java.util.Objects;

public class Film {

	private Integer filmId;
	private String title;
	private String desc;
	private Integer releaseYear;
	private String languageId;
	private Integer rentDur;
	private Double rentalRate;
	private Double length;
	private Double replaceCost;
	private String rating;
	private String features;
	private List<Actor> cast;
	private String lang;

	public Film() {

	}

	

	public Film(Integer filmId, String title, String desc, Integer releaseYear, String languageId, Integer rentDur,
			Double rentalRate, Double length, Double replaceCost, String rating, String features,
			List<Actor> cast, String lang) {
		this.filmId = filmId;
		this.title = title;
		this.desc = desc;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.rentDur = rentDur;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replaceCost = replaceCost;
		this.rating = rating;
		this.features = features;
		this.cast = cast;
		this.lang=lang;
	}

	public String getLang() {
		return lang;
	}



	public void setLang(String lang) {
		this.lang = lang;
	}



	public List<Actor> getCast() {
		return cast;
	}

	public void setCast(List<Actor> cast) {
		this.cast = cast;
	}

	public Integer getfilmId() {
		return filmId;
	}

	public void setfilmId(int id) {
		this.filmId = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getLanguageId() {
		return languageId;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public Integer getRentDur() {
		return rentDur;
	}

	public void setRentDur(Integer rentDur) {
		this.rentDur = rentDur;
	}

	public Double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(Double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getReplaceCost() {
		return replaceCost;
	}

	public void setReplaceCost(Double replaceCost) {
		this.replaceCost = replaceCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	@Override
	public int hashCode() {
		return Objects.hash(filmId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return filmId == other.filmId;
	}



	@Override
	public String toString() {
		return "Film " + title + ", "  + " Released: " + releaseYear +
				", Rated: " + rating + ", Language: " + lang + "\n" + desc + "\nCast" + cast ;
	}

	

}
