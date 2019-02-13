import java.util.*;
class Duplicate
{
public static void main(String args[])
{
int n,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter array element");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("");
for(int i=0;i<n;i++)
{
for(int j=n-1;j>i;j--)
{
  if(a[j]<a[i])
  {
	  temp=a[i];
	  a[i]=a[j];
	  a[j]=temp;
	  
   }
}

}

System.out.println("duplicates element in array are:");

   for(int i=0;i<n;i++)
   {
	   for(int j=n-1;j>i;j--)
	   {
		   if(a[j]==a[i])
		   {
			   System.out.println(a[j]);
			   i=j++;
			   break;
		   }
	   }
   }
  
   
     }
	   
 }
 
   