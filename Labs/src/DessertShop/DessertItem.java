package DessertShop;

public abstract class DessertItem implements Packaging{
	private String name;
	private Double taxPercent = 7.25;
	private String packaging;
	
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
	public String getPackaging() {
		return this.packaging;
	}
	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}
}
