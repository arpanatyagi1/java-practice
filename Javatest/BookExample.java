package com.Javatest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookExample {
	
	public static void main(String args[])
	{
		List<BookDetails> list=new ArrayList<BookDetails>();
		BookDetails b1=new BookDetails(1,500,"java");
		BookDetails b2=new BookDetails(2,400,"c");
		BookDetails b3=new BookDetails(3,200,"python");
		BookDetails b4=new BookDetails(4,50,"c++");
		BookDetails b5=new BookDetails(5,10,"SE");
		BookDetails b6=new BookDetails(6,100,"CN");
		BookDetails b7=new BookDetails(7,50,"AN");
		BookDetails b8=new BookDetails(8,40,"AI");
		BookDetails b9=new BookDetails(9,20,"CG");
		BookDetails b10=new BookDetails(10,60,"spring");
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		list.add(b7);
		list.add(b8);
		list.add(b9);
		list.add(b10);
		
	    Collections.sort(list,new Sortbyprice());
		
		for(BookDetails b:list)
		{
			System.out.println(b.id+" "+b.price+" "+b.name);
		}
		
	}

}
