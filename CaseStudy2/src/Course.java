
public class Course {
	private int crs_No;
	private String crs_name;
	public Course(int crs_No, String crs_name) {
		super();
		this.crs_No = crs_No;
		this.crs_name = crs_name;
	}
	public int getCrs_No() {
		return crs_No;
	}
	public void setCrs_No(int crs_No) {
		this.crs_No = crs_No;
	}
	public String getCrs_name() {
		return crs_name;
	}
	public void setCrs_name(String crs_name) {
		this.crs_name = crs_name;
	}
	
}
