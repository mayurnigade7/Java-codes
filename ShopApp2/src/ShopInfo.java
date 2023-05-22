
public class ShopInfo {
	
	public Customer create()
	{
		Product prod=new Product(101, "Laptop", 60000, 2);
		Address adrr=new Address("Pune", "Maharashtra", 412035);
		Customer cust=new Customer("Mayuresh", 101, "8483948953", prod, adrr);
		
		return cust;
	}
	
	public void display(Customer cust)
	{
		System.out.println("--------------------Customer Data-----------------");
		System.out.println("Cust Id:"+cust.getCustId());
		System.out.println("cust Name"+cust.getCustName());
		System.out.println("Mobile no:"+cust.getMoNo());
		
		System.out.println("-------------------Product Data-------------------");
		Product prod=cust.getProd();
		System.out.println("Product Id:"+prod.getProdId());
		System.out.println("Product Name:"+prod.getProdName());
		System.out.println("Product Price:"+prod.getProdPrice());
		System.out.println("Product Quantity:"+prod.getProdQty());
		
		System.out.println("------------------Address data--------------------");
		System.out.println("City:"+cust.getAddr().getCity());
		System.out.println("State Name:"+cust.getAddr().getState());
		System.out.println("Pincode:"+cust.getAddr().getPin());
		
		
	}
}
