package com.day13;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class TestSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al =new ArrayList<Student>();
		al.add(new Student(1,"arpana",23));
		al.add(new Student(2,"bhole",22));
		al.add(new Student(3,"varun",24));
		al.add(new Student(4,"barti",23));
		
		Collections.sort(al,Collections.reverseOrder());
		for(Student st:al)
		{
		 System.out.println(st.rollno+" "+st.name+" "+st.age);
		 
		}

	}

}
