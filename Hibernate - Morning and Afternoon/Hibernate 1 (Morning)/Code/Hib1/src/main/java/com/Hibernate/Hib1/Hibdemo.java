package com.Hibernate.Hib1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Hibdemo {
	@Id
	private int id;
	@Override
	public String toString() {
		return "Hibdemo [id=" + id + ", name=" + name + "]";
	}
	private Name name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	
	
	
}
