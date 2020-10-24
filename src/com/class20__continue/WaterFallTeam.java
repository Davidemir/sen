package com.class20__continue;

import com.class20.Employee;//don t forget make import

public class WaterFallTeam extends Employee{

	public static void main(String[] args) {
		
		WaterFallTeam team = new WaterFallTeam();
		team.companyName = "Syntax";
		//accesing protected variable in diffrent package(inheritance)
		team.employeeId = 102;
		team.empId();
		
	}

}
