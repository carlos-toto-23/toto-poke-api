package com.toto.pokeapi.models.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BerriesFirmnesses {
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("berries")
	private List<Berries> berries;
	
	@JsonProperty("names")
	private List<Names> names;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public List<Berries> getBerries() {
		return berries;
	}

	public void setBerries(List<Berries> berries) {
		this.berries = berries;
	}

	public List<Names> getNames() {
		return names;
	}

	public void setNames(List<Names> names) {
		this.names = names;
	}


	
	

}
