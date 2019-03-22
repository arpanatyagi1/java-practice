package com.niit.junit;

public class EmpBusinessLogic {
	   // Calculate the yearly salary of employee
	   public double calculateYearlySalary(EmployeeDetails employeeDetails) {
	      double yearlySalary = 0;
	      yearlySalary = employeeDetails.getMonthSalary() * 12;
	      return yearlySalary;
	   }
		
	   // Calculate the appraisal amount of employee
	   public double calculateAppraisal(EmployeeDetails employeeDetails) {
	      double appraisal = 0;
			
	      if(employeeDetails.getMonthSalary() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
			
	      return appraisal;
	   }
	}