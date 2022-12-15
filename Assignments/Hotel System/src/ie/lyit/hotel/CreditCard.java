package ie.lyit.hotel;

public class CreditCard {

	private long number;
	private Date date;
	private int securityCode;
		
public CreditCard(long number, Date date, int securityCode) {
	this.number = number;
	this.date = date;
	this.securityCode = securityCode; 
}
@Override
public String toString(){
	return " " + number;
}	
@Override
public boolean equals(Object obj) {
	CreditCard ccObject;
	if (obj instanceof CreditCard)
		ccObject = (CreditCard)obj;
	else
		return false;
	
	return number == ccObject.number;
}

public long getNumber() {
	return number;
}

public Date getDate() {
	return date;
}

public long getSecurityCode() {
	return securityCode;
}



}

