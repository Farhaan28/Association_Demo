package com.farhaan.Association_Demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//@Entity
public class StudentUOO {
	@Id
	private int rollno;
	private String name;
	@OneToOne
	private LibraryUOO lib;
	public StudentUOO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentUOO(int rollno, String name, LibraryUOO lib) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.lib = lib;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LibraryUOO getLib() {
		return lib;
	}
	public void setLib(LibraryUOO lib) {
		this.lib = lib;
	}
	@Override
	public String toString() {
		return "StudentUOO [rollno=" + rollno + ", name=" + name + ", lib=" + lib + "]";
	}
	
	
	
}
