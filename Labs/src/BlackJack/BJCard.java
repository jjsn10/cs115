package BlackJack;

import java.awt.Color;

import BlackJackBase.PCard;

public class BJCard extends PCard{
	private int rank=0;
	private int suit=0;
	private Boolean hidden;
	
	public static final int ACE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11; //J
	public static final int KNIGHT = 12;//Kn
	public static final int QUEEN = 13;//Q
	public static final int KING = 14;//K
	
	public static final int SPADE = 1;
	public static final int HEART = 2;
	public static final int DIAMOND = 3;
	public static final int CLUB = 4;
			
	public BJCard(int rank, int suit){
		this.rank = rank;
		this.suit = suit;
		this.hidden = false;
	}
	public void hideCard() {
		this.hidden = true;
	}
	public void showCard() {
		this.hidden = false;
	}
	public boolean isHidden() {
		return this.hidden == true ? true :	 false;
	}
	public String getText() {
		//this.rank
	    //this.suit
		// rankSymbol = ['U+789','U+87Y',.....]
		//char suitSymbol = '\u2660';
		
		char suitSymbol = ' ';		
		String rankSymbol="";
		
		
		switch(rank) {
			case ACE:
				rankSymbol = "A";
				break;
			case TWO:
				rankSymbol = "2";
				break;
			case THREE:
				rankSymbol = "3";
				break;
			case FOUR:
				rankSymbol = "4";
				break;
			case FIVE:
				rankSymbol = "5";
				break;
			case SIX:
				rankSymbol = "6";
				break;
			case SEVEN:
				rankSymbol = "7";
				break;
			case EIGHT:
				rankSymbol = "8";
				break;
			case NINE:
				rankSymbol = "9";
				break;
			case TEN:
				rankSymbol = "10";
				break;
			case JACK:
				rankSymbol = "J";
				break;
			case KNIGHT:
				rankSymbol = "Kn";
				break;
			case QUEEN:
				rankSymbol = "Q";
				break;
			case KING:
				rankSymbol = "K";
				break;
		}
		
		switch(suit) {
			case SPADE:
				suitSymbol = '\u2660';
				break;
			case HEART:
				suitSymbol = '\u2665';
				break;
			case DIAMOND:
				suitSymbol = '\u2666';
				break;
			case CLUB:
				suitSymbol = '\u2663';
				break;
					
		}
		
		return rankSymbol + suitSymbol;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getSuit() {
		return suit;
	}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	public Boolean getHidden() {
		return hidden;
	}
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}
	public Color getFontColor() {
		
		if(getSuit()== HEART || getSuit()== DIAMOND) {
			return Color.RED;
		}
		return Color.black;
	}
	public Color getBorderColor() {
		return Color.blue;
	}
	public Color getStripeColor() {
		return Color.blue;
	}
	public Color getBackColor() {
		return Color.YELLOW;
	}
	
	
}


