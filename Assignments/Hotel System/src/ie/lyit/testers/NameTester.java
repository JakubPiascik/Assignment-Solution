package ie.lyit.testers;

import java.util.ArrayList;

import ie.lyit.hotel.Name;

public class NameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name personA = new Name();
		
		
		personA.setTitle("Mr");
		personA.setFname("Damian");
		personA.setSurname("Kos");
		
		
		System.out.println(personA);
		
		if(personA.isFemale())
			System.out.println(personA + " is a female");
		else 
			System.out.println(personA + " is not a female");
		
		Name personB = new Name("Mrs", "Marge", "Simpson");
		
		System.out.println(personB);
		
		if(personB.isFemale())
			System.out.println(personB + " is a female");
		else 
			System.out.println(personB + " is not a female");
		
		
		if(personA.equals(personB))
			System.out.println(personA + " is the same as "+ personB);
		else
			System.out.println(personA + " is not the same as "+ personB);

		ArrayList<Name> names = new ArrayList<Name>();
			names.add(new Name("Mr", "Bart", "Simpson"));
			names.add(personA);
			names.add(personB);
			names.trimToSize();
		
		for(Name tempName:names)
			System.out.println(tempName);
		
	}

}
