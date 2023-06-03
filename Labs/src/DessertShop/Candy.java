package DessertShop;

public class Candy extends DessertItem implements SameItem<Candy>{
	
	private double candyWeight;
	private double pricePerPound;
	
	public Candy() {
		super();
	}
	public Candy(String name, double candyWeigth, double pricePerPound,String packaging) {
		super(name);
		this.candyWeight = candyWeigth;
		this.pricePerPound = pricePerPound;
		this.setPackaging(packaging);
		
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
	public Boolean isSameAs(Candy other) {
		if(other.getName().equalsIgnoreCase(this.getName()) && other.getPricePerPound()==this.getPricePerPound() ) {
			//System.out.println("False");
			return true;
		}
		return false;
	}
	public String toString() {
		String line1 = String.format("%s (%s)%n",getName(),getPackaging());
		String line2_1 = String.format("   %s lbs. @  $ %s/lb",getCandyWeight(),getPricePerPound());
		String line2_3 = String.format("$%.2f",calculateCost());
		String line2_4 = String.format("[Tax: $%.2f]",calculateTax());
		String line2 = String.format("%-10s%-25s%46s%15s %n",line1,line2_1,line2_3,line2_4);
		return line2;
	}
}
