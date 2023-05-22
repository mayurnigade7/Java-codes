
public class Developer extends Employee{
	
	private int noofhrs;
	
	public Developer(int empId, String empName, double empSalary, int noofhrs) {
		super(empId, empName, empSalary);
		this.noofhrs = noofhrs;
	}

	

	public int getNoofhrs() {
		return noofhrs;
	}

	public void setNoofhrs(int noofhrs) {
		this.noofhrs = noofhrs;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getEmpId()+"\t"+getEmpName()+"\t"+getEmpSalary()+"\t"+getNoofhrs();
	}
	
}
