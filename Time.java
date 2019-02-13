import java.util.*;
class Time
{
int hours;
int minutes;
int seconds;
public Time(int h,int m,int s)
{
this.hours=h;
this.minutes=m;
this.seconds=s;
}
public void add(Time obj2)
{
this.hours+=obj2.hours;
this.minutes+=obj2.minutes;
this.seconds+=obj2.seconds;
if(this.seconds>60)
{
 this.seconds=this.seconds-60;
 minutes+=1;
 }
if(this.minutes>60)
{
 this.minutes=this.minutes-60;
 hours+=1;
 }
}
 void display()
 {
 System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
 }
 public static void main(String args[])
 {
 Time obj1=new Time(1,50,50);
 Time obj2=new Time(2,20,30);
 obj1.add(obj2);
 System.out.println("the time is");
 obj1.display();
 }
 }
 

