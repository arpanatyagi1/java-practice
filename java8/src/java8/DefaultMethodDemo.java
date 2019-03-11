package java8;
interface TestInterface
{
	public void square(int a);
	
	//in java 8 we can add static and default method in interface
	default void show()
	{
		System.out.println("default method executed");
	}
	
	static void show1()
	{
		System.out.println("static method exectued");
	}
}


public class DefaultMethodDemo implements TestInterface {
	
	public void square(int a)
	{
		System.out.println(a*a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   DefaultMethodDemo d=new DefaultMethodDemo();
   d.square(4);
   
   d.show();
   TestInterface.show1();
	}

}
