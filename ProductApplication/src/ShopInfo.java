import java.util.Scanner;

public class ShopInfo {
		
	public Product[] create()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many Products do you want:");
		int n=sc.nextInt();
		//array of product
		Product parr[]=new Product[n];
		
		for(int i=0;i<parr.length;i++)
		{
		System.out.println("Enter Product Id,Product Name,product Price,product Quantity");
		int prodId=sc.nextInt();
		String prodName=sc.next();
		double prodPrice=sc.nextDouble();
		int prodQty=sc.nextInt();

		Product prod=new Product(prodId, prodName, prodPrice, prodQty);
		parr[i]=prod;
		}
		return parr;
	}
	public void display(Product prod[])
	{
	for(int i=0;i<prod.length;i++)
	{
		System.out.println("Product ID :"+prod[i].getProId());
		System.out.println("Product Name :"+prod[i].getProdName());
		System.out.println("Product Price :"+prod[i].getProdPrice());				
		System.out.println("Product Qty :"+prod[i].getProdQty());

	}
	}
}
		// TODO Auto-generated method stub

	


