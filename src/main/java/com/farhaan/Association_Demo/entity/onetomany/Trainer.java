package com.farhaan.Association_Demo.entity.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Trainer {
	@Id
	private int tid;
	private String tname;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Learner> lList;
	public Trainer(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
		lList = new ArrayList<Learner>();
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public List<Learner> getlList() {
		return lList;
	}
	public void addLearner(Learner l) {
		this.lList.add(l);
	}
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", tname=" + tname + ", lList=" + lList + "]";
	}
	
	
}
