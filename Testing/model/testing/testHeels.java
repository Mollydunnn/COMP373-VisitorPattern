package model.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Heels;

class testHeels {

	Heels heels= new Heels(0, null, null, 0, 0);
	
	@BeforeEach
	void setUp() throws Exception{
		
	}
	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void testGetPrice() {
		heels.setPrice(30);
		assertEquals(30, heels.getPrice());
		//shows that the price assigned is 30
		//price expected is 30 and the test confirms this
	}
	@Test
	void testGetTagNumber() {
		heels.setProductNum("S53943");
		assertEquals("S53943", heels.getProductNum());
		//shows that the product number was set to "S53943"
		//number expected is "S53943" and the test confirms this
	}
	@Test
	void testGetColor() {
		heels.setColor("Red");
		assertEquals("Red", heels.getColor());
		//shows that the color was set to "Red"
		//color expected is "Red" and the test confirms this
	}
	@Test
	void testGetSize() {
		heels.setSize(10);
		assertEquals(10, heels.getSize());
		//Shows that the size was set to 10
		//size expected is 10 and the test confirms this
	}
	@Test
	void testGetInStock() {
		heels.setInstock(6);
		assertEquals(6, heels.getInStock());
		//shows the inStock number was set to 6
		//inStock expected is 6 and test confirms this 
	}
}
