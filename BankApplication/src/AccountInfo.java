import java.util.Scanner;

public class AccountInfo {
	Scanner sc=new Scanner(System.in);
	
	
	public Account[] create()
	{
		System.out.println("how many account do you want");
		int n=sc.nextInt();
		
		Account accarr[]=new Account[n];
		for(int i=0;i<accarr.length;i++)
		{
			System.out.println("Enter Account number,cust name,mob no,acc bal");
			accarr[i]=new Account(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
		}
		return accarr;
			
	}
	public void display(Account accarr[])
	{
		for(Account a:accarr)
		{
			System.out.println(a.getAccNo()+"\t"+a.getCustName()+"\t"+a.getMobNo()+"\t"+a.getAccBal());
		}
	}
	public Account retriveAccount(Account accarr[],int accNo)
	{
		Account temp=null;
		for(Account a:accarr)
			if(a.getAccNo()==accNo)
			{
				temp=a;
			}
		return temp;
	}
	public void transaction(Account temp)
	{
		double crrbal=temp.getAccBal();
		double wamt = 0;
		double rembal=crrbal-wamt;
		temp.setAccBal(rembal);
	}
	public void deleteAccount(Account accarr[],int accNo)
	{
		
	}
}
