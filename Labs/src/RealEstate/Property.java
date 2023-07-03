package RealEstate;

public abstract class Property {
	private String streetAddress;
	private String zip;
	private double listPrice=0;
	private double appraisalPrice=0;
	
	public Property() {
		
	}
	public Property(String streetAddress, String zip) {
		this.streetAddress = streetAddress;
		this.zip = zip;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Double getListPrice() {
		return this.listPrice;
	}
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}
	protected void setAppraisalPrice(double appraisalPrice) {
		this.appraisalPrice =appraisalPrice;
	}
	public abstract Double calculateAppraisalPrice();

}
