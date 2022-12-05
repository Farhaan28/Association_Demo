package com.farhaan.Association_Demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class LibraryUOO {
	@Id
	private int lid;
	private int bcount;
	public LibraryUOO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LibraryUOO(int lid, int bcount) {
		super();
		this.lid = lid;
		this.bcount = bcount;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getBcount() {
		return bcount;
	}
	public void setBcount(int bcount) {
		this.bcount = bcount;
	}
	@Override
	public String toString() {
		return "LibraryUOO [lid=" + lid + ", bcount=" + bcount + "]";
	}
	
	
}
