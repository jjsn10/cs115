package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidentialTest {

	@Test
	void testGetBedCount() {
		Residential r = new Residential("1949 N 900 W Provo, UT", "84604",3,2,2256.25);
		assertEquals(3,r.getBedCount());
	}

	@Test
	void testSetBedCount() {
		Residential r = new Residential("1949 N 900 W Provo, UT", "84604",3,2,2256.25);
		r.setBedCount(4);
		assertEquals(4,r.getBedCount());
	}

	@Test
	void testGetBathCount() {
		Residential r = new Residential("1949 N 900 W Provo, UT", "84604",3,2,2256.25);
		assertEquals(3,r.getBedCount());
	}

	@Test
	void testSetBathCount() {
		Residential r = new Residential("1949 N 900 W Provo, UT", "84604",3,2,2256.25);
		r.setBathCount(3);
		assertEquals(3,r.getBathCount());
	}

	@Test
	void testGetSqFootage() {
		Residential r = new Residential("1949 N 900 W Provo, UT", "84604",3,2,2256.25);
		assertEquals(2256.25,r.getSize());
	}

	@Test
	void testSetSqFootage() {
		Residential r = new Residential("1949 N 900 W Provo, UT", "84604",3,2,2256.50);
		r.setSize(2256.50);
		assertEquals(2256.50,r.getSize());
	}

}
