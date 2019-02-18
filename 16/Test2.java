public class Test2
{
public void m1(int i,float f)
{
System.out.println("int and float");
}
public void m1(float f,int i)
{
System.out.println("float and int");
}
public static void main(String args[])
{
Test2 t2=new Test2();
t2.m1(10,10f);
t2.m1(10f,10);
t2.m1(10,10);
t2.m1(10f,10f);
}
}