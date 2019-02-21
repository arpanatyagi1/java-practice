package com.day13;

import java.util.Comparator;

public class Sortbyname implements Comparator<Student1> {

	@Override
	public int compare(Student1 a, Student1 b) {
		// TODO Auto-generated method stub
		return a.name.compareTo(b.name);
	}
	
	

}
