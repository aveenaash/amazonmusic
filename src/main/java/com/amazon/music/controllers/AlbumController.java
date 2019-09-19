package com.amazon.music.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/albums")
public class AlbumController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public void test() {
		System.out.println("this is a test");
	}
}
