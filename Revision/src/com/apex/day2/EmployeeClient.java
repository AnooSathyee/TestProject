package com.apex.day2;

public class EmployeeClient {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Employee emp1 = new Employee(1, "Anu", "Sathiya", 1234);
		System.out.println("emp1 " + emp1);
				
		emp.setEmpId(1);
		emp.setFirstName("Anoo");
		emp.setLastName("Sathyee");
		emp.setSsn(12345);
		
		System.out.println("emp " + emp);
		

	}

}
