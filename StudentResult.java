import java.util.*;
class Student
{
private int rollno;
private String name;
private String branch;
private double marx;

void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your rollno");
rollno=sc.nextInt();
System.out.println("enter your name");
name=sc.next();
System.out.println("enter your branch");
branch=sc.next();
System.out.println("enter your marx");
marx=sc.nextDouble();
}
void result()
{
if(marx<=33)
System.out.println("fail");
if(marx>33 && marx<60)
System.out.println("pass");
if(marx>=60)
System.out.println("1st division");
}
void display()
{
	System.out.println("name:"+name);
	System.out.println("rollno:"+rollno);
	System.out.println("marx:"+marx);
}
}
class StudentResult
{
public static void main(String args[])
	{
Student s=new Student();
s.input();
s.result();
	}
}

