package com.farhaan.Association_Demo.entity.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class StudentMM {
	@Id
	private int rollno;
	private String name;
	@ManyToMany(mappedBy = "slist")
	private List<Course> clist;
	public StudentMM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentMM(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.clist = new ArrayList<Course>();
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
	public List<Course> getClist() {
		return clist;
	}
	public void addCourse(Course c) {
		this.clist.add(c);
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", clist=" + clist + "]";
	}
	
	
	 
}
