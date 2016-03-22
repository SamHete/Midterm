package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;
import com.cisc181.core.PersonException;
public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	/**
	 * Creates five staff instances, sums their salaries and checks it against true value 
	 */
	@Test
	public void testAverageSalary() {
		ArrayList<Staff> StaffArray = new ArrayList<Staff>();
		Staff employeeOne = new Staff(null);
		employeeOne.setSalary(70000);
		StaffArray.add(employeeOne);
		
		Staff employeeTwo = new Staff(null);
		employeeTwo.setSalary(80000);
		StaffArray.add(employeeTwo);

		Staff employeeThree = new Staff(null);
		employeeThree.setSalary(90000);
		StaffArray.add(employeeThree);
		
		Staff employeeFour = new Staff(null);
		employeeFour.setSalary(100000);
		StaffArray.add(employeeFour);
		
		Staff employeeFive = new Staff(null);
		employeeFive.setSalary(65000);
		StaffArray.add(employeeFive);
		
		double average = ((employeeOne.getSalary() + employeeTwo.getSalary() + employeeThree.getSalary() + employeeFour.getSalary() + employeeFive.getSalary()) / 5);		
		assertEquals(82000.00, average, 0);
		assertEquals(1,1);
	}	
	@Test (expected = PersonException.class)
	public void testInvalidStaff() throws Exception {
		
	}
}
