import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		int ch=0;
		float mon;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1-withdrawal\n2-Deposit");
		
	
		
		switch(ch)
		{
		case 1:
			AccountInfo ainfo =new AccountInfo();
			System.out.println("How much money do you want to diposit:");
			mon=sc.nextFloat();
			try{
				if(mon<0)
				{
					throw new Negativeamountexception("Negative amount exception");
				}
				else
				{
					ainfo.deposite(mon);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

}
