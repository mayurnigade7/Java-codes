import java.util.Scanner;

public class TestUserException {

	public static void display() throws InvalidAgeException, InvalidPercentageException {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Roll no...");
		int rno=sc.nextInt();
		System.out.println("Enter Student Age...");
		int age=sc.nextInt();
		System.out.println("Enter Student percentage.... ");
		int perct=sc.nextInt();

		try 
		{
			if(age<18)
			{
				throw new InvalidAgeException();
			}
		}
		catch(InvalidAgeException ex)
		{
			System.out.println("Exception is:"+ex);
			throw ex;
		}

		try
		{
			if(perct<75)
			{
				throw new InvalidPercentageException();
			}
		}
		catch(InvalidPercentageException ex)
		{
			System.out.println("Exception is:"+ex);
			throw ex;
		}
	}


	public static void main(String args[])
	{
		System.out.println("Welcome main.....");
		
			try {
				display();
			} catch (InvalidAgeException | InvalidPercentageException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}