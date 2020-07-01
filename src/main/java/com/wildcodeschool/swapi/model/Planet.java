package com.wildcodeschool.swapi.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Planet {

	// TODO : add attributes
	private String name;
	private Integer rotation_period;
	private Long orbital_period;
	private Long diameter;
	private String climate;
	private String gravity;
	private String terrain;
	private String surface_water;
	private String population;
	private String[] residents;
	private String[] films;
	private String created;
	private String edited;
	private String url;

	public Planet() {
	}

	public Planet(String name, Integer rotation_period, Long orbital_period, Long diameter, String climate,
			String gravity, String terrain, String surface_water, String population, String[] residents, String[] films,
			String created, String edited, String url) {
		this.name = name;
		this.rotation_period = rotation_period;
		this.orbital_period = orbital_period;
		this.diameter = diameter;
		this.climate = climate;
		this.gravity = gravity;
		this.terrain = terrain;
		this.surface_water = surface_water;
		this.population = population;
		this.residents = residents;
		this.films = films;
		this.created = created;
		this.edited = edited;
		this.url = url;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRotation_period() {
		return this.rotation_period;
	}

	public void setRotation_period(Integer rotation_period) {
		this.rotation_period = rotation_period;
	}

	public Long getOrbital_period() {
		return this.orbital_period;
	}

	public void setOrbital_period(Long orbital_period) {
		this.orbital_period = orbital_period;
	}

	public Long getDiameter() {
		return this.diameter;
	}

	public void setDiameter(Long diameter) {
		this.diameter = diameter;
	}

	public String getClimate() {
		return this.climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getGravity() {
		return this.gravity;
	}

	public void setGravity(String gravity) {
		this.gravity = gravity;
	}

	public String getTerrain() {
		return this.terrain;
	}

	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public String getSurface_water() {
		return this.surface_water;
	}

	public void setSurface_water(String surface_water) {
		this.surface_water = surface_water;
	}

	public String getPopulation() {
		return this.population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String[] getResidents() {
		return this.residents;
	}

	public void setResidents(String[] residents) {
		this.residents = residents;
	}

	public String[] getFilms() {
		return this.films;
	}

	public void setFilms(String[] films) {
		this.films = films;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getEdited() {
		return this.edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Planet name(String name) {
		this.name = name;
		return this;
	}

	public Planet rotation_period(Integer rotation_period) {
		this.rotation_period = rotation_period;
		return this;
	}

	public Planet orbital_period(Long orbital_period) {
		this.orbital_period = orbital_period;
		return this;
	}

	public Planet diameter(Long diameter) {
		this.diameter = diameter;
		return this;
	}

	public Planet climate(String climate) {
		this.climate = climate;
		return this;
	}

	public Planet gravity(String gravity) {
		this.gravity = gravity;
		return this;
	}

	public Planet terrain(String terrain) {
		this.terrain = terrain;
		return this;
	}

	public Planet surface_water(String surface_water) {
		this.surface_water = surface_water;
		return this;
	}

	public Planet population(String population) {
		this.population = population;
		return this;
	}

	public Planet residents(String[] residents) {
		this.residents = residents;
		return this;
	}

	public Planet films(String[] films) {
		this.films = films;
		return this;
	}

	public Planet created(String created) {
		this.created = created;
		return this;
	}

	public Planet edited(String edited) {
		this.edited = edited;
		return this;
	}

	public Planet url(String url) {
		this.url = url;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Planet)) {
			return false;
		}
		Planet planet = (Planet) o;
		return Objects.equals(name, planet.name) && Objects.equals(rotation_period, planet.rotation_period)
				&& Objects.equals(orbital_period, planet.orbital_period) && Objects.equals(diameter, planet.diameter)
				&& Objects.equals(climate, planet.climate) && Objects.equals(gravity, planet.gravity)
				&& Objects.equals(terrain, planet.terrain) && Objects.equals(surface_water, planet.surface_water)
				&& Objects.equals(population, planet.population) && Objects.equals(residents, planet.residents)
				&& Objects.equals(films, planet.films) && Objects.equals(created, planet.created)
				&& Objects.equals(edited, planet.edited) && Objects.equals(url, planet.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rotation_period, orbital_period, diameter, climate, gravity, terrain, surface_water,
				population, residents, films, created, edited, url);
	}

	@Override
	public String toString() {
		return "{" + " name='" + getName() + "'" + ", rotation_period='" + getRotation_period() + "'"
				+ ", orbital_period='" + getOrbital_period() + "'" + ", diameter='" + getDiameter() + "'"
				+ ", climate='" + getClimate() + "'" + ", gravity='" + getGravity() + "'" + ", terrain='" + getTerrain()
				+ "'" + ", surface_water='" + getSurface_water() + "'" + ", population='" + getPopulation() + "'"
				+ ", residents='" + getResidents() + "'" + ", films='" + getFilms() + "'" + ", created='" + getCreated()
				+ "'" + ", edited='" + getEdited() + "'" + ", url='" + getUrl() + "'" + "}";
	}

}
