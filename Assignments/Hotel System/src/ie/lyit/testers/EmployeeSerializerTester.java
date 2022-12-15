package ie.lyit.testers;


import ie.lyit.hotel.Menu;
import ie.lyit.serialize.EmployeeSerializer;

public class EmployeeSerializerTester {

	public static void main(String[] args) {
			EmployeeSerializer employeeSerializer = new EmployeeSerializer();

			// Read the ArrayList from the File in books
			// THIS DESERIALIZES THE ARRAYLIST
			
			employeeSerializer.deserializeEmployees();
			
		    // Create a Menu Object
			Menu menuObj = new Menu();
			
			do {
				// Call it's display() method
				menuObj.display();
				// Call it's readOption() method
				menuObj.readOption();
		
				
				//read last id from arraylist
				
				// switch on the option and call the appropriate method
				switch(menuObj.getOption()){
				   case 1:employeeSerializer.add();break;
				   case 2:employeeSerializer.list();break;
				   case 3:employeeSerializer.view();break;
				   case 4:employeeSerializer.edit();break;
				   case 5:employeeSerializer.delete();break;
				   case 6:break;				
				   default:System.out.println("INVALID OPTION...");
				}
			}while(menuObj.getOption() != 6);
			
			// Write the books ArrayList to File
			// THIS SERIALIZES THE ARRAYLIST		
			employeeSerializer.serializeEmployees();
		
	}

}
