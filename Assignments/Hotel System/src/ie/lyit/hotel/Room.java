package ie.lyit.hotel;

public class Room {
	
	private int maxAdults;
	private int maxKids;
	private double pricePerNight;
	private boolean allocated = false;
	private  int number;
	
	public Room(int maxAdults, int maxKids, double pricePerNight, int number) {
		this.maxAdults = maxAdults;
		this.maxKids = maxKids;
		this.pricePerNight = pricePerNight;
		this.number = number;
	}
	
	public Room(int number){
	    this.number = number;
	    this.maxAdults = 2;
	    this.maxKids = 3;
	    this.pricePerNight = 60.0;
	    this.allocated = false;
	  }
	
	@Override
	public String toString() {
		return "This room has a maximum of " + maxAdults + " adults, and a maximum of "
				+ maxKids + " kids, the price per night is " + pricePerNight;
	}
	
	@Override
	public boolean equals(Object obj) {
		Room rObject;
		if (obj instanceof Room)
			rObject = (Room)obj;
		else
			return false;
		
		return number == rObject.number;
	}

	public void setMaxAdults(int maxAdults) throws Exception {
		if (maxAdults < 1)
	    {
	      throw new Exception("A room must accommodate at least one adult.");
	    }
		this.maxAdults = maxAdults;
	}
	public int getMaxAdults() {
		return maxAdults;
	}

	public void setMaxKids(int maxKids) {
		this.maxKids = maxKids;
	}
	public int getMaxKids() {
		return maxKids;
	}
	
	public void setPricePerNight(double pricePerNight) throws Exception {
		 if (pricePerNight < 60.0)
		    {
		      throw new Exception("The minimum price per night is €60.00.");
		    }
		this.pricePerNight = pricePerNight;
	}
	public double getPricePerNight() {
		return pricePerNight;
	}
	
	public void setAllocated(boolean allocated) {
		this.allocated = allocated;
	}
	
	public boolean getAllocated() {
		return allocated;
		}
	
	
}
