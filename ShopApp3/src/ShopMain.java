
public class ShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopInfo sinfo=new ShopInfo();
		Customer cust =sinfo.create();
		Customer obj=sinfo.calculateBill(cust);
		sinfo.display(cust);

	}

}
