package com.example.spring.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

	private String title;
	private long year;
	private List<String> casts;
	private List<String> genres;
	private String cast;
	private String genre;
	
	
}
