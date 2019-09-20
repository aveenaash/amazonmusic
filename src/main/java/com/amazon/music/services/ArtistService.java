package com.amazon.music.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.music.dtos.ArtistDto;
import com.amazon.music.entities.ArtistEntity;
import com.amazon.music.repositories.ArtistRepository;

@Service
public class ArtistService {

	@Autowired
	private ArtistRepository artistRepository;
	
	public void createArtist(ArtistDto artistDto) {
		ArtistEntity artistEntity = new ArtistEntity();
		artistEntity.setName(artistDto.getName());
		artistEntity.setGenre(artistDto.getGenre());
		artistEntity.setCountry(artistDto.getCountry());
		artistEntity.setCreatedAt(new Date());
		artistRepository.save(artistEntity);
	}
	
	public ArtistDto getArtistById(Long id) {
		ArtistDto artist = new ArtistDto();
		artist.setName("Ed Sheeran");
		artist.setGenre("pop");
		artist.setCountry("ENG");
		
		return artist;
	}

	public ArtistRepository getArtistRepository() {
		return artistRepository;
	}

	public void setArtistRepository(ArtistRepository artistRepository) {
		this.artistRepository = artistRepository;
	}
		
}
