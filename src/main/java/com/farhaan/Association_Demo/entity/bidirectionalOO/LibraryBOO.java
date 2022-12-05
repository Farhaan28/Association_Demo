package com.farhaan.Association_Demo.entity.bidirectionalOO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//@Entity
public class LibraryBOO {
	@Id
	private int lid;
	private int bcount;
	@OneToOne
	private StudentBOO stud;
	public LibraryBOO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LibraryBOO(int lid, int bcount) {
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
	
	public StudentBOO getStud() {
		return stud;
	}
	public void setStud(StudentBOO stud) {
		this.stud = stud;
	}
	@Override
	public String toString() {
		return "LibraryBOO [lid=" + lid + ", bcount=" + bcount + ", stud=" + stud + "]";
	}
	
	
}
