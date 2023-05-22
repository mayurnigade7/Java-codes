

public class Arithmatic extends Thread
{
	public int addData(int arr[],int n)
	{
		int sum=0;
		for( int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Addition is:"+sum);
		return sum;
	}
	public int mulData(int arr[],int n)
	{
		
		int mul=1;
		for( int i=0;i<n;i++)
		{
			mul=mul*arr[i];
		}
		System.out.println("Multiplication is:"+mul);
		return mul;
	}
	
}
