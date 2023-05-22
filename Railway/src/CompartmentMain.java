import java.util.Scanner;

public class CompartmentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Compartment arr[]=new Compartment[10];
		 int ch = 0;
		 do{
		 System.out.println("\n1-First class\n2-General\n3-Ladies\n4-Luggage");
		 System.out.println("Enter your Choice");
		 ch=sc.nextInt();
		switch(ch)
		{
		case 1: 
			arr[0] = new FirstClass();
			arr[0].notice();
			break;
		
		case 2:
			arr[1]=new General();
			arr[1].notice();
			
		case 3:
			arr[2]=new Ladies();
			arr[2].notice();
		
		case 4:
			arr[3]=new Luggage();
			arr[3].notice();
		
		default:
			System.out.println("Invalid choice");
			
		}
		System.out.println("Do you want to continue press 1");
		ch=sc.nextInt();
		 }
		 while(ch==1);
		 {
			 System.out.println("Thank you");
		 }
	}

}
