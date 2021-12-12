package com.toto.pokeapi.models.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Berry {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("growth_time")
	private double growth_time;
	
	@JsonProperty("max_harvest")
	private double max_harvest;
	
	@JsonProperty("natural_gift_power")
	private double natural_gift_power;
	
	@JsonProperty("size")
	private double size;
	
	@JsonProperty("smoothness")
	private double smoothness;
	
	@JsonProperty("soil_dryness")
	private double soil_dryness;
	
	@JsonProperty("firmness")
	private Firmness firmness;
	
	@JsonProperty("flavors")
	private List<Flavors> flavors;
	
	@JsonProperty("item")
	private Item item;
	
	@JsonProperty("natural_gift_type")
	private NaturalGiftType natural_gift_type;

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

	public double getGrowth_time() {
		return growth_time;
	}

	public void setGrowth_time(double growth_time) {
		this.growth_time = growth_time;
	}

	public double getMax_harvest() {
		return max_harvest;
	}

	public void setMax_harvest(double max_harvest) {
		this.max_harvest = max_harvest;
	}

	public double getNatural_gift_power() {
		return natural_gift_power;
	}

	public void setNatural_gift_power(double natural_gift_power) {
		this.natural_gift_power = natural_gift_power;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getSmoothness() {
		return smoothness;
	}

	public void setSmoothness(double smoothness) {
		this.smoothness = smoothness;
	}

	public double getSoil_dryness() {
		return soil_dryness;
	}

	public void setSoil_dryness(double soil_dryness) {
		this.soil_dryness = soil_dryness;
	}

	public Firmness getFirmness() {
		return firmness;
	}

	public void setFirmness(Firmness firmness) {
		this.firmness = firmness;
	}

	public List<Flavors> getFlavors() {
		return flavors;
	}

	public void setFlavors(List<Flavors> flavors) {
		this.flavors = flavors;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	

	public NaturalGiftType getNatural_gift_type() {
		return natural_gift_type;
	}

	public void setNatural_gift_type(NaturalGiftType natural_gift_type) {
		this.natural_gift_type = natural_gift_type;
	}

	
	
}
