package com.devsuperior.uri2611.DTO;

import com.devsuperior.uri2611.projections.MovieMinProjection;

public class MovieMinDto {

	private Long id;
	private String name;
	
	public MovieMinDto() {
	}

	public MovieMinDto(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public MovieMinDto(MovieMinProjection projection) {
		id = projection.getId();
		name = projection.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MovieMinDto [id= " + id + ", name= " + name + "]";
	}
	
	
}
