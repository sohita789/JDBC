package com.xworkz.musicService;

import org.springframework.stereotype.Service;
import com.xworkz.music.DTO.MusicDTO;
import com.xworkz.music.entity.MusicEntity;
import com.xworkz.musicRepository.MusicRepoImpl;
import com.xworkz.musicRepository.MusicRepository;

@Service
public class MusicServiceImpl implements MusicService{
	
	@Override
	public boolean save(MusicDTO musicDTO) {
		
		System.out.println("musicDTO inservice==" + musicDTO.toString());

		MusicEntity musicEntity = new MusicEntity();
        musicEntity.setSongName(musicDTO.getSongName());
		musicEntity.setComposerName(musicDTO.getComposerName());
		musicEntity.setBudget(musicDTO.getBudget());		
		
		MusicRepository musicRepository = new MusicRepoImpl();
		musicRepository.save(musicEntity);
		System.out.println("musicEntity==" + musicEntity.toString());
		return false;
	}

}


