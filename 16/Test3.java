class Animal
{
}
class Tiger extends Animal
{
}
public class Test3
{
public void m1(Animal a)
{
System.out.println("Animal");
}
public void m1(Tiger d)
{
System.out.println("Tiger");
}
public static void main(String args[])
{
Test3 t=new Test3();
Animal a=new Animal();
t.m1(a);
Animal a1=new Tiger();
t.m1(a1);
}
}
