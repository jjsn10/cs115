package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CondoTest {

	@Test
	void testGetFloorLvl() {
		Condo c = new Condo("1949 N 900 W, Provo UT","84064",3, 2, 600.00,2);
		assertEquals(2, c.getFloorLvl());
	}
	@Test
	void testSetFloorLvl() {
		Condo c = new Condo("1949 N 900 W, Provo UT","84064",3, 2, 600.00,2);
		c.setFloorLvl(4);
		assertEquals(4, c.getFloorLvl());
	}
	@Test
	void testCalculateAppraisalPrice() {
		Condo c = new Condo("1949 N 900 W, Provo UT","84064",3, 2, 600.00,2);
		//price = 52,800
		//bedCount = 3*8,000 => 24,000
		//bathCount = 2*10,000 => 20,000
		//sqFootage = 600.00
		//levelFloor = (2-1)*5,000 =>5000
		assertEquals(52800.00+24000.00+20000.00+5000.00,c.calculateAppraisalPrice());
	}

}
