
public class Customer {
	private String custName;
	private int custId;
	private String moNo;
	private Product prod[];
	private Address addr;
	private Bill obj;
	//private Transaction trasc;

	public Customer(String custName, int custId, String moNo, Product[] prod, Address addr, Bill obj) {
		super();
		this.custName = custName;
		this.custId = custId;
		this.moNo = moNo;
		this.prod = prod;
		this.addr = addr;
		this.obj = obj;
	}
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getMoNo() {
		return moNo;
	}
	public void setMoNo(String moNo) {
		this.moNo = moNo;
	}
	public Product[] getProd() {
		return prod;
	}
	public void setProd(Product[] prod) {
		this.prod = prod;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Bill getObj() {
		return obj;
	}
	public void setObj(Bill obj) {
		this.obj = obj;
	}
	
	
	

}
