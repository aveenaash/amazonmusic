package com.amazon.music.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amazon.music.dtos.SongDto;
import com.amazon.music.entities.AlbumEntity;
import com.amazon.music.entities.SongEntity;
import com.amazon.music.repositories.AlbumRepository;
import com.amazon.music.repositories.SongRepository;

@Service
public class SongService {
	
	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private SongRepository songRepository;
	
	@Transactional
	public void createSongs(List<SongDto> songDtos, Long albumId) throws Exception {
		AlbumEntity albumEntity = albumRepository.getById(albumId);
		if(albumEntity == null) {
			throw new Exception("Album not Found id : " + albumId);
		} else {
			for(SongDto dto : songDtos) {
				SongEntity temp = new SongEntity();
				temp.setTitle(dto.getTitle());
				temp.setDuration(dto.getDuration());
				if(dto.getReleaseDate() != null) {
					temp.setReleaseDate(new Date(dto.getReleaseDate()));
				} else {
					temp.setReleaseDate(new Date());
				}
				temp.setAlbum(albumEntity);
				songRepository.save(temp);
			}
		}
	}
		
}
