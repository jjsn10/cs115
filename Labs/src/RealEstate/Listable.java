package RealEstate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public interface Listable {
	public abstract HashMap<String,Residential> getListings();
	public abstract Residential getListing(String residential);
	public abstract Set<String> getStreetAddresses();
	public abstract Collection<Residential> getResidences();
	public abstract int getListingCount();
	public abstract void addListing(String address ,Residential residential);
}
