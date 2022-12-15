package ie.lyit.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import ie.lyit.hotel.Employee;

public class EmployeeSerializer {

	private ArrayList<Employee> employees;
	
	
	final String FILENAME = "employees.bin";
	
	//Default Constructor 
	public EmployeeSerializer() {
		employees = new ArrayList<Employee>();
	}
	
	
	//Reads in an employee and adds them to the Arraylist
	public void add() {
		//create a employee object
		Employee employee = new Employee();
		//READ the details
		employee.read();
		// Add to array List
		employees.add(employee);
			
	}
	
	
	//List all of the employees
	public void list() {
		String employeesToList = "";
		
		//for every object in employees
		for(Employee tmpEmp : employees) {
			//add it to employessToList and add a new line
			employeesToList+= tmpEmp;
			
			employeesToList+="\n";
		}
		//display employeesToList in a MessageDialog
		JOptionPane.showMessageDialog(null, employeesToList);
	}
	
	public Employee view() {
		//Read the number of the employee to be viewed by the user
		String numberAsString="";
		int employeeToView = 0; 
		
		try {
			numberAsString = JOptionPane.showInputDialog(null, "Enter employee number: ");
			
			//Attempt to convert the string to an Int
			employeeToView = Integer.parseInt(numberAsString);
		}
		catch(NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, numberAsString + " is not a valid number.");
		}
		
		//for every Employee Object in employees
		for(Employee tmpEmp:employees) {
			//if it's number equals the number of the employeeToView
			if(tmpEmp.getNumber() == employeeToView) {
				JOptionPane.showMessageDialog(null,  tmpEmp);
				
				return tmpEmp;
			}
		}
		//if no employee is found return null
		return null;
	}
	
	//edit the required employee
	public void edit() {
		//Call view() to find , display , & return the employee to edit
		Employee tmpEmp = view();
		
		//if the book was found 
		if(tmpEmp != null) {
			//get it's index
			int index = employees.indexOf(tmpEmp);
			//read in a new employee
			tmpEmp.read();
			//reset the object in employees
			employees.set(index, tmpEmp);
		}
	}
	

	//delete employee from employees
	public void delete() {
	//call view to find , display & return the book to delete
	Employee tmpEmp = view();
	
	//if book is found
	if(tmpEmp != null )
		//remove it from employees
		employees.remove(tmpEmp);
}
	
	//write to file
	public void serializeEmployees() {
		ObjectOutputStream os = null ; 
		try {
			//Serialize the ArrayList
			FileOutputStream fileStream = new FileOutputStream(FILENAME);
			
			os = new ObjectOutputStream(fileStream);
			
			os.writeObject(employees);
		}
		catch(FileNotFoundException fNFE) {
			System.out.println("Cannot create a file to store employees");
		}
		catch(IOException ioE) {
			System.out.println("Cannot write to " + FILENAME + ".");
		}
		finally {
			try {
				os.close();
			}
			catch(IOException ioE) {
				System.out.println(ioE.getMessage());
			}
		}
	}
	
	//restore from file
	public void deserializeEmployees() {
		ObjectInputStream is = null;
		
		try {
			//deserialize the arraylist
			FileInputStream fileStream = new FileInputStream(FILENAME);
			
			is = new ObjectInputStream(fileStream);
			
			employees=(ArrayList<Employee>)is.readObject();
		}
		catch(FileNotFoundException fNFE) {
			System.out.println("Cannot create file to store employees");
		}
		
		catch(IOException ioE) {
			System.out.println("Cannot read from " + FILENAME + ".");
		}
		
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			try {
				is.close();
			}
			catch(IOException ioE) {
				System.out.println(ioE.getMessage());
			}
		}
		
	}
	

}//close class
