
public class CalculationThreadMain {

	public static void main(String[] args) {
		CalculationThread Thread =new CalculationThread(10, 30);
		Thread.start();
		
		System.out.println("Thank you");
	}

}
