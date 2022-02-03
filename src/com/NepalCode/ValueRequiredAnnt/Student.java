package com.NepalCode.ValueRequiredAnnt;

public class Student {
	
	private String name;
	private String interestedCourse;
	private String hobby;
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
	public void displayStudentInfo() {
		System.out.println("Student name " + name);
		System.out.println("Interested course " +interestedCourse );
		System.out.println("Student hobby " + hobby);
	}
	
	

}
