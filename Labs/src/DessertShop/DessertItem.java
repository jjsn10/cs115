package DessertShop;

public abstract class DessertItem {
	private String name;
	private Double taxPercent = 7.25;
	
	public DessertItem() {
		
	}
	public DessertItem(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getTaxPercent() {
		return taxPercent;
	}
	public void setTaxPercent(Double taxPercent) {
		this.taxPercent = taxPercent;
	}
	public abstract Double calculateCost();	
	public Double calculateTax() {
		return calculateCost()*(taxPercent/100);
	}
}
