package com.Hibernate.Hib2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Supplier {
	@Id
	private int sid;
	
	@ManyToMany
	List<Categories> cats=new ArrayList();
	
	@ManyToMany
	List<Product> prods=new ArrayList();
	
	public List<Categories> getCats() {
		return cats;
	}
	public void setCats(List<Categories> cats) {
		this.cats = cats;
	}
	public List<Product> getProds() {
		return prods;
	}
	public void setProds(List<Product> prods) {
		this.prods = prods;
	}
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Supplier [sid=" + sid + ", cats=" + cats + ", prods=" + prods + ", sname=" + sname + "]";
	}
	

}
