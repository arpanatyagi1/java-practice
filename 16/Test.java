public class Test
{
public void m1(String s)
{
System.out.println("String args");
}
public void m1(Object ob)
{
System.out.println("Object arg");
}
public static void main(String args[])
{
Test t=new Test();
t.m1(null);
}
}
