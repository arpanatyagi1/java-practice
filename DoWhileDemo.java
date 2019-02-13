import java.util.*;
class DoWhileDemo
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
String guess;

do
{
System.out.println("guess my name");
guess=s.nextLine();
}
while(!"Arpana".equals(guess));
System.out.println("congratulation u guessed my name correctly");
}
}
