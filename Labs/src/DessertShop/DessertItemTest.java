package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertItemTest {

	@Test
	void testGetName() {
		Candy d = new Candy("Granola Bar",1.2,0.98,"Bag");
		assertEquals("Granola Bar", d.getName());
	}
	@Test
	void testSetName() {
		Candy d = new Candy("Granola Bar",1.2,0.98,"Bag");
		d.setName("Cheese Cake");
		assertEquals("Cheese Cake",d.getName());
	}
	@Test
	void testGetTaxPercent() {
		Candy d = new Candy("Granola Bar",1.2,0.98,"Bag");
		assertEquals(7.25,d.getTaxPercent());
	}
	@Test
	void testSetTaxPercent() {
		Candy d = new Candy("Granola Bar",1.2,0.98,"Bag");
		d.setTaxPercent(7.5);
		assertEquals(7.5,d.getTaxPercent());
	}
	

}
