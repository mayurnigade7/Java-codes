import java.util.Scanner;

public class AccountInfo extends BankAccount {


	Scanner sc=new Scanner(System.in);

	void deposite(float amt)
	{
		balance=balance +amt;
		System.out.println("Your balance is:"+balance);
	}

	void withdraw(float amt)
	{
		switch(accType)
		{
		 case "saving":
			{
				try 
				{
					if(balance<0)
					{
						throw new Negativeamountexception("Negative Amount Exception ");
						
					}
					else
					{
						try 
						{
							if(balance<1000)
							{
								throw new InsufficientFunds("Insufficient Funds");
							}
							else
							{
								balance=balance-amt;
								System.out.println("Your Remaining Balance is:"+balance);
							}
						}
						catch(InsufficientFunds e)
						{
							System.out.println(e);
						}
					}
				}
				catch(Negativeamountexception e)
				{
					System.out.println(e);
				}
				break;
			}
		 case "current":
		 	{
		 		try
		 		{
		 			if(balance<0)
		 			{
		 				throw new Negativeamountexception("negative amount exception");
		 			}
		 			else
		 			{
		 				try
		 				{
		 					if(balance<1000)
		 					{
		 						throw new InsufficientFunds("Insufficient funds");
		 					}
		 					else
		 					{
		 						balance=balance-amt;
		 						System.out.println("Your remaining balance is:"+balance);
		 					}
		 				}
		 				catch(InsufficientFunds e)
		 				{
		 					System.out.println(e);
		 				}
		 			}
		 		}
		 		catch(Negativeamountexception e)
		 		{
		 			System.out.println(e);
		 		}
		 	}
		}
	}

}
