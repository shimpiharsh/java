//java program to demonstrate interface
import java.util.*;
interface method
{
 void read();
 void calculation();
}
class B implements method
{
	int a,b,c;
    Scanner sc=new Scanner(System.in);
	public void read()
	{
      System.out.println("Enter the value of a and b: ");
      a=sc.nextInt();
      b=sc.nextInt();
	}
	public void calculation()
	{
		c=a+b;
		System.out.println("addition is: "+c);
	}
}
class interfaceexample
{
	public static void main(String args[])
	{
		B b1 = new B();
		b1.read();
		b1.calculation();
	}
}