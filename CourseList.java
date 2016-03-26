package com.acadglid.java.core.session6.assignment4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import java.util.Properties;
import java.util.Scanner;

public class CourseList {
	
	public static HashMap<String, Integer> getCourseList(int courseYear, String branchName){
		
		Properties p=new Properties();
		try {
			p.load(new FileInputStream("C:/Users/SOURABH/sampleWorkspace/acadGlid/src/com/acadglid/java/core/session6/assignment4/SubjectList.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] tempList=p.getProperty(branchName.toUpperCase()+"_"+courseYear).split(",");
		
		return getScoreList(tempList);
		
		
		
	}
	
	static HashMap<String, Integer> getScoreList( String[] subjectList){
		Scanner s=new Scanner(System.in);
		HashMap<String, Integer> scoreList=new HashMap<String, Integer>();
		for (int i=0;i<subjectList.length;i++){
			System.out.println("enter the marks obtained in "+subjectList[i]);
			scoreList.put(subjectList[i], (Integer)s.nextInt());
		}
		System.out.println(subjectList);
		s.close();
		return scoreList;
	}

}
