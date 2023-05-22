
public class Account {

	private int accNo;
	private String custName;
	private double accBal;
	private String accType;
	public Account(int accNo, String custName, double accBal, String accType) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accBal = accBal;
		this.accType = accType;
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
	public double getAccBal() {
		return accBal;
	}
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	

	
}
