package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest {

	@Test
	void testGetToppingName() {
		Sundae s = new Sundae("Strawberry Sundae",2,5.2,"Chooped nuts",0.85,"Boat");
		assertEquals("Chooped nuts",s.getToppingName());
	}

	@Test
	void testSetToppingName() {
		Sundae s = new Sundae("Strawberry Sundae",2,5.2,"Chooped nuts",0.85,"Boat");
		s.setToppingName("Sprinkles");
		assertEquals("Sprinkles",s.getToppingName());
	}

	@Test
	void testGetToppingPrice() {
		Sundae s = new Sundae("Strawberry Sundae",2,5.2,"Chooped nuts",0.85,"Boat");
	    assertEquals(0.85,s.getToppingPrice());
	}

	@Test
	void testSetToppingPrice() {
		Sundae s = new Sundae("Strawberry Sundae",2,5.2,"Chooped nuts",0.85,"Boat");
		s.setToppingPrice(0.95);
		assertEquals(0.95,s.getToppingPrice());
	}
	@Test
	void testCalculateCost() {
		Sundae s = new Sundae("Strawberry Sundae",2,5.2,"Chooped nuts",0.85,"Boat");
		assertEquals(s.getScoopCount()*s.getPricePerScoop()+s.getToppingPrice(),s.calculateCost());
	}
	@Test
	void testCalculateTax() {
		Sundae s = new Sundae("Strawberry Sundae",2,5.2,"Chooped nuts",0.85,"Boat");
		assertEquals(s.calculateCost()*(s.getTaxPercent()/100),s.calculateTax());
	}

}
