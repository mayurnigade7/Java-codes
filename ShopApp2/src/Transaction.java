
public class Transaction {
	private  float Discount;
	private float Widr;
	private float Dipo;
	public Transaction(float discount, float widr, float dipo) {
		super();
		Discount = discount;
		Widr = widr;
		Dipo = dipo;
	}
	public float getDiscount() {
		return Discount;
	}
	public void setDiscount(float discount) {
		Discount = discount;
	}
	public float getWidr() {
		return Widr;
	}
	public void setWidr(float widr) {
		Widr = widr;
	}
	public float getDipo() {
		return Dipo;
	}
	public void setDipo(float dipo) {
		Dipo = dipo;
	}
	
	

}
