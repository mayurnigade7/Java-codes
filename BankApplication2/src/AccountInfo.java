import java.util.Scanner;

public class AccountInfo {
	
	final int max=20;
	Scanner sc=new Scanner(System.in);
	Account accarr[]=new Account[max];
	
	public Account[] create(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Details for:"+(i+1));
			accarr[i]=new Account(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next());
		}
		return accarr;
	}
	public void display(Account accarr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(accarr[i].getAccNo()+"\t"+accarr[i].getCustName()+"\t"+accarr[i].getAccBal()+"\t"+accarr[i].getAccType());
		}
	}
	//public boolean search() {
		
	//}
}
