package BlackJack;

import java.awt.Color;

import BlackJackBase.PGame;
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
		
		BJHand dealer = new BJHand();
		//HandTest.run(deck, hand);
		BJHand player = new BJHand();
		
		
		PGame.run(deck, dealer, player);
		//PGame.setBannerColor(Color.GRAY);
		PGame.setBackgroundColor(Color.GREEN);
		PGame.setBannerTextColor(Color.WHITE);
		PGame.setButtonColor(Color.GRAY);
		PGame.setButtonTextColor(Color.BLACK);
		PGame.setStatusTextColor(Color.BLUE);
		PGame.setButtonHighlightColor(Color.ORANGE);
		PGame.setFont("Arial");
	}

}
