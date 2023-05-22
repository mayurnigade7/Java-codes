import java.util.Scanner;

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id,Name,Salary");
		empId=sc.nextInt();
		empName=sc.next();
		empSalary=sc.nextDouble();
		
	}
	public void display()
	{
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee salary:"+empSalary);
	}
	

}
