package com.cisc181.core;

import java.util.UUID;

public class Course {
	 public static void CourseID(String[] args) {
	        UUID uuid = UUID.randomUUID();
	        String randomUUIDString = uuid.toString();
	 }
	 
	String CourseName;
	int GradePoints;
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	 
	 

}
