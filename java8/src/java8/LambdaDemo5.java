package java8;

import java.util.HashMap;
import java.util.Map;

public class LambdaDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<String,String>books=new HashMap<>();
     books.put("Let us c", "yashwant Kanetkar");
     books.put("oops using java","simon kendal");
     books.put("java:Graphical User Interface","David");
     
     books.forEach((key,value) ->System.out.println("Book Name:- "+key+",Author:-"+value));
     System.out.println();
     
     books.forEach((key,value) ->
     {System.out.println("BOOK NAMe:- "+key+",Author:-"+value);
     
     });
     System.out.println();
     
	}

}
