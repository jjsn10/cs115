package BlackJack;

import BlackJackBase.PCard;
import java.util.Scanner;
import BlackJackBase.PHand;
import java.util.ArrayList;

public class BJHand implements PHand{
	
	public ArrayList<BJCard> hand = new ArrayList<BJCard>();
	//public int sumNum = 0;
	//public int countAce = 0;
	
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
		Scanner iSN = new Scanner(System.in);
			for(int i=0; i<getSize(); i++) {
				//System.out.println("Line 54: "+sumNum);
				if(hand.get(i).getRank() > BJCard.TEN && hand.get(i).getRank() <= BJCard.KING) {
					sumNum += 10;
					/*System.out.println("Line 57:" +hand.get(i).getRank());
					System.out.println("Line 58:" +sumNum);
					iSN.nextLine();
					System.out.println();*/
				}
				else if(hand.get(i).getRank() == BJCard.ACE) {
					if(sumNum<11) {
						sumNum += 11;
						/*System.out.println("Line 65: "+hand.get(i).getRank());
						System.out.println("Line 66: "+sumNum);
						iSN.nextLine();
						System.out.println();*/
						
					}else {
						sumNum += 1;
						/*System.out.println("Line 72: "+hand.get(i).getRank());
						System.out.println("Line 73: " +sumNum);
						iSN.nextLine();
						System.out.println();*/
						
					}
				}else {
						sumNum += hand.get(i).getRank();
						/*System.out.println("Line 79: "+hand.get(i).getRank());
						System.out.println("Line 80: "+sumNum);
						iSN.nextLine();
						System.out.println();*/
				}
			}
			
			/*for(int i=0; i<getSize();i++) {
				if(hand.get(i).getRank()>BJCard.TEN && hand.get(i).getRank()<=BJCard.KING) {
					if(sumNum+10<=21) {
						sumNum = sumNum + 10;
						System.out.println("Line 58: "+hand.get(i).getRank());
						System.out.println("Line 59: "+sumNum);
						iSN.nextLine();
						System.out.println();
					}
				}else if(hand.get(i).getRank()==BJCard.ACE) {
					if(sumNum<11) {
						sumNum = sumNum + 11;
						System.out.println("Line 66: "+hand.get(i).getRank());
						System.out.println("Line 67: "+sumNum);
						iSN.nextLine();
						System.out.println();	
						
					}else {
						sumNum = sumNum + 1;
						System.out.println("Line 73: "+hand.get(i).getRank());
						System.out.println("Line 74: " +sumNum);
						iSN.nextLine();
						System.out.println();
						
					}
				}else {
					if(sumNum+hand.get(i).getRank()<=21) {
						sumNum = sumNum + hand.get(i).getRank();
						System.out.println("Line 82: "+hand.get(i).getRank());
						System.out.println("Line 83: "+sumNum);
						iSN.nextLine();
						System.out.println();
					}
				}
				
			}	*/
		return sumNum;
	}

}
