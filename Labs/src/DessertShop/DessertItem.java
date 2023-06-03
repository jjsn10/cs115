package DessertShop;

public abstract class DessertItem implements Packaging, Comparable<DessertItem>{
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
	public int compareTo(DessertItem item) {
		if(this.calculateCost() > item.calculateCost()) {
			return 1;
		}else if (this.calculateCost()< item.calculateCost()) {
			return -1;
			
		}
		return 0;
	}
}
