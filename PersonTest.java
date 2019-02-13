import java.util.*;
class Person
{
String name;
int age;
private String constituency;
Scanner sc;
Person()
{    System.out.println("voter eligibility app");
age=0;
name="";
constituency="Noida";
sc=new Scanner(System.in);
}

Person(String n,int a )
{
	name=n;
	age=a;
}


Person(String n,int a ,String c)
{
	name=n;
	age=a;
	constituency=c;
}
	

public void input()
{

System.out.println("enter your name");
name=sc.next();
System.out.println("enter your age");
age=sc.nextInt();
}

public void print()
{
System.out.println("Name:"+name);
System.out.println("age:"+age);
System.out.println("constituency:"+constituency);
}
public void valid()
{
if(age<18)
{
	System.out.println("you are not eligible");
	
}
else
{
	System.out.println("you are eligible");
}
}

}
class PersonTest
{
public static void main(String args[])
{
Person objPerson = new Person();
Person objPerson1 = new Person("arpana",22);


objPerson.input();
objPerson.valid();
objPerson.print();

objPerson1.valid();
objPerson1.print();


}
}
