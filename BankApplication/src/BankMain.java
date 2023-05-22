import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountInfo ainfo=new AccountInfo();
		Account arr[]=null;
		int ch=0;
		
		do {
			System.out.println("1-Create\n2-Display\n3-Search\n4-transaction");
			System.out.println("\nEnter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				arr=ainfo.create();
				break;
			
			case 2:
				ainfo.display(arr);
				break;
				
			case 3:
				System.out.println("Enter your account number:");
				Account temp1=ainfo.retriveAccount(arr, sc.nextInt());
				
				if(temp1!=null)
				{
					System.out.println("Valid Account");
				}
				else
				{
					System.out.println("Invalid account");
				}
				break;
				
			case 4:
				System.out.println("Enter your account number for transaction");
				Account temp2=ainfo.retriveAccount(arr, sc.nextInt());
				if(temp2!=null)
				{
					System.out.println("\n------Transaction-------");
					ainfo.transaction(temp2);
				}
				else {
					System.out.println("Invalid account number");
				}
				break;
			}
			System.out.println("Do you want to continue:");
			ch=sc.nextInt();
		}while( ch==1);
		
		System.out.println("-----------Thank you------");
	}
}
