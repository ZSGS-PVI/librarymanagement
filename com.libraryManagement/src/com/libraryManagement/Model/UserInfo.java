package com.libraryManagement.Model;

public class UserInfo {
	private int rollNo;
	private	String name;
	private	String Age;
	private	String mobileno;
	private	String email;
	private	String place;
	

public UserInfo(int rollNo,String name, String dOB, String mobileno, String email, String place) {
	    this.rollNo=rollNo;
		this.name = name;
		this.Age = Age;
		this.mobileno = mobileno;
		this.email = email;
		this.place = place;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDOB() {
		return Age;
	}

	public void setDOB(String dOB) {
		Age = Age;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}


}
