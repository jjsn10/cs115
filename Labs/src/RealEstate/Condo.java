package RealEstate;

public class Condo extends Residential{
	private int floorLvl;
	
	public Condo() {
		
	}
	public Condo(String streetAddress,String zip,int bedCount, int bathCount, double sqFootage, int floorLvl) {
		super(streetAddress, zip, bedCount, bathCount, sqFootage);
		this.floorLvl = floorLvl;
		
	}
	public int getFloorLvl() {
		return floorLvl;
	}
	public void setFloorLvl(int floorLvl) {
		this.floorLvl = floorLvl;
	}
	public Double calculateAppraisalPrice() {
		double price = 0.0;
		double bedroomPrice = 0.0;
		double bathroomPrice = 0.0;
		double floorlevelPrice = 0.0;
		price = 88.00*this.getSize();
		bedroomPrice = 8000.00*this.getBedCount();
		bathroomPrice = 10000.00*this.getBathCount();
		floorlevelPrice = 5000.00*(this.getFloorLvl()-1);
		
		
		return price+bedroomPrice+bathroomPrice+floorlevelPrice;
	}
	public String toString() {
		String line_up =String.format("%s","-------------------------------------------------------------------\n\n");
		String line1_1 = String.format("Residency Type: %s  Address: %s Zip Code: %s %n%n","Condo",getStreetAddress(), getZip());
		String line_down = String.format("%s","-------------------------------------------------------------------\n");
		String line1 = String.format("%s %s %n","SqFootage: ",getSize());
		String line2 = String.format("%s %s %n","Bedrooms: ", getBedCount());
		String line3 = String.format("%s %s %n","Bathrooms: ", getBathCount());
		String line4 = String.format("%s %s %n","Floor: ", getFloorLvl());
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
