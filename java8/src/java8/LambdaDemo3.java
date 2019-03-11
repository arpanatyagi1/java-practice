package java8;

import java.util.ArrayList;

public class LambdaDemo3 {
   public static void main(String args[])
   {
	   ArrayList<Integer> arr=new ArrayList<Integer>();
	   arr.add(1);
	   arr.add(2);
	   arr.add(3);
	   arr.add(4);
	   //arr.add(5);
	   
	   arr.forEach(n -> System.out.println(n));
	   //using lambda expression to print even elements
	   
	   arr.forEach(n -> {if (n%2==0) System.out.println(n);});
	   
   }

}
