package com.farhaan.Association_Demo.entity.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	
	@ManyToOne
	private Computer comp;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, Computer comp) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.comp = comp;
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

	public Computer getComp() {
		return comp;
	}

	public void setComp(Computer comp) {
		this.comp = comp;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", comp=" + comp + "]";
	}
	
}
