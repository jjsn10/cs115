package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CondoTest {

	@Test
	void testGetFloorLvl() {
		Condo c = new Condo("1949 N 900 W, Provo UT","84064",3, 2, 2256.25,2);
		assertEquals(2, c.getFloorLvl());
	}
	@Test
	void testSetFloorLvl() {
		Condo c = new Condo("1949 N 900 W, Provo UT","84064",3, 2, 2256.25,2);
		c.setFloorLvl(4);
		assertEquals(4, c.getFloorLvl());
	}

}
