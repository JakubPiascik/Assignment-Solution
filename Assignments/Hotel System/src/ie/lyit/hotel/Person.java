package ie.lyit.hotel;

import java.io.Serializable;

public abstract class Person implements Serializable{
	
	protected Name name; 
	protected String phoneNo;

	public Person() {
		name = new Name();
		phoneNo="";	
	}
	
	
	public Person(Name name, String phoneNo) {
		this.name=name;
		this.phoneNo=phoneNo;
	}
	
	
	public String toString() {
		return name + "\t" + phoneNo;
	}
	
	public boolean equals(Object obj) {
		Person pObj;
		if(obj instanceof Person)
			pObj = (Person)obj;
		else
			return false;
		
		return name.equals(pObj.name)&&
				phoneNo.equals(pObj.phoneNo);
	}
	public Name getName() {
		return name;
	}
	
	public void setName(Name name)
	{
		this.name=name;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	
	
}
