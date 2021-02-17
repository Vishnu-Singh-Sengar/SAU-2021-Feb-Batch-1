package com.example.au.couchbasedemo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.sun.istack.NotNull;

@Document
public class Blogs {
    
    @Id
    String id;
    
    @NotNull
    @Field
    String MovieName;
    
    @NotNull
    @Field
    List<String> city;
    
    @Field
    List<String> genres;
    
    @Field
    Date date;

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String name) {
		this.MovieName = name;
	}

	public List<String> getcity() {
		return city;
	}

	public void setCerti(List<String> city) {
		this.city = city;
	}

	public List<String> getgenres() {
		return genres;
	}

	public void setgenres(List<String> genres) {
		this.genres = genres;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public Blogs(String id, String name, List<String> certificate, List<String> genres, Date date) {
		super();
		this.id = id;
		this.MovieName = name;
		this.city = city;
		this.genres = genres;
		this.date = date;
	}
    
    
    
}
