package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	@Test
	void testGetCookieQty() {
		Cookie ck = new Cookie("Chips Ahoy",12,5.6,"Box");
		assertEquals(12,ck.getCookieQty());
	}

	@Test
	void testSetCookieQty() {
		Cookie ck = new Cookie("Chips Ahoy",12,5.6,"Box");
		ck.setCookieQty(24);
		assertEquals(24,ck.getCookieQty());
	}

	@Test
	void testGetPricePerDozen() {
		Cookie ck = new Cookie("Chips Ahoy",12,5.6,"Box");
		assertEquals(5.6, ck.getPricePerDozen());
	}

	@Test
	void testSetPricePerDozen() {
		Cookie ck = new Cookie("Chips Ahoy",12,5.6,"Box");
		ck.setPricePerDozen(6.2);
		assertEquals(6.2,ck.getPricePerDozen());
	}
	void testCalculateCost() {
		Cookie ck = new Cookie("Chips Ahoy",12,5.6,"Box");
		assertEquals(ck.getCookieQty()*(ck.getPricePerDozen()/12),ck.calculateCost());
	}
	@Test
	void testCalculateTax() {
		Cookie ck= new Cookie("Chips Ahoy",12,5.6,"Box");
		assertEquals(ck.calculateCost()*(ck.getTaxPercent()/100),ck.calculateTax());
	}

}
