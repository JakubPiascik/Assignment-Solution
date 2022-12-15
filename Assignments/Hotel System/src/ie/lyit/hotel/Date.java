package ie.lyit.hotel;

import java.io.Serializable;

public class Date implements Serializable{

	private int day , month , year;

	public Date()
	{
		this.day=0; //////////////////////////////
		this.month=0; // No parameter Constructor //
		this.year=0;
	}

	public Date(int d  , int m , int y)throws IllegalArgumentException //Constructor
	{
		if(d < 1 || d >31 || m < 1 || month > 12 || year < 1900)
		this.day=d; //////////////////////////////
		this.month=m; // No parameter Constructor //
		this.year=y;
	}

	public void setDay(int setDayTo)throws IllegalArgumentException{ //set Title Method
		if(setDayTo < 1 || setDayTo > 31)
			throw new IllegalArgumentException("Trying to set invalid day");
		day=setDayTo; 
	} 
	public int getDate() //get title method
	{
		return day;
	}

	public void setMonth(int setMonthTo)throws IllegalArgumentException{ //set first name method
		if(setMonthTo < 1 || setMonthTo > 12)
			throw new IllegalArgumentException("Trying to set invalid month");
		month=setMonthTo; 
	} 
	public int getMonth() //get first name method
	{
		return month;
	}

	public void setYear(int setYearTo)throws IllegalArgumentException{ //set surname method
		if(setYearTo < 1900)
			throw new IllegalArgumentException("Trying to set invalid year"); 
		year=setYearTo; 
	} 
	public int getYear() //get surname method
	{
		return year;
	}


	public String toString()
	{
		return(day + "/"+ month +"/" + year);
	}


	public boolean equals(Object obj)
	{
		Date dObject;
		if(obj instanceof Date)
			dObject = (Date)obj;
		else 
			return false;

		return (this.day ==(dObject.day)
				&&this.month ==(dObject.month)
				&&this.year ==(dObject.year));
	}
}

//	}
// }
