package com.farhaan.Association_Demo.entity.bidirectionalOO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.farhaan.Association_Demo.entity.LibraryUOO;
//@Entity
public class StudentBOO {
	
		@Id
		private int rollno;
		private String name;
		@OneToOne(cascade = CascadeType.ALL)
		private LibraryBOO lib;
		public StudentBOO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public StudentBOO(int rollno, String name, LibraryBOO lib) {
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
		public LibraryBOO getLib() {
			return lib;
		}
		public void setLib(LibraryBOO lib) {
			this.lib = lib;
		}
		@Override
		public String toString() {
			return "StudentUOO [rollno=" + rollno + ", name=" + name + ", lib=" + lib + "]";
		}
		
		
		
	}

