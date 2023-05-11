package DessertShop;

public class Cookie extends DessertItem{

	private int cookieQty;
	private double pricePerDozen;
	
	public Cookie() {
		super();
	}
	public Cookie(String name, int cookieQty, double pricePerDozen) {
		super(name);
		this.cookieQty = cookieQty;
		this.pricePerDozen = pricePerDozen;
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
	
}

