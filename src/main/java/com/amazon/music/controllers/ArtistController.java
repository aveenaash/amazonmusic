package com.amazon.music.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.music.dtos.ArtistDto;
import com.amazon.music.services.ArtistService;

@RestController
@RequestMapping("/artist")
public class ArtistController {
	
	@Autowired
	private ArtistService artistService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createArtist(@RequestBody ArtistDto artistDto) {
		artistService.createArtist(artistDto);
	}
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public ArtistDto getArtistById(@RequestParam(value="id", required = true) Long artistId) {
		return artistService.getArtistById(artistId);
	}
	
	@RequestMapping(value="/name", method = RequestMethod.GET)
	public List<ArtistDto> getArtistByName(@RequestParam(value="name", required = true) String name) {
		return artistService.searchArtistsByName(name);
	}

}
