import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopInfo sinfo=new ShopInfo();
		Product prod[] =sinfo.create();
		sinfo.display(prod);
	}

}
