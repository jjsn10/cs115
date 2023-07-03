package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidentialTest {

	@Test
	void testGetBedCount() {
		House h = new House("1949 N 900 W Provo, UT", "84604",3,2,2256.25,250);
		assertEquals(3,h.getBedCount());
	}

	@Test
	void testSetBedCount() {
		House h = new House("1949 N 900 W Provo, UT", "84604",3,2,2256.25,250);
		h.setBedCount(4);
		assertEquals(4,h.getBedCount());
	}

	@Test
	void testGetBathCount() {
		House h = new House("1949 N 900 W Provo, UT", "84604",3,2,2256.25,250);
		assertEquals(3,h.getBedCount());
	}

	@Test
	void testSetBathCount() {
		House h = new House("1949 N 900 W Provo, UT", "84604",3,2,2256.25,250);
		h.setBathCount(3);
		assertEquals(3,h.getBathCount());
	}

	@Test
	void testGetSqFootage() {
		House h = new House("1949 N 900 W Provo, UT", "84604",3,2,2256.25,250);
		assertEquals(2256.25,h.getSize());
	}

	@Test
	void testSetSqFootage() {
		House h = new House("1949 N 900 W Provo, UT", "84604",3,2,2256.50,250);
		h.setSize(2256.50);
		assertEquals(2256.50,h.getSize());
	}
	/*@Test
	void testCalculateAppraisalPrice() {
		House h = new House("1949 N 900 W Provo, UT", "84604",3,2,2256.50,250);
		//price = 218,880.5
		//bedCount = 3*10,000 => 30,000
		//bathCount = 2*12,000 => 24,000
		//sqFootage = 2256.50
		//yardAccres = 250*460000.00 =>115000000
		assertEquals(218880.50+30000+24000+115000000,h.calculateAppraisalPrice());
	}*/

}
