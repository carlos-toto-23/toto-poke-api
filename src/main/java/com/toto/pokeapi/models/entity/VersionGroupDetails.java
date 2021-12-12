package com.toto.pokeapi.models.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VersionGroupDetails {
	
	@JsonProperty("level_learned_at")
	private int level_learned_at;
	
	@JsonProperty("move_learned_method")
	private List<MoveLearnedMethod> move_learned_method;
	
	@JsonProperty("version_group")
	private List<VersionGroup> version_group;

	public int getLevel_learned_at() {
		return level_learned_at;
	}

	public void setLevel_learned_at(int level_learned_at) {
		this.level_learned_at = level_learned_at;
	}

	public List<MoveLearnedMethod> getMove_learned_method() {
		return move_learned_method;
	}

	public void setMove_learned_method(List<MoveLearnedMethod> move_learned_method) {
		this.move_learned_method = move_learned_method;
	}

	public List<VersionGroup> getVersion_group() {
		return version_group;
	}

	public void setVersion_group(List<VersionGroup> version_group) {
		this.version_group = version_group;
	}

	
	
	

}
