package ie.lyit.hotel;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoomTester {

	private Room r1;
	
	
	@BeforeEach
	void setUp() throws Exception {
		r1 = new Room(2,3,80.0, 40);
	}
	@Test//(expected = IllegalArgumentException.class)
	void testRoomIntIntDoubleInt() {
		r1 = new Room( 5, 18 , 10.0 , 21);
	}

	@Test
	void testToString() {
		assertEquals(r1.toString(),"This room has a maximum of " + 2 + " adults, and a maximum of "
				+ 3 + " kids, the price per night is " + 80.0);
		}
	

	@Test
	void testSetMaxAdults() throws Exception {
		r1.setMaxAdults(3);
		
		assertTrue(r1.getMaxAdults()==3);
	}

	@Test
	void testSetMaxKids() {
		r1.setMaxKids(1);
		
		assertTrue(r1.getMaxKids()==1);
	}

	@Test
	void testSetPricePerNight() throws Exception {
		r1.setPricePerNight(70.0);
		
		assertTrue(r1.getPricePerNight() ==70.0);
	}

	@Test
	void testSetAllocated() {
		r1.setAllocated(true);
		
		assertTrue(r1.getAllocated()==true);
	}
	
	
}
