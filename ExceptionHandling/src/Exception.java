import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		
		//System.out.println("Helllo.............");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		try {
		    //int n1=Integer.parseInt(args[0]);
			//int n2=Integer.parseInt(args[1]);
			int n1,n2;
			
			System.out.println("Enter n1.....");
		    n1=sc.nextInt();
			System.out.println("Enter n2.....");
			n2=sc.nextInt();
			
			int ans=n1/n2;
			System.out.println("ans is:"+ans);
			System.out.println("Thank you...");
		}
			catch(ArithmeticException ex)
			{
				System.out.println("Exception is "+ex);
				System.out.println("Thank you..");
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("array exp :"+ex);
			}
			catch(NumberFormatException ex)
			{
				System.out.println("Number exp :"+ex);
				System.out.println("Thank you");
			}
		finally {
				System.out.println("....Thank you....");
			}
		}

}
