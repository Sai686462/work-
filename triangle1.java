import java.util.*;
class triangle1
{
public  static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter the  a");
a=sc.nextInt();
System.out.println("enter the b");
b=sc.nextInt();
System.out.println("enter the c");
c=sc.nextInt();
if((a==b)&& (b==c))
{
System.out.println("equilateral triangle");
}
else if((a==b)|| (b==c)|| (c==a))
{
System.out.println("isosceles triangle");
}
else
{
System.out.println("scalene triangle");
}
}
}






