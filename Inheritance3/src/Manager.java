import java.util.Scanner;

public class Manager extends Employee{
	Scanner sc=new Scanner(System.in);
	private int bonus;
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter bonus:");
		bonus=sc.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.println("Employee bonus:"+bonus);
	}

}
