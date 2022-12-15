package ie.lyit.testers;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import ie.lyit.hotel.CreditCard;
import ie.lyit.hotel.Date;
import ie.lyit.hotel.Guest;
import ie.lyit.hotel.Name;



public class ExceptionHandlerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Guest> hotelGuests = new ArrayList<Guest>();
		
		//Construct g1
		Name homer = new Name("Mr", " Homer", "Simpson");
		CreditCard homersCard = new CreditCard(111122223334444L,
												new Date(31,12,2027), 111);
		
		Guest g1 = new Guest(homer,"087 1234567", "homer.simpson@atu.ie", homersCard);
		
		//Construct g2
		Name marge = new Name("Mrs", "Marge", "Simpson");
		CreditCard margesCard = new CreditCard(5555666677778888L,
												new Date(31,11,2028), 222);	
	
		Guest g2 = new Guest(marge, " 086 1234567", "marge.simpson@atu.ie", margesCard);
		
		//Construct g3
		Name damian = new Name("Mr", "Enda", "Doran");
		CreditCard damiansCard = new CreditCard(6666777788889999L, 
												new Date(29,10,2030), 333);
		
		Guest g3 = new Guest(damian, " 085 1234567", "damian.kos@atu.ie", damiansCard);

		//Construct g4
		Name aaron = new Name("Mr", "Aaron", "Bonner");
		CreditCard aaronsCard = new CreditCard(7777888899990000L, 
				new Date(21,12,2025), 444);

		Guest g4 = new Guest(aaron, " 089 1234567", "aaron.Bonner@atu.ie", aaronsCard);
		//add guests to arrayList
		hotelGuests.add(g1);
		hotelGuests.add(g2);
		hotelGuests.add(g3);
		hotelGuests.add(g4);
		
		
		boolean goodInput = false;

		String guestNumberToViewAsString="";
		do {
			try {
				guestNumberToViewAsString=JOptionPane.showInputDialog(null,
						"Enter Guest to View ("+1+" to "+hotelGuests.size()+")");
				int guestNo = Integer.parseInt(guestNumberToViewAsString);
				JOptionPane.showMessageDialog(null,hotelGuests.get(guestNo-1));
				goodInput = true;
			}

			catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, guestNumberToViewAsString
						+ " is not a valid number , please re-enter.");
			}
			catch(IndexOutOfBoundsException ioobe) {
				JOptionPane.showMessageDialog(null, "You must chose a guest from (" + 1 + 
						" to " + hotelGuests.size()+ ")" + 
						", please re-enter.");	

			}
		}while(!goodInput);
		
		
//		System.out.println("LIST OF GUESTS");
//		for(Guest g : hotelGuests)
//			System.out.println(g);
//
//		System.out.println("");
//		for(Guest g : hotelGuests) {
//			System.out.println(g.getName()+ " Card Number:"+ g.getCreditCard());
		}
		
	}






//package ie.lyit.testers;
//
//import java.util.ArrayList;
//
//import javax.swing.JOptionPane;
//
//import ie.lyit.hotel.CreditCard;
//import ie.lyit.hotel.Date;
//import ie.lyit.hotel.Guest;
//import ie.lyit.hotel.Name;
//import ie.lyit.hotel.Person;
//
//public class ExceptionHandlerDemo {
//
//	public static void main(String[] args) {
//	    Name n1 = new Name("Mr","Mark","Harkin");
//		CreditCard marksCard=new CreditCard(9999888877776666L,new Date(31,12,2027),999);
//	    Guest g1 = new Guest(n1, "087 1234567", "mark.harkin@pramerica.com",marksCard);	
//
//	    Name n2 = new Name("Mrs","Sarah","Coyle");
//		CreditCard sarahsCard=new CreditCard(8888777766665555L,new Date(30,11,2026),888);
//	    Guest g2 = new Guest(n2, "086 1234567", "sarah.coyle@optum.ie",sarahsCard);
//	    
//	    Name n3 = new Name("Mrs","Zoe","Collins");
//		CreditCard zoesCard=new CreditCard(7777666655554444L,new Date(31,10,2025),777);
//	    Guest g3 = new Guest(n3, "087 7654321", "zoe.collins@lyit.ie",zoesCard);
//	    
//	    Name n4 = new Name("Ms","Donna","Swann");
//		CreditCard donnasCard=new CreditCard(6666555544443333L,new Date(30,9,2024),666);
//	    Guest g4 = new Guest(n4, "086 7654321","donna.swann@prudential.ie",donnasCard);
//	
//	    ArrayList<Person> hotelGuests = new ArrayList<Person>();
//	    hotelGuests.add(g1);
//	    hotelGuests.add(g2);
//	    hotelGuests.add(g3);
//	    hotelGuests.add(g4);		
//	    
//	    String guestNumberToViewAsString="";
//	    boolean goodInput=false;
//	    do{
//			try {
//			    guestNumberToViewAsString=JOptionPane.showInputDialog(null,"Enter Guest to View ("+1+" to "+hotelGuests.size()+")");
//		        
//				// Attempt to convert the String to an Int
//				int guestNumberToView = Integer.parseInt(guestNumberToViewAsString);
//				
//				JOptionPane.showMessageDialog(null,hotelGuests.get(guestNumberToView-1));
//				//System.out.println(hotelGuests.get(guestNumberToView-1));
//				goodInput=true;
//			}
//			catch(NumberFormatException nfe) {
//				JOptionPane.showMessageDialog(null, guestNumberToViewAsString + " is not a valid number, please re-enter.");
//			}
//			catch(IndexOutOfBoundsException iobe) {
//				JOptionPane.showMessageDialog(null, "You must choose a guest from (" + 1 + " to " + hotelGuests.size() + ")" + ", please re-enter.");
//			}
//		}while(!goodInput);
//	    
//	    goodInput=false;
//	    int day=55,month=13,year=-200;
//	    Date d1=new Date();
//	    do {
//	    	try {
//			    d1.setDay(day);d1.setMonth(month); d1.setYear(year);
//			    JOptionPane.showMessageDialog(null,d1);
//			    goodInput=true;
//		    }
//		    catch(IllegalArgumentException iae) {
//		    	JOptionPane.showMessageDialog(null,"Invalid Date, re-enter.");
//
//			    String dayAsString=JOptionPane.showInputDialog(null,"Day (1-31):");
//			    day = Integer.parseInt(dayAsString);
//			    String monthAsString=JOptionPane.showInputDialog(null,"Month (1-12):");
//			    month = Integer.parseInt(monthAsString);
//			    String yearAsString=JOptionPane.showInputDialog(null,"Year (not less than 1900):");
//			    year = Integer.parseInt(yearAsString);
//		    }
//	    }while(!goodInput);
//	    
//	    day=62;month=15;year=10;
//	    goodInput=false;
//	    
//	    do {
//		    try {
//			    Date d2=new Date(day,month,year);
//			    JOptionPane.showMessageDialog(null,d2);
//			    goodInput=true;
//		    }
//		    catch(IllegalArgumentException iae) {
//		    	JOptionPane.showMessageDialog(null,"Invalid Date, re-enter.");
//		    	
//			    String dayAsString=JOptionPane.showInputDialog(null,"Day (1-31):");
//			    day = Integer.parseInt(dayAsString);
//			    String monthAsString=JOptionPane.showInputDialog(null,"Month (1-12):");
//			    month = Integer.parseInt(monthAsString);
//			    String yearAsString=JOptionPane.showInputDialog(null,"Year (not less than 1900):");
//			    year = Integer.parseInt(yearAsString);
//		    }
//	    }while(!goodInput);
//	}
//
//}


