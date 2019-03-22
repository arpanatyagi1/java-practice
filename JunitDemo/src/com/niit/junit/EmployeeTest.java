package com.niit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void mySimpleEqualsTest() {
        String expectedName="arpana";
        assertEquals(expectedName,Employee.getEmpNameWithHighestSalary());
	}
	@Test
	public void myObjectEqualsTest()
	{
		Employee expectedEmpObj=new Employee(1,"arpana",15000);
		assertEquals(expectedEmpObj,Employee.getHighestPaidEmployee());
	}

}
