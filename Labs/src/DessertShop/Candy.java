package DessertShop;

public class Candy extends DessertItem{
	
	private double candyWeight;
	private double pricePerPound;
	
	public Candy() {
		super();
	}
	public Candy(String name, double candyWeigth, double pricePerPound) {
		super(name);
		this.candyWeight = candyWeigth;
		this.pricePerPound = pricePerPound;
		
	}
	
	public double getCandyWeight() {
		return candyWeight;
	}
	public void setCandyWeight(double candyWeight) {
		this.candyWeight = candyWeight;
	}
	public double getPricePerPound() {
		return pricePerPound;
	}
	public void setPricePerPound(double pricePerPound) {
		this.pricePerPound = pricePerPound;
	}
	public Double calculateCost() {
		return this.candyWeight * this.pricePerPound;
	}
	public String toString() {
		String line1 = String.format("%s%n",getName());
		String line2_1 = String.format("   %s lbs. @  $ %s/lb",getCandyWeight(),getPricePerPound());
		String line2 = String.format("%-10s%-25s",line1,line2_1);
		return line2;
	}
}
