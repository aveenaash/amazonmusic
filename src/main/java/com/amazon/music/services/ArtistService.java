package com.amazon.music.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		ArtistEntity artistEntity = artistRepository.findById(id);
		return convert(artistEntity);
//		ArtistDto artist = null;
//		if(artistEntity != null) {
//			artist = new ArtistDto();
//			artist.setName(artistEntity.getName());
//			artist.setCountry(artistEntity.getCountry());
//			artist.setGenre(artistEntity.getGenre());
//		}
//		return artist;
	}
	
	public List<ArtistDto>  searchArtistsByName(String name) {
		List<ArtistDto> artistDtoList = new ArrayList<ArtistDto>();
		List<ArtistEntity> artists = artistRepository.findByName(name);
		if(!artists.isEmpty()) {
			for(ArtistEntity a : artists) {
				ArtistDto adto = convert(a);
				artistDtoList.add(adto);
			}
		}
		return artistDtoList;
	}
	
	private ArtistDto convert(ArtistEntity artistEntity) {
		ArtistDto adto = null;
		if(artistEntity != null) {
			adto = new ArtistDto();
			adto.setName(artistEntity.getName());
			adto.setGenre(artistEntity.getGenre());
			adto.setCountry(artistEntity.getCountry());
		}
		return adto;
	}

	public ArtistRepository getArtistRepository() {
		return artistRepository;
	}

	public void setArtistRepository(ArtistRepository artistRepository) {
		this.artistRepository = artistRepository;
	}
		
}
