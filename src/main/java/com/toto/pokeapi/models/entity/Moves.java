package com.toto.pokeapi.models.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Moves {
	
	@JsonProperty("move")
	private List<Move> move;
	
	@JsonProperty("version_group_details")
	private List<VersionGroupDetails> version_group_details;

	public List<Move> getMove() {
		return move;
	}

	public void setMove(List<Move> move) {
		this.move = move;
	}

	public List<VersionGroupDetails> getVersion_group_details() {
		return version_group_details;
	}

	public void setVersion_group_details(List<VersionGroupDetails> version_group_details) {
		this.version_group_details = version_group_details;
	}

	
	
	

}
