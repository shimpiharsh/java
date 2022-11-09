//java program to demonstrate inner class
class outer1
{
void outermethod()
{
System.out.println("inside outer method");
class inner
{
public void innermethod()
{
System.out.println("inside inner method");
}
}
inner i1=new inner();
i1.innermethod();
}
}
class innerclass
{
public static void main(String args[])
{
outer1 o1=new outer1();
o1.outermethod();
}
}