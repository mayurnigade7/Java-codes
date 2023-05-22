//Static memory allocate memory only once 
//In static method we can use only static variable 
//To access the non static variable in static method we need to create object in static method
//we can call static method using class name
//static block execute only once for a class
//default block execute every time before a constructor

import static java.lang.System.out;
class Demo
{	
	int n1;
	static int n2;
	
	static
	{
		System.out.println("Static Block");
	}
	//default Block
	{
		System.out.println("before Constructor........");
	}
	
	public Demo()
	{
		System.out.println("This is default constructor");
	}
	public void show()
	{
		System.out.println("Value of n1 is :"+n1);
		System.out.println("Value of n2 is :"+n2);
	}
	public static void display()
	{
		Demo dobj=new Demo();
		System.out.println("value of n1 is :"+dobj.n1);
		System.out.println("Value of n2 is :"+n2);
	}
	
}

public class SaticMain {

	public static void main(String[] args) {
		Demo.display();
		Demo d1=new Demo();
		d1.n1=10;
		d1.n2=10;
		d1.show();//10 10
		Demo d2=new Demo();
		d2.n1=20;
		d2.n2=20;
		d2.show();//20 20
		d1.show();//10 20

	}

}
