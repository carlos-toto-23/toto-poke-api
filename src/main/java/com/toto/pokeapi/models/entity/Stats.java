package com.toto.pokeapi.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {
	
	@JsonProperty("base_stat")
	private double base_stat;
	
	@JsonProperty("effort")
	private double effort;
	
	@JsonProperty("stat")
	private Stat stat;

	public double getBase_stat() {
		return base_stat;
	}

	public void setBase_stat(double base_stat) {
		this.base_stat = base_stat;
	}

	public double getEffort() {
		return effort;
	}

	public void setEffort(double effort) {
		this.effort = effort;
	}

	public Stat getStat() {
		return stat;
	}

	public void setStat(Stat stat) {
		this.stat = stat;
	}
	
	

}
