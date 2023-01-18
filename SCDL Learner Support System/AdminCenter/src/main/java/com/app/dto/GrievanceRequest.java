package com.app.dto;
public class GrievanceRequest {
	
	private int id;
	 private String studentname;
	 private int registrationno;
	 private String emailaddress;
	 private long mobileno;
	 private String gender;
	 private String department;
	 private String year;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRegistrationno() {
		return registrationno;
	}
	public void setRegistrationno(int registrationno) {
		this.registrationno = registrationno;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "GrievanceResponse [id=" + id + ", studentname=" + studentname + ", registrationno=" + registrationno
				+ ", emailaddress=" + emailaddress + ", mobileno=" + mobileno + ", gender=" + gender + ", department="
				+ department + ", year=" + year + "]";
	}
	 
	

}
