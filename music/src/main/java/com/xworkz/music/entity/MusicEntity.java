package com.xworkz.music.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "music_data")
public class MusicEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "songName")
	private String songName;
	@Column(name = "composerName")
	private String composerName;
	@Column(name = "budget")
	private double budget;
	
	
	public MusicEntity() {
		super();
	}


	public MusicEntity(String songName, String composerName, double budget) {
		super();
		this.songName = songName;
		this.composerName = composerName;
		this.budget = budget;
	}




	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
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


	@Override
	public String toString() {
		return "MusicEntity [id=" + id + ", songName=" + songName + ", composerName=" + composerName + ", budget="
				+ budget + "]";
	}
	
	}
