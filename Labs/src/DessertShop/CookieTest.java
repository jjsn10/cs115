package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	@Test
	void testGetCookieQty() {
		Cookie ck = new Cookie("Chips Ahoy",12,5.6);
		assertEquals(12,ck.getCookieQty());
	}

	@Test
	void testSetCookieQty() {
		Cookie ck = new Cookie("Chips Ahoy",12,5.6);
		ck.setCookieQty(24);
		assertEquals(24,ck.getCookieQty());
	}

	@Test
	void testGetPricePerDozen() {
		Cookie ck = new Cookie("Chips Ahoy",12,5.6);
		assertEquals(5.6, ck.getPricePerDozen());
	}

	@Test
	void testSetPricePerDozen() {
		Cookie ck = new Cookie("Chips Ahoy",12,5.6);
		ck.setPricePerDozen(6.2);
		assertEquals(6.2,ck.getPricePerDozen());
	}
	@Test
	void testCalculateCost() {
<<<<<<< HEAD
		Cookie c = new Cookie("Chips Ahoy",12,5.6);
		assertEquals(c.getCookieQty()*(c.getPricePerDozen()/12),c.calculateCost());
		
	}
	@Test
	void testCalculateTax() {
		Cookie c = new Cookie("Chips Ahoy",12,5.6);
		assertEquals(c.calculateCost()*(c.getTaxPercent()/100),c.calculateTax());
=======
		Cookie ck = new Cookie("Chips Ahoy",12,5.6);
		assertEquals(ck.getCookieQty()*(ck.getPricePerDozen()/12),ck.calculateCost());
	}
	@Test 
	void testCalculateTax() {
		Cookie ck = new Cookie("Chips Ahoy",12,5.6);
		assertEquals(ck.calculateCost()*(ck.getTaxPercent()/100),ck.calculateTax());
>>>>>>> dc372b2384ee67d4179f21c52db3998e0f1a2451
	}

}
