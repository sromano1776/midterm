package com.cisc181.core;
import java.util.UUID;


public class Enrollment {
	 public static void SectionID(String[] args) {
	        UUID sectionID = UUID.randomUUID();
	        String randomUUIDString = sectionID.toString();
	 }
	 public static void StudentID(String[] args) {
	        UUID studentID = UUID.randomUUID();
	        String randomUUIDString = studentID.toString();
	 }
	 
	 double Grade;
	 
	 
	 private Enrollment(){}
	 
	 public Enrollment(UUID studentID ,UUID sectionID){
		        UUID enrollmentID = UUID.randomUUID();
		        String randomUUIDString = enrollmentID.toString();
	 }
	public void setGrade(double grade) {
		Grade = grade;
	}
}
