package com.javaTraining;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String args[])
	{
		List<Book> list=new ArrayList<Book>();// list is interface and ArrayList is class here
		Book b1=new Book(101,"Let us c","Yashwant kanetkar","BPB",8);
		Book b2=new Book(102,"data communication and networking","forouZan","mc graw hill",4);
		Book b3=new Book(103,"os","galvin","wiley",6);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book b:list)
		{
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity );
		}
		
	}

}
