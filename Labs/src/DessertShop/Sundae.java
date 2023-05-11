package DessertShop;

public class Sundae extends IceCream{
	private String toppingName;
	private double toppingPrice;
	
	public Sundae() {
	
	}
	public Sundae(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice) {
		super(name, scoopCount, pricePerScoop);
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
}
