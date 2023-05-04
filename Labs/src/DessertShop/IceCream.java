package DessertShop;

public class IceCream extends DessertItem{
	
	private int scoopCount;
	private double pricePerScoop;
	
	public IceCream() {
		super();
		this.scoopCount = 0;
		this.pricePerScoop = 0;
	}
	public IceCream(String name, int scoopCount, double pricePerScoop) {
		super(name);
		this.scoopCount = scoopCount;
		this.pricePerScoop = pricePerScoop;
	}
	
	public int getScoopCount() {
		return scoopCount;
	}
	public void setScoopCount(int scoopCount) {
		this.scoopCount = scoopCount;
	}
	public double getPricePerScoop() {
		return pricePerScoop;
	}
	public void setPricePerScoop(double pricePerScoop) {
		this.pricePerScoop = pricePerScoop;
	}
	
	

}
