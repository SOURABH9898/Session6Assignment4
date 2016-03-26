package com.acadglid.java.core.session6.assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class StudentImpl extends Student{
	
private int courseYear;
private String courseBranch;
private HashMap<String, Integer> courseList;
public int getCourseYear() {
	return courseYear;
}
public void setCourseYear(int courseYear) {
	this.courseYear = courseYear;
}
public String getCourseBranch() {
	return courseBranch;
}
public void setCourseBranch(String courseBranch) {
	this.courseBranch = courseBranch;
}
//public HashMap<String, Integer> getCourseList() {
//	return courseList;
//}
//public void setCourseList(HashMap<String, Integer> courseList) {
//	this.courseList = courseList;
//}
public void calculateResult(){
	this.courseList=CourseList.getCourseList(this.getCourseYear(), this.getCourseBranch());
	System.out.println("The Rsult of Student");
	System.out.println(this.getName());
	System.out.println(this.getCourseBranch());
	System.out.println(this.getCourseYear());
	System.out.println(this.getRollNo());
	System.out.println(this.getRegNo());
	
	Iterator<Map.Entry<String, Integer>> itr=courseList.entrySet().iterator();
	while(itr.hasNext()){
		Map.Entry<String, Integer> entry =(Map.Entry<String, Integer>) itr.next();
		System.out.println(entry.getKey() +": "+ entry.getValue());
	}
	
}
}
