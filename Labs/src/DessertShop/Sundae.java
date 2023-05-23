package DessertShop;

public class Sundae extends IceCream{
	private String toppingName;
	private double toppingPrice;
	
	public Sundae() {
	
	}
	public Sundae(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice,String packaging) {
		super(name, scoopCount, pricePerScoop,packaging);
		this.toppingName = toppingName;
		this.toppingPrice = toppingPrice;
	}
	public String getToppingName() {
		return toppingName;
	}
	public void setToppingName(String toppingName) {
		this.toppingName = toppingName;
	}
	public double getToppingPrice() {
		return toppingPrice;
	}
	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
	public Double calculateCost() {
		return super.calculateCost() + this.toppingPrice;
	}
	public String toString() {
		String line1 = String.format("%s %s Sundae (%s)%n",getToppingName(),getName(),getPackaging());
		String line2_1 = String.format("   %s scoops of %s ice cream @ $%s/scoop%n",getScoopCount(),getName(),getPricePerScoop());
		String line2_2 = String.format("   %s topping @ $%s",getToppingName(),getToppingPrice());
		String line2_3 = String.format("$%.2f",calculateCost());
		String line2_4 = String.format("[Tax: $%.2f]",calculateTax());
		String line2 = String.format("%-10s%-25s%-56s%15s%15s %n",line1,line2_1,line2_2,line2_3,line2_4);
		//String line2 = String.format("%-10s%-25s%46s%15s%15s %n",line1,line2_1,line2_2,line2_3,line2_4);
		return line2;
	}
}
