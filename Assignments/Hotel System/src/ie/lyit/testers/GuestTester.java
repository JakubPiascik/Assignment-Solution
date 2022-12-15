package ie.lyit.testers;

import java.util.ArrayList;

import ie.lyit.hotel.CreditCard;
import ie.lyit.hotel.Date;
import ie.lyit.hotel.Guest;
import ie.lyit.hotel.Name;

public class GuestTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create arrayList
		ArrayList<Guest> guests = new ArrayList<Guest>();
		
		//Construct g1
		Name homer = new Name("Mr", "Homer", "Simpson");
		CreditCard homersCard = new CreditCard(111122223334444L,
												new Date(31,12,2027), 111);
		
		Guest g1 = new Guest(homer,"087 1234567", "homer.simpson@atu.ie", homersCard);
		
		//Construct g2
		Name marge = new Name("Mrs", "Marge", "Simpson");
		CreditCard margesCard = new CreditCard(5555666677778888L,
												new Date(31,11,2028), 222);	
	
		Guest g2 = new Guest(marge, "086 1234567", "marge.simpson@atu.ie", margesCard);
		//add guests to arrayList
		guests.add(g1);
		guests.add(g2);
		//print out ArrayList
		System.out.println("LIST OF GUESTS");
		for(Guest g : guests)
		System.out.println(g);
		
		//gender Count
		int femaleCount=0, maleCount=0;
		
		for(Guest g : guests) {
			if(g.getName().isFemale())
				femaleCount ++;
			else
				maleCount ++;
	}
		System.out.println("\nMALE/FEMALE GUEST COUNT");
		System.out.println(maleCount + " Male(S)" + ","+ femaleCount+ " Female(S)");
		
		//Display credit card details
		System.out.println("\nGUEST CREDIT CARD DETAILS");
		for(Guest g : guests) {
			System.out.println(g.getName()+ " Card Number:"+ g.getCreditCard());
		}
		

}
	
}
