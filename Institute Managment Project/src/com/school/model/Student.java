package com.school.model;

public class Student {
	private int sid;
	private String sname;
	Batch b;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Batch getB() {
		return b;
	}
	public void setB(Batch b) {
		this.b = b;
	}

}
