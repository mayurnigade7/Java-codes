
public abstract class Car {
	
	private int speed;
	private int noOfGears;
	
	public void drive()
	{
		speed=60;
		noOfGears=4;
	}
	public void display()
	{
		System.out.println("Speed is:"+speed+"\nNo of Gears :"+noOfGears);
	}
}
	

