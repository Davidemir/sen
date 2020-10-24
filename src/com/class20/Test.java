package com.class20;

public class Test {
	
	// We will test grandparent, parent and child class
	
	public static void main(String[] args) {
		
		System.out.println("***************Creating an object Employee class***************");
		Employee emp = new Employee();
		emp.salary = 70000;
		emp.employeeId = 3512;
       //emp.employeeSsn = 1234;//employeeSsn is Employee feature but we can not access coz it is private class
		
		/*companyName is static variable if we write only Employee class
		 * it will effect parent and child class.Therefore we will not
		 * write parent and child class coz it will come automatically.
		 */
		Employee.companyName = "Syntax";
		emp.work();
		emp.getPaid();
		emp.empId();
		//grandparent cannot access parent and child class
		
		
		System.out.println("***************Creating an object Scrum Team class***************");
		ScrumTeam st = new ScrumTeam();
		// parent class can access grandparent class:
		st.salary = 90000;
		st.employeeId = 1551;
	  //st.employeeSsn = 1234;//employeeSsn is Employee feature but we can not access coz it is private class
		st.work();
		st.getPaid();
		st.empId();
		
		
		st.artifacts = "Product Backlog, Sprint Backlog, BurnDown Chart";
		st.ceremonies = "Sprint Demo, Planning, Retro, Daily StandUp";
		st.attendScrumMeetings();
		
		//parent class can not access child class
		
		
		System.out.println("***************Creating an object Developer class***************");
		Developer dev = new Developer();
		// child class can access grandparent class:
		dev.salary = 120000;
		dev.employeeId = 1119;
	  //dev.employeeSsn = 1234;//employeeSsn is Employee feature but we can not access coz it is private class
		dev.work();
		dev.getPaid();
		dev.empId();
		
		// child class can access parent class:
		dev.artifacts = "Sprint Backlog";
		dev.ceremonies = "Sprint Demo, Planning, Retro, Daily StandUp";
		dev.attendScrumMeetings();
		
		dev.code();
		
		
		
		
		
	}

}
