
public class ThreadApp {

	public static void main(String[] args) {
		for(int i=0;i<=args.length;i++)
		{
			System.out.println(args[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
