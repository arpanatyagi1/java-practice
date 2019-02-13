class PrimeNumber
{
public static void main(String args[])
{
int fact;
for(int i=1;i<=1000;i++)
{
	fact=0;
  for(int j=1;j<=1000;j++)
{
 if(i%j==0)
  fact++;
}

if(fact==2)
{
 System.out.println(i+" ");
 }
 }
 }
}