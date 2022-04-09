package com.springcore.Bus_Service;

import java.util.List;

public class Service {
 private int id;
 private String name;
 private List<String> drivers;
 private Location locations;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getDrivers() {
	return drivers;
}
public void setDrivers(List<String> drivers) {
	this.drivers = drivers;
}
public Location getLocations() {
	return locations;
}
public void setLocations(Location locations) {
	this.locations = locations;
}
public Service(int id, String name, List<String> drivers, Location locations) {
	super();
	this.id = id;
	this.name = name;
	this.drivers = drivers;
	this.locations = locations;
}
public Service() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Service [id=" + id + ", name=" + name + ", drivers=" + drivers + ", locations=" + locations + "]";
};
 
}
