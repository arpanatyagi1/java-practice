package com.Javatest;

import java.util.Comparator;

import com.day13.Student1;

public class Sortbyprice implements Comparator<BookDetails> {

	public int compare(BookDetails a,BookDetails b) {
		// TODO Auto-generated method stub
		return a.price-b.price;
	}

}
