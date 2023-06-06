package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testGetName() {
		Customer c = new Customer("Harry");
		assertEquals("Harry",c.getName());
	}
	@Test
	void testSetName() {
		Customer c = new Customer("Harry");
		c.setName("Joseph");
		assertEquals("Joseph",c.getName());
	}
	@Test
	void testGetID() {
		Customer c1 = new Customer("Harry");
		assertEquals(1000,c1.getID());
		
		Customer c2 = new Customer("Joseph");
		assertEquals(1001,c2.getID());
	}

}
