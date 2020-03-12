package com.rana.model;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Student {
	
	private String stdName ;
	private int stdId;
	private float stdFee;
	private List<Integer> marks;
	private Set<String> subjects;
	private String[] grades;
	public Student() {
		super();
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public float getStdFee() {
		return stdFee;
	}
	public void setStdFee(float stdFee) {
		this.stdFee = stdFee;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public Set<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}
	public String[] getGrades() {
		return grades;
	}
	public void setGrades(String[] grades) {
		this.grades = grades;
	}
	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdId=" + stdId + ", stdFee=" + stdFee + ", marks=" + marks
				+ ", subjects=" + subjects + ", grades=" + Arrays.toString(grades) + "]";
	}
}