import java.util.Scanner;

public class Arrayoperation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0,size=0;
		int arr[]=new int[20];
		Scanner sc=new Scanner(System.in);
		Arrayoperation op=new Arrayoperation();
		do {
		System.out.println("\n1-Create\n2-Display\n3-Search");
		System.out.println("Enter your choice:");
		ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			size=op.create(arr);
			break;
			
		case 2:
			op.display(arr,size);
			break;
		
		}
		System.out.println("\nDo you want to continue press 1");
		 ch=sc.nextInt();
	}
		while(ch==1);
		System.out.println("\nThank you.....");
	}

}
