package com.xworkz.music.DTO;

public class MusicDTO {

	private int id;
	private String songName;
	private String composerName;
	private double budget;
	
	public MusicDTO() {
		super();
	}

	public MusicDTO(int id,String songName, String composerName, double budget) {
		super();
		this.songName = songName;
		this.composerName = composerName;
		this.budget = budget;
	}
	
	@Override
	public String toString() {
		return "MusicDTO [id=" + id + ", songName=" + songName + ", composerName=" + composerName + ", budget=" + budget
				+ "]";
	}

	
	

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComposerName() {
		return composerName;
	}

	public void setComposerName(String composerName) {
		this.composerName = composerName;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

}
