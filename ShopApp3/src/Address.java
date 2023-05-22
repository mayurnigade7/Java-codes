
public class Address {
	private String City;
	private String State;
	private int Pin;
	public Address(String city, String state, int pin) {
		super();
		City = city;
		State = state;
		Pin = pin;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	
	

}
