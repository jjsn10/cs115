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
	

}
