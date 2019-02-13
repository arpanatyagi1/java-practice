import java.util.*;
class ArrayCopy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];

System.out.println("enter array element");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();

}
for(int j=0;j<n;j++)
{
b[j]=a[j];
}
System.out.println("element in b are");
for(int i=0;i<n;i++)
{
	System.out.println(b[i]);
}
}
}
