class Parent
{
private void m1()
{
System.out.println("parent");
}
}
class Child extends Parent
{
private void m1()
{
System.out.println("child");
}
}
class Test5
{
public static void main(String args[])
{
Parent p=new Parent();
p.m1();
Parent p1=new Child();
p1.m1();
}
}
