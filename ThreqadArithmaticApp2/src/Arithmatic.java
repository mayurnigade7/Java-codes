
public class Arithmatic extends Thread{
	

	
	public void run(int n1,int n2) {
		addData(n1,n2);
		subData(n1,n2);
		mulData(n1,n2);
		divData(n1,n2);
	}
	public void addData(int n1,int n2)
	{
		int sum;
		sum=n1+n2;
		System.out.println("Addition is:"+sum);
	}
	public void subData(int n1,int n2)
	{
		int sub;
		sub=n1-n2;
		System.out.println("Subtraction is:"+sub);
	}
	public void mulData(int n1,int n2)
	{
		int mul;
		mul=n1*n2;
		System.out.println("Multiplication is:"+mul);
	}
	public void divData(int n1,int n2)
	{
		int div;
		div=n1/n2;
		System.out.println("Division is:"+div);
	}
}
