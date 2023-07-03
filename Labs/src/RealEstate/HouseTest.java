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
	@Test
	void testCalculateAppraisalPrice() {
		House h = new House("1949 N 900 W Provo, UT", "84604",3,2,2256.50,250);
		//price = 218,880.5
		//bedCount = 3*10,000 => 30,000
		//bathCount = 2*12,000 => 24,000
		//sqFootage = 2256.50
		//yardAccres = 250*460000.00 =>115000000
		assertEquals(218880.50+30000+24000+115000000,h.calculateAppraisalPrice());
	}

}
