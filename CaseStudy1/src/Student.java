
public class Student {
	private int std_id;
	public int getStd_id() {
		return std_id;
	}
	public Student(int std_id, String std_name, int std_Dob) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_Dob = std_Dob;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public int getStd_Dob() {
		return std_Dob;
	}
	public void setStd_Dob(int std_Dob) {
		this.std_Dob = std_Dob;
	}
	private String std_name;
	private int std_Dob;

}
