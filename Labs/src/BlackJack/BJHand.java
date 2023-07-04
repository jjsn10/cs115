package BlackJack;

import BlackJackBase.PCard;
import BlackJackBase.PHand;
import java.util.ArrayList;

public class BJHand implements PHand{
	
	public ArrayList<BJCard> hand = new ArrayList<BJCard>();
	public int sumNum = 0;
	public int countAce = 0;
	
	public BJHand() {
		hand  = new ArrayList<BJCard>();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return hand.size();
	}

	@Override
	public void addCard(PCard card) {
		// TODO Auto-generated method stub
		hand.add((BJCard) card);
	}

	@Override
	public PCard getCard(int index) {
		// TODO Auto-generated method stub
		return hand.get(index);
	}

	@Override
	public PCard removeCard(int index) {
		// TODO Auto-generated method stub
		return hand.remove(index);
	}
	@Override
	/** Returns the point value of the current hand.
	 *  Basic BlackJack rules apply:
	 *  Ranks 2 - 10 are valued at their face value
	 *  Ranks Jack - King are valued at 10
	 *  Ace is valued at 11 if the total value of all cards in the hand is <= 21
	 *  Otherwise, Ace is valued as 1 
	 */
	public int getValue() {
		// TODO Auto-generated method s
		int sumNum =0;
			
			for(int i=0; i<getSize();i++) {
				if(hand.get(i).getRank()>BJCard.TEN && hand.get(i).getRank()<=BJCard.KING) {
					if(sumNum+10<=21) {
						sumNum +=10;
					}
				}else if(hand.get(i).getRank()==BJCard.ACE) {
					if(sumNum<11) {
						sumNum +=11;
					}else {
						sumNum++;
						
					}
				}else {
					if(sumNum+hand.get(i).getRank()<=21) {
						sumNum +=hand.get(i).getRank();
					}
				}
				
			}
			
		return sumNum;
	}

}
