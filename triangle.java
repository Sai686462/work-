import java.util.*;
class triangle
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double angle1,angle2,angle3;
System.out.println("enter a value");
angle1=sc.nextDouble();
System.out.println("enter b value");
angle2=sc.nextDouble();
System.out.println("enter c value");
angle3=sc.nextDouble();
 
if(angle1+angle2+angle3==180&& angle1>0&& angle2>0&& angle3>0)
{
System.out.println("it is a triangle");
}
else
{
System.out.println("it is not a traingle");
}
}
}



