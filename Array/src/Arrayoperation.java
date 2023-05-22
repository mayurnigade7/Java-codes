import java.util.Scanner;

public class Arrayoperation {

	public int create(int arr[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("How many elements do you want in array:");
	int n=sc.nextInt();
	//int arr[]=new arr[n];
	System.out.println("Enter elements in array:");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	return n;
}
	public void display(int arr[],int size) {
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+"\t");
		}
	}
	
}
