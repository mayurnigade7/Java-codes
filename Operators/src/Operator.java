//import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double ans;
		String s=" ";
		System.out.println("s="+s);
	//	Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Any 2 numbers:");
		
		System.out.println("Enter your Command as +,-,*,/:");
		
		if(s.equals("+"))
		{
			ans=a+b;
			System.out.println("Addition is:"+ans);
		}
		else if(s.equals("-"))
		{
			ans=a-b;
			System.out.println("Subtraction is:"+ans);
		}
	} 


	}


