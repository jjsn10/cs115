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
}
