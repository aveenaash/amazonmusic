package com.amazon.music.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "albums")
public class AlbumEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "genre")
	private String genre;

	@Column(name = "release_date")
	private Date releaseDate;
	
	@Column(name = "image_url")
	private String image;

	@Column(name = "created_at")
	private Date createdAt;
	
	@OneToOne
	@JoinColumn(name="artist_id")
	private ArtistEntity artistEntity;
	
	
	@PrePersist
	public void onCreate() {
		if(this.createdAt == null) {
			this.createdAt = new Date();
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	
	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public ArtistEntity getArtistEntity() {
		return artistEntity;
	}

	public void setArtistEntity(ArtistEntity artistEntity) {
		this.artistEntity = artistEntity;
	}
	
}
