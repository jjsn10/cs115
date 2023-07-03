package RealEstate;

import java.util.HashMap;
import java.util.Set;

public interface Biddable {
	public abstract HashMap<String,Double>getBids();
	public abstract Double getBid(String bidder);
	public abstract Set<String> getBidders();
	public abstract int getBidCount();
	public abstract void newBid(String bidder,Double bid);

}
