import java.util.Scanner;

public class CalcAverage {
	
	public double avgFirstN(int N)
	{
		double avg=0;
		
		try
		{
			Scanner sc=new Scanner(System.in);
			int arr[]=new int[N];
			System.out.println("Enter numbers for average :");
			for(int i=0;i<N;i++)
			{
				arr[i]=sc.nextInt();
			}
			double sum=0;
			for(int i=0;i<N;i++)
			{
				sum=sum+arr[i];
			}
			avg=sum/N;
			System.out.println("Average of given nos is :"+avg);
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println("Exception is :"+ex);
		}
		finally
		{
			System.out.println("----------THANK YOU--------------");
		}
		return avg;
		
	}
	
	public class CalcAverageMain {

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			CalcAverage cal=new CalcAverage();
			System.out.println("How many nos you want to enter :");
			int N=sc.nextInt();
			cal.avgFirstN(N);

		}

	}

}