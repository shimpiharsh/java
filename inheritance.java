//java program to demonstrate inheritance
import java.util.*;
class A
{
 int a,b,c;
 Scanner sc=new Scanner(System.in);
 void read()
 {
 System.out.println("enter the value of a and b: ");
 a=sc.nextInt();
 b=sc.nextInt();
 }
}
class B extends A
{
void display()
{
 c=a+b;
 System.out.println("Addition is: "+c);
}
}
class inheritance
{
public static void main(String args[])
{
B b1 = new B();
b1.read();
b1.display();
}
}