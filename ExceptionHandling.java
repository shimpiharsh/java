//java program to demonstrate exception(divide by 0)
class ExceptionHandling
{
public static void main(String args[])
{
int a=5,b=0;
try
{
System.out.println(a/b);//throw Exception
}
catch(ArithmeticException e)
{
//Exception Handler
System.out.println("Divide by zero operation cannot possible");
}
}
}