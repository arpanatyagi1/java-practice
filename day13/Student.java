package com.day13;

public class Student implements Comparable<Student>{

	int rollno;
	String name;
	int age;
	
	Student(int r,String s,int age)
	
	{
	this.rollno=r;
	this.name=s;
	this.age=age;
	
	}
	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(age==st.age)
		return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
	

}
