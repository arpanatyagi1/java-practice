class Employee
{
protected String name;
protected int Ecode;
protected String address;

Employee()
{
}
Employee(String str,int ec,String ad)
{
name=str;
Ecode=ec;
address=ad;
}
void display()
{
System.out.println("the name:"+name);
System.out.println("the ecode is:"+Ecode);
System.out.println("address:"+address);
}
}
class Manager extends Employee
{
Manager()
{
}
Manager(String str,int ec,String ad)
{
super(str,ec,ad);
}
}
class Developer extends Employee
{
protected String Dept;

Developer()
{
}
 
Developer(String str,int ec,String ad,String dt)
{
super(str,ec,ad);
Dept=dt;
}
void display()
{
super.display();
System.out.println("your dept is:"+Dept);
}
}
class Testes
{
public static void main(String args[])
{
Manager m=new Manager("arpana",50043556,"gzbd");
m.display();
Developer d=new Developer("bharti",50043560,"noida","developer");
d.display();
}
}


