package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseTest {

	@Test
	void testGetYardAcres() {
		House h= new House("1949 N 900 W Provo UT","84064",3, 2,2256.25,2.5);
		assertEquals(2.5,h.getYardAcres());
	}

	@Test
	void testSetYardAcres() {
		House h= new House("1949 N 900 W Provo UT","84064",3, 2,2256.25,2.5);
		h.setYardAcres(2.7);
		assertEquals(2.7,h.getYardAcres());
	}

}
