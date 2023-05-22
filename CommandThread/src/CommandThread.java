
public class CommandThread extends Thread{
	
	private String arr[];

	public CommandThread(String[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public void run() {
		calci();
	}
	
	public void calci() {
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			 System.out.println(arr[i]);
			 sum=sum+Integer.parseInt(arr[i]);
			 
		}
		System.out.println("Addition is:"+sum);
	}
	
	
}
