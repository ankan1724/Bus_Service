package com.springcore.Bus_Service;

public class Location {

	private String Tocity;
	private String Fromcity;
	public String getTocity() {
		return Tocity;
	}
	public void setTocity(String tocity) {
		Tocity = tocity;
	}
	public String getFromcity() {
		return Fromcity;
	}
	public void setFromcity(String fromcity) {
		Fromcity = fromcity;
	}
	public Location(String tocity, String fromcity) {
		super();
		Tocity = tocity;
		Fromcity = fromcity;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Location [Tocity=" + Tocity + ", Fromcity=" + Fromcity + "]";
	}
	
}
