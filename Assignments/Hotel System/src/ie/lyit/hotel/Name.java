package ie.lyit.hotel;

import java.io.Serializable;

public class Name implements Serializable{
	private String title;
	private String firstName;
	private String surname;
	
public Name(){
		this.title="";
		this.firstName="";
		this.surname="";	
	}
	
public Name(String t, String fN, String sN) {
	title = t;
	firstName = fN;
	surname = sN;	
}

public String getTitle() {
	return title;	
}

public String getFname() {
	return firstName;	
}

public String getSurname() {
	return surname;	
}


public void setTitle ( String t ) {
	title = t;	
}

public void setFname ( String fN ) {
	firstName = fN;
}

public void setSurname ( String sN ) {
	surname = sN;
}

@Override
public String toString(){
	return(title + " " + firstName + " " + surname);
}
	

public boolean equals(Object obj) {
	Name nObject;
	if (obj instanceof Name)
		nObject = (Name )obj;
	else
		return false;
	
	return this.title.equals(nObject.title)
			&& this.firstName.equals(nObject.firstName)
			&& this.surname.equals(nObject.surname);
}


public boolean isFemale() {
	if(title.equalsIgnoreCase("Miss") || title.equalsIgnoreCase("Ms")|| title.equalsIgnoreCase("Mrs"))
		return true;
	else
		return false;
}

}
