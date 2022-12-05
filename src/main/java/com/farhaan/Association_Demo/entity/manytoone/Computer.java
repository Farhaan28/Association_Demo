package com.farhaan.Association_Demo.entity.manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Computer {
	@Id
	private int cid;
	private String model;
	private String bgimag;
	private  String OS;
	
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Computer(int cid, String model, String bgimag, String OS) {
		super();
		this.cid = cid;
		this.model = model;
		this.bgimag = bgimag;
		this.OS = OS;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBgimag() {
		return bgimag;
	}

	public void setBgimag(String bgimag) {
		this.bgimag = bgimag;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	@Override
	public String toString() {
		return "Computer [cid=" + cid + ", model=" + model + ", bgimag=" + bgimag + ", OS=" + OS + "]";
	}
	
}
