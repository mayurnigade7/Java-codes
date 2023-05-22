
public class Account {
	private int accNo;
	private String custName;
	private String mobNo;
	private double accBal;
	
	public Account(int accNo, String custName, String mobNo, double accBal) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.mobNo = mobNo;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public double getAccBal() {
		return accBal;
	}

	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	

}
