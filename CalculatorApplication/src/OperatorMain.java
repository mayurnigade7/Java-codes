import java.util.Scanner;

public class OperatorMain {

	public static void main(String[] args) {
		float n1,n2;
		double ans;
		String ch ="Calculator App";
		System.out.println("ch="+ch);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any 2 numbers:");
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		
		System.out.println("Enter your Command as +,-,*,/:");
		ch=sc.next();
		if(ch.equals("+"))
		{
			ans=n1+n2;
			System.out.println("Addition is:"+ans);
		}
		else if(ch.equals("-"))
		{
			ans=n1-n2;
			System.out.println("Subtraction is:"+ans);
		}
		else if(ch.equals("*"))
		{
			ans=n1*n2;
			System.out.println("Multiplication is:"+ans);
		}
		else if(ch.equals("/"))
		{
			if(n2==0)
			{
				System.out.println("Error in Division");
			}
			else
			{
				ans=n1/n2;
				System.out.println("Division is:"+ans);
			}
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}

}
