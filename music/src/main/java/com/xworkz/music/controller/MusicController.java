package com.xworkz.music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.music.DTO.MusicDTO;
import com.xworkz.musicService.MusicService;
import com.xworkz.musicService.MusicServiceImpl;

@Controller
@RequestMapping("/")
public class MusicController {
	
	public MusicController(){
		System.out.println("created the MusicControllers with no args");
		
	}
	@GetMapping("/play")

	public String onSave() {
		System.out.println("running onSave method in MusicController ");
		return "index.jsp";
	}

	@PostMapping("/play")

	public String onSave(MusicDTO musicDTO) {
		System.out.println(musicDTO.toString());
		MusicService musicService = new MusicServiceImpl();
		boolean saved = musicService.save(musicDTO);

		return "index.jsp";
	}

}



