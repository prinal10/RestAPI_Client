package com.demo.rest;

public class ASL {

	private int age;
	private String sex;
	private String location;

	public ASL() {
		age = 0;
		sex = "Unknown";
		location = "Unknown";

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ASL [age=" + age + ", sex=" + sex + ", location=" + location + "]";
	}

}
