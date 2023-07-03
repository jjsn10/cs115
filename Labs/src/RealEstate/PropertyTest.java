package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PropertyTest {

	@Test
	void testGetStreetAddress() {
		Condo c = new Condo("1949 N 900 W, Provo UT","84064",3, 2, 600.00,2);
		assertEquals("1949 N 900 W, Provo UT",c.getStreetAddress());
	}

	@Test
	void testSetStreetAddress() {
		Condo c = new Condo("1949 N 900 W, Provo UT","84064",3, 2, 600.00,2);
		c.setStreetAddress("136 E 400 N");
		assertEquals("136 E 400 N", c.getStreetAddress());
	}

	@Test
	void testGetZip() {
		Condo c = new Condo("1949 N 900 W, Provo UT","84064",3, 2, 600.00,2);
		assertEquals("84064",c.getZip());
	}

	@Test
	void testSetZip() {
		Condo c = new Condo("1949 N 900 W, Provo UT","84064",3, 2,600.00,2);
		c.setZip("84046");
		assertEquals("84046",c.getZip());
	}
	@Test
	void testSetListPrice() {
		House h = new House("1949 N 900 W Provo, UT", "84604",3,2,2256.50,250);
		h.setListPrice(550000.00);
		assertEquals(550000.00,h.getListPrice());
	}
	@Test
	void testGetListPrice() {
		House h = new House("1949 N 900 W Provo, UT", "84604",3,2,2256.50,250);
		assertEquals(0,h.getListPrice());
	}

}
