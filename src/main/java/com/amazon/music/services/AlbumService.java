package com.amazon.music.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.music.dtos.AlbumDto;
import com.amazon.music.entities.AlbumEntity;
import com.amazon.music.entities.ArtistEntity;
import com.amazon.music.repositories.AlbumRepository;
import com.amazon.music.repositories.ArtistRepository;

@Service
public class AlbumService {
	
	@Autowired
	private ArtistRepository artistRepository;
	
	@Autowired
	private AlbumRepository albumRepository;

	public void createAlbum(Long artistsId, AlbumDto albumdto) throws Exception {
		ArtistEntity artist = artistRepository.findById(artistsId);
		if(artist == null) {
			throw new Exception("Artist doesnt exist id : " + artistsId);
		} else {
			AlbumEntity albumEntity = new AlbumEntity();
			albumEntity.setName(albumdto.getName());
			albumEntity.setGenre(albumdto.getGenre());
			albumEntity.setReleaseDate(new Date(albumdto.getReleaseDate()));
			albumEntity.setArtistEntity(artist);
			albumRepository.save(albumEntity);
		}
	}
}
