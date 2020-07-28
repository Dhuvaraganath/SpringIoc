package com.dhuvarag.org;

public class Student {
	
	private int id;
	private String studentName;
	
	/*//Using setter dependency injection
	 * public void setId(int id) { this.id = id; } public String getStudentName() {
	 * return studentName; }
	 * 
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 */
	
	//Constructor dependency injection
	
	
	public void displayStudentName() {
		System.out.println("Student name is "+studentName+ " and ID is "+id);
	}

	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}
	
	
}
