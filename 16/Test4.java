class Parent 
{
public String m1()
{
System.out.println("parent");
return null;
}
}
class Child extends Parent
{
public Object m1()
{
System.out.println("child");
return null;

}
}

public class Test4
{
public static void main(String args[])
{
Parent p=new Parent();
p.m1();
Parent p1=new Child();
p1.m1();
}
}
