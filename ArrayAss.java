import java.util.*;
class Duplicate
{
public static void main(String args[])
{
int a[]=new int[10];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter array element");
for(i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
System.out.println("");
for(i=0;i<10;i++)
{
for(j=i+1;j<10;j++)
{
  if(a[i]==a[j])
  {
   System.out.println("duplicate element are:"+a[i]);
   }
   }
   }
 }
 }
   