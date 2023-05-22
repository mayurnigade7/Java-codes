import java.util.Scanner;

public class Developer extends Manager{
	Scanner sc=new Scanner(System.in);
	private int noofhrs;
	public void getData()
	{
		accept();
		System.out.println("Enter no. of hrs:");
		noofhrs=sc.nextInt();
	}
	public void putData()
	{
		display();
		System.out.println("No. Of hrs:"+noofhrs);
	}
}
