package com.toto.pokeapi.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HeldItems {
	
	@JsonProperty("item")
	private Item item;
	
	@JsonProperty("version_details")
	private VersionDetails version_details;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public VersionDetails getVersion_details() {
		return version_details;
	}

	public void setVersion_details(VersionDetails version_details) {
		this.version_details = version_details;
	}
	
	

}
