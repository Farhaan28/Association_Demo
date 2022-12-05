package com.farhaan.Association_Demo.entity.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Course {
	@Id
	private int cid;
	private String cname;
	private int duration;
	@ManyToMany
	private List<StudentMM> slist;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cname, int duration) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.slist = new ArrayList<StudentMM>();
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public List<StudentMM> getSlist() {
		return slist;
	}
	public void addStudent(StudentMM s) {
		this.slist.add(s);
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + ", slist=" + slist + "]";
	}
	
	
}
