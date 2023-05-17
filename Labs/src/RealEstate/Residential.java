package RealEstate;

public class Residential extends Property{
	private int bedCount;
	private int bathCount;
	private double sqFootage;
	
	public Residential() {
		
	}
	public Residential(String streetAddress,String zip,int bedCount, int bathCount, double sqFootage) {
		super(streetAddress,zip);
		this.bedCount = bedCount;
		this.bathCount = bathCount;
		this.sqFootage = sqFootage;
	}
	
	public int getBedCount() {
		return bedCount;
	}
	public void setBedCount(int bedCount) {
		this.bedCount = bedCount;
	}
	public int getBathCount() {
		return bathCount;
	}
	public void setBathCount(int badCount) {
		this.bathCount = badCount;
	}
	public double getSqFootage() {
		return sqFootage;
	}
	public void setSqFootage(double sqFootage) {
		this.sqFootage = sqFootage;
	}
	
	

}
