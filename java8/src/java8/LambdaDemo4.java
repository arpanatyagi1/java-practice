package java8;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable()
				{
			public void run() {
				System.out.println("before java 8 too much code for too little do");
				
			
			}
				}).start();
		
		new Thread(() -> System.out.println("in java 8 lambda expression rocks!!")).start();
		System.out.println("-----------------*************-----------------");
		
		List features=Arrays.asList("LAMBDAS", "DEFAULT Method" , "Stream API", "Date and Time API");
		features.forEach(n-> System.out.println(n));
		System.out.println("---------------------*************-----------------");
		features.forEach(System.out::println);

	}

}
