import java.util.Date;
public class Bill {
	private int billNo;
	private double cgst;
	private double sgst;
	private double total;
	private double finaltotal;
	private Date date;
	public Bill(int billNo, double cgst, double sgst, double total, double finaltotal) {
		super();
		this.billNo = billNo;
		this.cgst = cgst;
		this.sgst = sgst;
		this.total = total;
		this.finaltotal = finaltotal;
		
	}
	public Bill(Date date) {
		super();
		this.setDate(date);
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getFinaltotal() {
		return finaltotal;
	}
	public void setFinaltotal(double finaltotal) {
		this.finaltotal = finaltotal;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
