package com.Hibernate.Hib2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	private int pid;
	private String pname;
	
	@OneToMany(mappedBy="pObj")
	List<Categories> cats= new ArrayList();
	
	@ManyToMany(mappedBy="prods")
	List<Supplier> sups=new ArrayList();

	public List<Categories> getCats() {
		return cats;
	}

	public void setCats(List<Categories> cats) {
		this.cats = cats;
	}

	public List<Supplier> getSups() {
		return sups;
	}

	public void setSups(List<Supplier> sups) {
		this.sups = sups;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", cats=" + cats + ", sups=" + sups + "]";
	}
	

}
