package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest {

	@Test
	void testGetToppingName() {
		Sundae s = new Sundae("Strawberry Sundae",2,5.2,"Chooped nuts",0.85);
		assertEquals("Chooped nuts",s.getToppingName());
	}

	@Test
	void testSetToppingName() {
		Sundae s = new Sundae("Strawberry Sundae",2,5.2,"Chooped nuts",0.85);
		s.setToppingName("Sprinkles");
		assertEquals("Sprinkles",s.getToppingName());
	}

	@Test
	void testGetToppingPrice() {
		Sundae s = new Sundae("Strawberry Sundae",2,5.2,"Chooped nuts",0.85);
	    assertEquals(0.85,s.getToppingPrice());
	}

	@Test
	void testSetToppingPrice() {
		Sundae s = new Sundae("Strawberry Sundae",2,5.2,"Chooped nuts",0.85);
		s.setToppingPrice(0.95);
		assertEquals(0.95,s.getToppingPrice());
	}

}
