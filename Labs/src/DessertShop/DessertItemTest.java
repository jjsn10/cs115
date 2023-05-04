package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertItemTest {

	@Test
	void testGetName() {
		DessertItem d = new DessertItem("Granola Bar");
		assertEquals("Granola Bar", d.getName());
	}
	@Test
	void testSetName() {
		DessertItem d = new DessertItem("Granola Bar");
		d.setName("Cheese Cake");
		assertEquals("Cheese Cake",d.getName());
	}
	

}
