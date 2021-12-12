package com.toto.pokeapi.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Game_Indices {

	@JsonProperty("game_index")
	private int game_index;
	
	@JsonProperty("version")
	private Version version;

	public int getGame_index() {
		return game_index;
	}

	public void setGame_index(int game_index) {
		this.game_index = game_index;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}
	
	
	
}
