package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IceCreamTest {

	@Test
	void getScoopCount(){
		IceCream i = new IceCream("Chocochips mint",2,2.5,"Bowl");
		assertEquals(2,i.getScoopCount());
	}
	@Test
	void setScoopCount() {
		IceCream i = new IceCream("Chocochips mint",2,2.5,"Bowl");
		i.setScoopCount(3);
		assertEquals(3,i.getScoopCount());
	}
	@Test
	void getPricePerScoop() {
		IceCream i = new IceCream("Chocochips mint",2,2.5,"Bowl");
		assertEquals(2.5,i.getPricePerScoop());
	}
	@Test
	void  setPricePerScoop() {
		IceCream i = new IceCream("Chocochips mint",2,2.5,"Bowl");
		i.setPricePerScoop(1.8);
		assertEquals(1.8,i.getPricePerScoop());
	}
	@Test
	void testCalculateCost() {
		IceCream i = new IceCream("Chocochips mint",2,2.5,"Bowl");
		assertEquals(i.getScoopCount()*i.getPricePerScoop(),i.calculateCost());
	}
	@Test 
	void testCalculateTax() {
		IceCream i = new IceCream("Chocochips mint",2,2.5,"Bowl");
		assertEquals(i.calculateCost()*(i.getTaxPercent()/100),i.calculateTax());
	}

}
