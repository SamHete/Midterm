package com.cisc181.core;
import java.util.*;
public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	/**
	 * @return the sectionID
	 */
	public UUID getSectionID() {
		return SectionID;
	}
	/**
	 * @param sectionID the sectionID to set
	 */
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	/**
	 * @return the studentID
	 */
	public UUID getStudentID() {
		return StudentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	/**
	 * @return the enrollmentID
	 */
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	/**
	 * @param enrollmentID the enrollmentID to set
	 */
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	/**
	 * @return the grade
	 */
	public double getGrade() {
		return Grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(double grade) {
		Grade = grade;
	}
	/**
	 * no-arg constructor
	 */
	private Enrollment() {
		super();
	}

	/**
	 * @param sectionID
	 * @param studentID
	 * two-arg with above params, also sets EnrollmentID 
	 */
	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		SectionID = sectionID;
		StudentID = studentID;
		UUID EnrollmentID = UUID.randomUUID();
	}
}
