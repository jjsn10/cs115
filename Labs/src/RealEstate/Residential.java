package RealEstate;

import java.util.HashMap;
import java.util.Set;

public abstract class Residential extends Property implements Biddable{
	private int bedCount;
	private int bathCount;
	private double sqFootage;
	public HashMap<String, Double> bids = new HashMap<String,Double>();
	
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
	public double getSize() {
		return sqFootage;
	}
	public void setSize(double sqFootage) {
		this.sqFootage = sqFootage;
	}
	public abstract Double calculateAppraisalPrice();
	public void newBid(String bidder, double bid) {
			bids.put(bidder,bid);
	}
	public  HashMap<String,Double> getBids(){
		return bids;
	}
	public Double getBid(String bidder) {
		return bids.get(bidder);
	}
	public Set<String> getBidders(){
		return bids.keySet();
	}
	public int getBidCount() {
		return bids.size();
	}

}
