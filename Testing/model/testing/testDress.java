package model.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Dress;

class testDress {

	Dress dress= new Dress(0, null, null, null, 0);
	
	
	@BeforeEach
	void setUp() throws Exception{
		
	}
	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void testGetPrice() {
		dress.setPrice(24);
		assertEquals(24, dress.getPrice());
		//shows that the price assigned is 24
		//price expected is 24 and the test confirms this
	}
	@Test
	void testGetTagNumber() {
		dress.setTagNumber("L50247");
		assertEquals("L50247", dress.getTagNumber());
		//shows that the tag number was set to "L50247"
		//number expected is "L50247" and the test confirms this
	}
	@Test
	void testGetColor() {
		dress.setColor("Black");
		assertEquals("Black", dress.getColor());
		//shows that the color was set to "Black"
		//color expected is "Black" and the test confirms this
	}
	@Test
	void testGetSize() {
		dress.setSize("Large");
		assertEquals("Large", dress.getSize());
		//Shows that the size was set to "Large"
		//size expected is "Large" and the test confirms this
	}
	@Test
	void testGetInStock() {
		dress.setInstock(4);
		assertEquals(4, dress.getInStock());
		//shows the inStock number was set to 4
		//inStock expected is 4 and test confirms this 
	}
}
