import java.util.*;
class ArrayDemo
{
public static void main(String args[])
{
int[] numbers={8,18,5,2,1,10};
System.out.println("total number of element:"+numbers.length);
System.out.println("total number of element:"+numbers[0]);
System.out.println("total number of element:"+numbers[numbers.length-1]);

int sum=0,i;
for(i=0;i<numbers.length;i++)
{
	sum+=numbers[i];
}
System.out.println("the sum of array element:"+sum);
}
}