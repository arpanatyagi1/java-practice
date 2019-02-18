package com.javaTraining;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("study");
		  str.append( "java program" );
		  System.out.println(str);
		  str.replace( 6, 13, "today");
		  System.out.println(str);
		  str.reverse();
		  System.out.println(str);
		  str.replace( 6, 13, "today");
		  System.out.println(str);
		  System.out.println(str.capacity());

	}

}
