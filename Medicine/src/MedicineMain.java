import java.util.Scanner;

public class MedicineMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int ch=0;
		
		do {
			Medicine arr[]=new Medicine[10];
		System.out.println("\n1-Tablet\n2-Syrup\n3-Ointments");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		arr[0]=null;
		switch(ch)
		{
		case 1:
			arr[0]=new Medicine() 
			{
			};
			arr[1]=new Tablet();
			arr[0].displayLabel();
			arr[1].displayLabel();
			break;
			
		case 2:
			arr[0]=new Medicine() 
			{
			};
			arr[1]=new Syrup();
			arr[0].displayLabel();
			arr[1].displayLabel();
			break;
			
		case 3:
			arr[0]=new Medicine() {
			};
			arr[2]=new ointments();
			arr[2].displayLabel();
			break;
			
		default:
			System.out.println("Invalid choice");
		
		}
		System.out.println("Do you want to continue press 1");
		ch=sc.nextInt();
	}
		while(ch==1);
		{
			System.out.println("Thank you...");
		}
}
	
}
