package com.day13;

public class Student1 {
int rollno;
String name,address;
public Student1(int roll,String n,String add)
{
	this.rollno=roll;
	this.name=n;
	this.address=add;
	
}
public String toString()
{
	return this.rollno+" "+this.name+" "+this.address;
}
}
