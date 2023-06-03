package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {

	@Test
	void testGetCandyWeight() {
		Candy c = new Candy("Nerds",1.2,0.98,"Bag");
		assertEquals(1.2,c.getCandyWeight());
	}

	@Test
	void testSetCandyWeight() {
		Candy c = new Candy("Nerds",1.2,0.98,"Bag");
		c.setCandyWeight(1.6);
		assertEquals(1.6,c.getCandyWeight());
	}

	@Test
	void testGetPricePerPound() {
		Candy c = new Candy("Nerds",1.2,0.98,"Bag");
		assertEquals(0.98,c.getPricePerPound());
	}
	@Test
	void testSetPricePerPound() {
		Candy c = new Candy("Nerds",1.2,0.98,"Bag");
		c.setPricePerPound(1.02);
		assertEquals(1.02,c.getPricePerPound());
	}
	void testCalculateCost() {
		Candy c = new Candy("Nerds",1.2,0.98,"Bag");
		assertEquals(c.getCandyWeight()*c.getPricePerPound(),c.calculateCost());
	}
	@Test
	void testCalculateTax() {
		Candy c = new Candy("Nerds",1.2,0.98,"Bag");
		
		assertEquals(c.calculateCost()*(c.getTaxPercent()/100),c.calculateTax());
	}
	@Test
	void testIsSameAs() {
		Candy c1 = new Candy("Nerds",1.2,0.98,"Bag");
		Candy c2 = new Candy("Nerds",1.5,0.98,"Bag");
		//assertTrue(c1.getName()==c2.getName());
		assertTrue(c1.isSameAs(c2));
		
		c1 = new Candy("Nerds",1.5,0.70,"Bag");
		c2 = new Candy("Nerds",1.5,0.98,"Bag");
		
		assertFalse(c1.isSameAs(c2));
	}
	

}
