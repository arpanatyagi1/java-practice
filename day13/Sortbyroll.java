package com.day13;

import java.util.Comparator;

public class Sortbyroll implements Comparator<Student1>{

	@Override
	public int compare(Student1 a, Student1 b) {
		// TODO Auto-generated method stub
		return a.rollno -b.rollno;
	}
	

}
