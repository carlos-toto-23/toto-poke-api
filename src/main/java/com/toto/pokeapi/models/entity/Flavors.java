package com.toto.pokeapi.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flavors {

	@JsonProperty("potency")
	private double potency;
	
	@JsonProperty("flavor")
	private Flavor flavor;

	public double getPotency() {
		return potency;
	}

	public void setPotency(double potency) {
		this.potency = potency;
	}

	public Flavor getFlavor() {
		return flavor;
	}

	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}
	
	
}
