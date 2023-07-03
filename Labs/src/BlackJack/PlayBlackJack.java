package BlackJack;

import BlackJackTest.CardTest;
import BlackJackTest.HandTest;
import BlackJackTest.DeckTest;

public class PlayBlackJack{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BJCard card = new BJCard(BJCard.TEN, BJCard.HEART);
		//CardTest.run(card);
		
		BJDeck deck = new BJDeck();
		//DeckTest.run(deck);
		
		BJHand hand = new BJHand();
		HandTest.run(deck, hand);
	}

}
