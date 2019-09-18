package com.amazon.music.dtos;

public class ArtistDto {

	private String name;
	private String genre;
	private String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "ArtistDto [name=" + name + ", genre=" + genre + ", country=" + country + "]";
	}
	
}
