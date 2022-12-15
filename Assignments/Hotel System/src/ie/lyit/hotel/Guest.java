package ie.lyit.hotel;

public class Guest extends Person {

	private String email;
	private CreditCard	creditCard;
	
	public Guest() {
		super();
		email = "";
	}
	
	
	// Overloaded initialization constructor
	// Called when a guest object is created like this
	//
	//
	//
	
	public Guest(Name name, String phoneNo, String email, CreditCard creditCard) {
		super(name, phoneNo);
		this.email=email;
		this.creditCard=creditCard;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + email + ".";
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public CreditCard getCreditCard() {
		return creditCard;
	}
	
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	
}
