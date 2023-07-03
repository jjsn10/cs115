package RealEstate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

public class Listing implements Listable {
	
	public HashMap<String,Residential> listings;
	
	public Listing() {
		listings = new HashMap <String,Residential>();
	}

	@Override
	public HashMap<String, Residential> getListings() {
		// TODO Auto-generated method stub
		return listings;
	}

	@Override
	public Residential getListing(String address) {
		// TODO Auto-generated method stub
		return listings.get(address);
	}

	@Override
	public Set<String> getStreetAddresses() {
		// TODO Auto-generated method stub
		return listings.keySet();
	}

	@Override
	public Collection<Residential> getResidences() {
		// TODO Auto-generated method stub
		ArrayList<Residential> residential = new ArrayList<Residential>(listings.values());
		return residential;
	}

	@Override
	public int getListingCount() {
		// TODO Auto-generated method stub
		return listings.size();
	}

	@Override
	public void addListing(String address, Residential residential) {
		// TODO Auto-generated method stub
		listings.put(address, residential);
		
	}

}
