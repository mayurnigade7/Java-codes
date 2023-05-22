
class DerivedClass extends BaseClass{
	int n1=20;
	public DerivedClass()
	{
		super(100);
		System.out.println("Derived class Default Constructor");
	}
	public void show()
	{
		System.out.println("Hello");
		super.show();
		System.out.println("Base Class n1 var is :"+super.n1);
		System.out.println("Derived class n2 var is:"+n1);
	}
}
