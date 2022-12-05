package com.farhaan.Association_Demo.entity.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Learner {
	@Id
	private int lid;
	private String lname;
	private int testCount;
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Learner(int lid, String lname, int testCount) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.testCount = testCount;
	}

	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getTestCount() {
		return testCount;
	}
	public void setTestCount(int testCount) {
		this.testCount = testCount;
	}

	@Override
	public String toString() {
		return "Learner [lid=" + lid + ", lname=" + lname + ", testCount=" + testCount + "]";
	}
	
	
}
