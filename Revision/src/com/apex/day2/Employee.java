package com.apex.day2;

public class Employee {
	
	private int empId;
	private String firstName;
	private String lastName;
	private int ssn;
	
	public Employee() {}
	
	public Employee(int empId, String firstName, String lastName, int ssn) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Employee [empId = " + empId + ", firstName = " + firstName + ", lastName = " + lastName + ", ssn = " + ssn
				+ "]";
	}
	
	

}
