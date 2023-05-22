
import java.util.Scanner; 
public class Product {
	
	
	//instance variables
	private int proId;
	private String  prodName;
	private double prodPrice;
	private int prodQty;
	
	public Product(int proId, String prodName, double prodPrice, int prodQty) {
		super();
		this.proId = proId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
	};

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public int getProdQty() {
		return prodQty;
	}

	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	
	
}
