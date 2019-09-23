package com.amazon.music.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.music.dtos.AlbumDto;
import com.amazon.music.services.AlbumService;

@RestController
@RequestMapping("/albums")
public class AlbumController {
	
	@Autowired
	private AlbumService albumService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public void test() {
		System.out.println("this is a test");
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createAlbum(@RequestParam Long artistId,
			@RequestBody AlbumDto albumDto) throws Exception {
		albumService.createAlbum(artistId, albumDto);
	}
}
