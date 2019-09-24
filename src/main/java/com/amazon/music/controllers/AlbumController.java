package com.amazon.music.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.music.dtos.AlbumDto;
import com.amazon.music.dtos.SongDto;
import com.amazon.music.services.AlbumService;
import com.amazon.music.services.SongService;

@RestController
@RequestMapping("/albums")
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;
	@Autowired
	private SongService songService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public void get() {
		//TODO get the album with an id plus teh songs the album has
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createAlbum(@RequestParam Long artistId,
			@RequestBody AlbumDto albumDto) throws Exception {
		albumService.createAlbum(artistId, albumDto);
	}
	
	@RequestMapping(value = "/{id}/songs", method = RequestMethod.POST)
	public void addSongs(@PathVariable(value = "id") Long albumId,
			@RequestBody List<SongDto> songs) throws Exception {
		songService.createSongs(songs, albumId);
	}
}
