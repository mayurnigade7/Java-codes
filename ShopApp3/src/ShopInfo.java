import java.util.Scanner;

public class ShopInfo {
	
	public Customer create()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("How many product do you want:");
		int n=sc.nextInt();
	
	Product prodarr[]=new Product[n];
	for(int i=0;i<prodarr.length;i++)
	{
		System.out.println("Entter Product Id:");
		int prodId=sc.nextInt();
		
		System.out.println("Enter product name:");
		String prodName=sc.next();
		
		System.out.println("Enter product price:");
		int prodPrice=sc.nextInt();
		
		System.out.println("Enter Product Quantity:");
		int prodQty=sc.nextInt();
	
		Product prod=new Product(prodId, prodName, prodPrice, prodQty);
		prodarr[i]=prod;
		}

	Address addr=new Address("Pune", "Maharashtra", 412015);
	Customer cust=new Customer("Mayuresh", 101, "8483948953", prodarr, addr, null);
	return cust;
	}
	public Customer calculateBill(Customer cust)
	{
		Product prodarr[]=cust.getProd();
		double sgst=0,cgst=0,total=0,finaltotal=0;
		for(int i=0;i<prodarr.length;i++)
		{
			total=total+(prodarr[i].getProdPrice()*prodarr[i].getProdQty());
		}
		cgst=total*0.06;
		sgst=total*0.06;
		finaltotal=total+sgst+cgst;
		
		Bill billobj=new Bill(101, cgst, sgst, total, finaltotal);
		cust.setObj(billobj);
		return cust;
		
	}
	public void display(Customer cust)
	{
		System.out.println("Customer Id:"+cust.getCustId());
		System.out.println("Customer Name:"+cust.getCustName());
		System.out.println("Customer Mo.No:"+cust.getMoNo());
		
		Product prodarr[]=cust.getProd();
		int i=0;
		for(i=0;i<prodarr.length;i++);
		{
			System.out.println("----------------------------------");
			
			
			System.out.println("Product Id:"+prodarr[i].getProdId());
			System.out.println("Product Name:"+prodarr[i].getProdName());
			System.out.println("Product Price:"+prodarr[i].getProdPrice());
			System.out.println("Product Quantity:"+prodarr[i].getProdQty());
		}
		System.out.println("------------------Address data--------------------");
		System.out.println("City:"+cust.getAddr().getCity());
		System.out.println("State Name:"+cust.getAddr().getState());
		System.out.println("Pincode:"+cust.getAddr().getPin());
		
	}
	
	
}
