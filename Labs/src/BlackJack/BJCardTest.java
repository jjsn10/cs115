package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BJCardTest {

	@Test
	void testHideCard() {
		BJCard card = new BJCard(BJCard.FIVE,BJCard.SPADE);
		card.hideCard();
		assertTrue(card.getHidden().equals(true));
	}
	@Test
	void testShowCard() {
		BJCard card = new BJCard(BJCard.FIVE,BJCard.SPADE);	
		card.showCard();
		assertTrue(card.getHidden().equals(false));
	}

	@Test
	void testIsHidden() {
		BJCard card = new BJCard(BJCard.FIVE,BJCard.SPADE);
		card.setHidden(true);
		assertTrue(card.getHidden().equals(card.isHidden()));
		
		card = new BJCard(BJCard.FIVE,BJCard.SPADE);
		card.setHidden(false);
		assertTrue(card.getHidden().equals(card.isHidden()));
	}
	@Test
	void testGetText() {
		BJCard card = new BJCard(BJCard.FIVE,BJCard.SPADE);
		assertEquals("5\u2660",card.getText());
	}
	@Test
	void testGetRank() {
		BJCard card = new BJCard(BJCard.FIVE,BJCard.SPADE);
		assertEquals(BJCard.FIVE,card.getRank());
	}

	@Test
	void testSetRank() {
		BJCard card = new BJCard(BJCard.FIVE,BJCard.SPADE);
		card.setRank(BJCard.FOUR);
		assertEquals(BJCard.FOUR, card.getRank());
	}

	@Test
	void testGetSuit() {
		BJCard card = new BJCard(BJCard.FIVE,BJCard.SPADE);
		assertEquals(BJCard.SPADE,card.getSuit());
	}

	@Test
	void testSetSuit() {
		BJCard card = new BJCard(BJCard.FIVE,BJCard.SPADE);
		card.setSuit(BJCard.DIAMOND);
		assertEquals(card.getSuit(),BJCard.DIAMOND);
	}

	@Test
	void testGetHidden() {
		BJCard card = new BJCard(BJCard.FIVE,BJCard.SPADE);
		assertTrue(card.getHidden().equals(false));
	}

	@Test
	void testSetHidden() {
		BJCard card = new BJCard(BJCard.FIVE,BJCard.SPADE);
		card.setHidden(true);
		assertTrue(card.getHidden().equals(true));
	}

}
