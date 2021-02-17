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
    Number goals;
    
    @NotNull
    @Field
    String name;


	public Number getgoals() {
		return goals;
	}

	public void setgoals(Number goals) {
		this.goals = goals;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}



	public String getId() {
		return id;
	}

	public Blogs(String id, Number goals, String name) {
		super();
		this.id = id;
		this.goals = goals;
		this.name = name;
	}
    
    
    
}
