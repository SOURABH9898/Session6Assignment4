package com.acadglid.java.core.session6.assignment4;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StudentImpl s1=new StudentImpl();
		System.out.println("enter Student Name");
		s1.setName(s.next());
		System.out.println("enter the roll number");
		s1.setRollNo(s.nextInt());
		System.out.println("enter the registration number");
		s1.setRegNo(s.nextLong());
		System.out.println("enter the year of the student, 1, 2, 3 or 4");
		s1.setCourseYear(s.nextInt());
		System.out.println("enter the Branch Name");
		s1.setCourseBranch(s.next());
		s1.calculateResult();
		s.close();
	}

}
