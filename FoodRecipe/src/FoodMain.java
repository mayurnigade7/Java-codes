import java.util.Scanner;

public class FoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Food arr[]=new Food[3];
		System.out.println("\n1-Biryani\n2-Coffee\n3-Maggie");
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			arr[0]=new Biryani();
		}
		else if(ch==2)
		{
			arr[1]=new Coffee();
		}
		else if(ch==3)
		{
			arr[3]=new Maggie();
		}
		else 
		{
			System.out.println("Invalid Choice.....");
		}
		display(arr);
	}
	public static void display(Food arr[])
	{
		for(Food i:arr)
		{
			if(i instanceof Biryani)
				i.Recipe();
			
			if (i instanceof Coffee)
				i.Recipe();
			
			if(i instanceof Maggie)
				i.Recipe();
				//i.sayThanks();
		}
	}

}
