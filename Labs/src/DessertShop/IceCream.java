package DessertShop;

public class IceCream extends DessertItem{
	
	private int scoopCount;
	private double pricePerScoop;
	
	public IceCream() {
		super();
		this.scoopCount = 0;
		this.pricePerScoop = 0;
	}
	public IceCream(String name, int scoopCount, double pricePerScoop, String packaging) {
		super(name);
		this.scoopCount = scoopCount;
		this.pricePerScoop = pricePerScoop;
		this.setPackaging(packaging);
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
	public Double calculateCost() {
		return this.scoopCount * this.getPricePerScoop();
	}
	public String toString() {
		String line1 = String.format("%s Ice Cream (%s)%n",getName(),getPackaging());
		String line2_1 = String.format("   %s scoops @ $%s/scoop",getScoopCount(), getPricePerScoop());
		String line2_3 = String.format("$%.2f",calculateCost());
		String line2_4 = String.format("[Tax: $%.2f]",calculateTax());
		String line2 = String.format("%-10s%-25s%46s%15s %n",line1,line2_1,line2_3,line2_4);
		return line2;
	}
	

}
