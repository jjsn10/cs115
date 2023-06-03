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
	@Test
	void testCompareTo() {
		Candy d1 = new Candy("Granola Bar",1.2,0.98,"Bag");
		Candy d2 = new Candy("Gummy Bears",0.25,0.35,"Bag");
		
		assertEquals(-1,d2.calculateCost().compareTo(d1.calculateCost()));
		
		d1 = new Candy("Granola Bar",1.2,0.35,"Bag");
		d2 = new Candy("Gummy Bears",1.5,0.35,"Bag");
		
		assertEquals(1,d2.calculateCost().compareTo(d1.calculateCost()));
		
		d1 = new Candy("Granola Bar",1.5,0.35,"Bag");
		d2 = new Candy("Gummy Bears",1.5,0.35,"Bag");
		
		assertEquals(0,d2.calculateCost().compareTo(d1.calculateCost()));
		
		
		
	}
	

}
