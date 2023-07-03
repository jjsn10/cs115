package BlackJack;

import BlackJackBase.PCard;

import BlackJackBase.PDeck;
import java.util.ArrayList;
import java.util.Collections;

public class BJDeck implements PDeck{
	
	public ArrayList<BJCard> cards = new ArrayList<BJCard>();
	
	
	public BJDeck() {

		for(int i=BJCard.ACE; i<=BJCard.KING; i++) {
			//System.out.println(i);
			for(int j=BJCard.SPADE; j<=BJCard.CLUB; j++) {
				//System.out.println(i+"-"+j);
				addCard(new BJCard(i,j));
				//((PDeck) this.cards).addCard(new BJCard(i,j));
			}
		}
		/*BJCard c1 = new BJCard(BJCard.ACE,BJCard.SPADE);
		BJCard c2 = new BJCard(BJCard.ACE,BJCard.CLUB);
		//System.out.println(c.getText());
		((PDeck) cards).addCard((PCard) c1);
		cards.add(c2);
		*/
		//shuffle();
	}

	@Override
	public void shuffle() {
		// TODO Auto-generated method stub
		//System.out.println("Original array: "+cards);
		Collections.shuffle(cards);
		//System.out.println("Shuffled array: "+cards);
	}

	@Override
	public void addCard(PCard card) {
		// TODO Auto-generated method stub
		cards.add((BJCard) card);
		
	}

	@Override
	public PCard dealCard() {
		///** Removes a card from the end of the deck. Returns Null if the deck is empty.*/
		if(this.cardCount()==0) {
			return null;
		}else {
			return cards.remove(this.cardCount()-1);
		}
		//PCard card = (PCard) this.cards.remove(this.cards.size() - 1);
	}

	@Override
	public PCard dealHiddenCard() {
		// TODO Auto-generated method stub
		/** Removes a card from the end of the deck and marks it as hidden. Returns Null if the deck is empty.*/
		if(cards.isEmpty()) {
			return null;
		}else {
			cards.get(cardCount()-1).hideCard();
			return cards.remove(cardCount()-1);
		}
	}
	/** Returns the number of cards in the deck. */
	public int cardCount() {
		// TODO Auto-generated method stub
		//return this.cards.size();
		return cards.size();
	}
}
