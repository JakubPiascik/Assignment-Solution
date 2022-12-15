package ie.lyit.hotel;
 
import java.io.Serializable;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Employee extends Person implements Payable , Serializable {

	private Date dob;
	private Date startDate;
	private double salary;
	private int number;
	
	private static int nextNumber = 10000;
	
	public final double MAX_SALARY = 150000.00;
	
	public Employee() {
		super();
		dob=new Date();	
		startDate = new Date();
		salary=0.0;
		number=nextNumber++;
		
	}
	
	public Employee(Name name, String phoneNumber, 
					Date dob, Date startDate,
					double salary) {
	super(name, phoneNumber);
	this.dob=dob;
	this.startDate=startDate;
	this.salary=salary;
	this.number=nextNumber++;
	}
	
	public String toString() {
		//DecimalForamt df = new DecimalFormant("#.00");
		
		return number+ " " + super.toString()+ "\t €" + salary; //+ df.formant(salary);
	}
	
	public boolean equals(Object obj) {
		Employee eObj;
		if(obj instanceof Employee)
			eObj = (Employee)obj;
		else
			return false;
		
		return(this.number==eObj.number);
	}
	
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public double calculatePay(double taxPercentage) {
		// TODO Auto-generated method stub
		double pay=salary/12;
		pay -=(pay * (taxPercentage/100));
		return pay;
	}

	@Override
	public double incrementSalary(double incrementAmount) {
		// TODO Auto-generated method stub
		salary+= incrementAmount;
		
		if(salary> MAX_SALARY)
			salary = MAX_SALARY;
		
		return salary;
	}
	
	
	// read() - To read a book from the user	
	   public void read(){
	      JTextField txtNumber = new JTextField();
	      txtNumber.setText("" + this.getNumber());
	      JTextField txtTitle = new JTextField();
	      JTextField txtFname = new JTextField();
	      JTextField txtSname = new JTextField();
	      txtTitle.requestFocus();
	     // JTextField txtDOB = new JTextField();
	      JTextField txtSalary = new JTextField();
	     // JTextField txtStartDate = new JTextField();

	      Object[] message = {
	          "Employee Number:", txtNumber,
	          "Employee Title:", txtTitle,
	          "Employee First Name:", txtFname,
	          "Employee Surname:", txtSname,
	          "Salary:", txtSalary,
	         // "Employee DOB:", txtDOB,
	          
	         // "Start Date:", txtStartDate,
	      };
	      
	      JDialog dialog = new JDialog();
	      dialog.setAlwaysOnTop(true);    
	      int option = JOptionPane.showConfirmDialog(dialog, message, "Enter employee details", JOptionPane.OK_CANCEL_OPTION);

	      	if (option == JOptionPane.OK_OPTION){
	           this.name.setTitle(txtTitle.getText());
	           this.name.setFname(txtFname.getText());
	           this.name.setSurname(txtSname.getText());
	           String salaries = txtSalary.getText(); 
	           this.salary = Double.parseDouble(salaries);
	           
	           

}
}
}