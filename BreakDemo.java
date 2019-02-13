import java.util.*;
class BreakDemo
{
 public static void main(String args[])
 {
 int n,sum=0;
  Scanner sc=new Scanner(System.in);
   for(int i=0;i<5;i++)
  {
System.out.println("enter any number");
  n=sc.nextInt();
  if(n<0)
  {
   break;
   }
   sum=sum+n;
  }
  System.out.println("sum="+sum);
 }
}
   
   
 
  
  