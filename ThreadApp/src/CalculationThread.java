
public class CalculationThread extends Thread {
	
	int n1;
	int n2;
	
	public CalculationThread(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	public void run()
	{
		int sum=n1+n2;
		System.out.println("Addition is:"+sum);
	}
}
