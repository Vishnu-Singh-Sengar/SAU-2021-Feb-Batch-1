package com.Hibernate.Hib2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Categories {
	@Id
	private int cid;
	private String cname;
	
	@ManyToOne
	Product pObj;
	
	@ManyToMany(mappedBy="cats")
	List<Supplier> sups=new ArrayList();
	
	public Product getpObj() {
		return pObj;
	}
	public void setpObj(Product pObj) {
		this.pObj = pObj;
	}
	public List<Supplier> getSups() {
		return sups;
	}
	public void setSups(List<Supplier> sups) {
		this.sups = sups;
	}
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Categories [cid=" + cid + ", cname=" + cname + ", pObj=" + pObj + ", sups=" + sups + "]";
	}

}
