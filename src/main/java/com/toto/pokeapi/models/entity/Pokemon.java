package com.toto.pokeapi.models.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pokemon {
	
	@JsonProperty("abilities")
	private List<Abilities> abilities;
	
	@JsonProperty("base_experience")
	private double base_experience;
	
	@JsonProperty("forms")
	private List<Forms> forms;
	
	@JsonProperty("game_indices")
	private List<Game_Indices> gameindices;
	
	@JsonProperty("height")
	private double height;
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("is_default")
	private boolean is_default;
	
	@JsonProperty("location_area_encounters")
	private String location_area_encounters;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("order")
	private int order;
	
	@JsonProperty("weight")
	private double weight;

	public List<Abilities> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Abilities> abilities) {
		this.abilities = abilities;
	}

	public double getBase_experience() {
		return base_experience;
	}

	public void setBase_experience(double base_experience) {
		this.base_experience = base_experience;
	}

	public List<Forms> getForms() {
		return forms;
	}

	public void setForms(List<Forms> forms) {
		this.forms = forms;
	}

	public List<Game_Indices> getGameindices() {
		return gameindices;
	}

	public void setGameindices(List<Game_Indices> gameindices) {
		this.gameindices = gameindices;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isIs_default() {
		return is_default;
	}

	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}

	public String getLocation_area_encounters() {
		return location_area_encounters;
	}

	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	
}
