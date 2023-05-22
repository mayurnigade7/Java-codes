
public class Customer {
	private String custName;
	
	
	private int custId;
	private String moNo;
	private Product prod;
	private Address addr;
	private Transaction trasc;
	
	public Customer(String custName, int custId, String moNo, Product prod, Address addr) {
		super();
		this.custName = custName;
		this.custId = custId;
		this.moNo = moNo;
		this.prod = prod;
		this.addr = addr;
	}

	public Transaction getTrasc() {
		return trasc;
	}

	public void setTrasc(Transaction trasc) {
		this.trasc = trasc;
	}

	public Customer(Transaction trasc) {
		super();
		this.trasc = trasc;
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

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
		

}
