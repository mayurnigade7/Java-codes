import java.util.Scanner;

public class ArithmaticMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		int ch;
	do {
		System.out.println("Enter n1:");
		System.out.println("Enter n2:");
		
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		Arithmatic Athread= new Arithmatic();
		Athread.start();
		
		System.out.println("\n1-add\n2-sub\n3-mul\n4-div");
		System.out.println("Enyter your choice:");
		
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			Athread.addData(n1,n2);
			break;
		}
		case 2:
		{
			Athread.subData(n1,n2);
			break;
		}
		case 3:
		{
			Athread.mulData(n1,n2);	
			break;
		}
		case 4:
		{
			Athread.divData(n1,n2);
			break;
		}
			
	}
	  System.out.println("do you want to continue press 1:");
	  ch=sc.nextInt();

	}
	while(ch==1);
		{
			System.out.println("Thank you");
		}
	}
}
