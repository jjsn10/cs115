package DessertShop;

public class Cookie extends DessertItem{

	private int cookieQty;
	private double pricePerDozen;
	
	public Cookie() {
		super();
		this.setPackaging("");
	}
	public Cookie(String name, int cookieQty, double pricePerDozen, String packaging) {
		super(name);
		this.cookieQty = cookieQty;
		this.pricePerDozen = pricePerDozen;
		this.setPackaging(packaging);
		
	}
	public int getCookieQty() {
		return cookieQty;
	}
	public void setCookieQty(int cookieQty) {
		this.cookieQty = cookieQty;
	}
	public double getPricePerDozen() {
		return pricePerDozen;
	}
	public void setPricePerDozen(double pricePerDozen) {
		this.pricePerDozen = pricePerDozen;
	}
	public Double calculateCost() {
		return this.cookieQty * (this.pricePerDozen/12);
	}
	public String toString() {
		String line1 = String.format("%s Cookies (%s)%n",getName(),getPackaging());
		String line2_1 = String.format("   %s cookies @ $%s/dozen",getCookieQty(),getPricePerDozen());
		String line2_3 = String.format("$%.2f",calculateCost());
		String line2_4 = String.format("[Tax: $%.2f]",calculateTax());
		String line2 = String.format("%-10s%-25s%45s%15s %n",line1,line2_1,line2_3,line2_4);
		return line2;
	}
	
}

