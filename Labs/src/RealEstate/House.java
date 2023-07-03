package RealEstate;

public class House extends Residential{
	private double yardAcres;
	
	public House() {
		
	}
	public House(String streetAddress,String zip,int bedCount, int bathCount, double sqFootage, double yardAcres) {
		super(streetAddress,zip,bedCount, bathCount,sqFootage);
		this.yardAcres = yardAcres;
	}
	public double getYardAcres() {
		return yardAcres;
	}
	public void setYardAcres(double yardAcres) {
		this.yardAcres = yardAcres;
	}
	public Double calculateAppraisalPrice() {
		double price = 0.0;
		double bedroomPrice = 0.0;
		double bathroomPrice = 0.0;
		double yardAcressPrice = 0.0;
		price = 97.00*this.getSize();
		bedroomPrice = 10000.00*this.getBedCount();
		bathroomPrice = 12000.00*this.getBathCount();
		yardAcressPrice = 460000.00*this.getYardAcres();
		
		
		return price+bedroomPrice+bathroomPrice+yardAcressPrice;
	}
	public String toString() {
		String line_up =String.format("%s","-------------------------------------------------------------------\n\n");
		String line1_1 = String.format("Residency Type: %s  Address: %s Zip Code: %s %n%n","House",getStreetAddress(), getZip());
		String line_down = String.format("%s","-------------------------------------------------------------------\n");
		String line1 = String.format("%s %s %n","SqFootage: ",getSize());
		String line2 = String.format("%s %s %n","Bedrooms: ", getBedCount());
		String line3 = String.format("%s %s %n","Bathrooms: ", getBathCount());
		String line4 = String.format("%s %s %n","Yard Size (Acres): ", getYardAcres());
		/*String line2_1 = String.format("   %s cookies @ $%s/dozen",getCookieQty(),getPricePerDozen());
		String line2_3 = String.format("$%.2f",calculateCost());
		String line2_4 = String.format("[Tax: $%.2f]",calculateTax());
		String line2 = String.format("%-10s%-25s%45s%15s %n",line1_1,line2_1,line2_3,line2_4);*/
		
		String final_line_up = String.format("%s","-------------------------------------------------------------------\n");
		String line5 = String.format("%s %s %n","Appraisal Price: $",calculateAppraisalPrice());
		String line6 = String.format("%s %s %n","List Price: $",getListPrice());
		String final_line_down = String.format("%s","-------------------------------------------------------------------\n");
		String final_line = String.format("%s%s%s %15s %15s %15s %15s%s %15s %15s%s %n%n", line_up, line1_1, line_down,line1,line2,line3,line4,final_line_up,line5,line6,final_line_down);
		return final_line;
		//return "";
	}
}
