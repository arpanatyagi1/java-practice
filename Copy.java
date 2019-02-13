import java.util.*;
class Copy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
int n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int i,j;
System.out.println("enter array element");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(j=0;j<n;j++)
{
b[j]=a[j];

}
System.out.println("element in b are");
for(i=0;i<n;i++)
{
	System.out.println(b[i]);
}
}
}
