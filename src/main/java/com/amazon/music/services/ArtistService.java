package com.amazon.music.services;

import org.springframework.stereotype.Service;

import com.amazon.music.dtos.ArtistDto;

@Service
public class ArtistService {

	public void createArtist(ArtistDto artistDto) {
		System.out.println(artistDto.toString());
	}
}
