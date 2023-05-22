import java.util.Scanner;

public class ArithmaticMain {

	public static void main(String[] args) {
		
		int n;
		int ch;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("How many number you want in array:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter numbers you want in array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arithmatic AThread = new Arithmatic();
		AThread.start();
		
	do {
		System.out.println("\n1-add\n2-mul");
		System.out.println("Enter Your choice");
		ch=sc.nextInt();
		switch(ch)
			{
			case 1:
				{
					AThread.addData(arr, n);
					break;
				}
			case 2:
				{
					AThread.mulData(arr, n);
					break;
				}
		
		}
		System.out.println("do you want to continue press 1:");
		ch=sc.nextInt();
	}while(ch==1);
	{
		System.out.println("Thank you");
	}

	}

}
