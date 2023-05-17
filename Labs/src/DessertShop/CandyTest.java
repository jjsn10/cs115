package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {

	@Test
	void testGetCandyWeight() {
		Candy c = new Candy("Nerds",1.2,0.98);
		assertEquals(1.2,c.getCandyWeight());
	}

	@Test
	void testSetCandyWeight() {
		Candy c = new Candy("Nerds",1.2,0.98);
		c.setCandyWeight(1.6);
		assertEquals(1.6,c.getCandyWeight());
	}

	@Test
	void testGetPricePerPound() {
		Candy c = new Candy("Nerds",1.2,0.98);
		assertEquals(0.98,c.getPricePerPound());
	}
	@Test
	void testSetPricePerPound() {
		Candy c = new Candy("Nerds",1.2,0.98);
		c.setPricePerPound(1.02);
		assertEquals(1.02,c.getPricePerPound());
	}
	

}
