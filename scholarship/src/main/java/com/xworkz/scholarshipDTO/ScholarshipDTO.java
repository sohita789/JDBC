package com.xworkz.scholarshipDTO;

public class ScholarshipDTO {

	private String id;
	private String studentName;
	private String course;
	private String email;
	
	public ScholarshipDTO(String studentName, String id, String course, String email) {
		super();
		this.studentName = studentName;
		this.id = id;
		this.course = course;
		this.email = email;
	}

	@Override
	public String toString() {
		return "ScholarshipDTO [id=" + id + ", studentName=" + studentName + ", course=" + course + ", email=" + email
				+ "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
