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
}
