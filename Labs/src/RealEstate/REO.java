package RealEstate;

import java.util.Scanner;
import java.util.*;
import java.util.Map.Entry;

public class REO {
	
	public static Listing reoListings;
	public static Residential rd;
		
	public static void main(String[] args) {
		reoListings = new Listing();
		Scanner sIn = new Scanner(System.in);
		boolean done = false;
		String option;
		
		
		/* Main Menu */
		while (!done) {
			System.out.println("------------------------------------\n");
			System.out.printf("%22s %n","Main Menu");
			System.out.println("------------------------------------\n");
		    System.out.println("1: Listings");
		    System.out.println("2: Bids");            
		    System.out.print("\nWhat would you like to do? (1–2): ");
		    option = sIn.nextLine();
			
			   
			    switch(option) {
				    case "1":            
		                /*orderItem = userPromptCandy();
		                orders.add(orderItem);*/
				    	listingsMenu();
		                /*System.out.printf("%n%s has been added to your order.%n",orderItem.getName());*/
		                break;
				    case "2":
				    	bidsMenu();
				    	break;
		            default:            
		                System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
		                break;
			    }
		    
		    
		}/* End Main Menu */
		
		
	}
	
	private static void listingsMenu() {
		boolean done = false;
		Scanner sIn = new Scanner(System.in);
		String option ="";
	    
		while(!done) {
			System.out.println("------------------------------------\n");
			System.out.printf("%22s %n","Listing Menu");
			System.out.println("------------------------------------\n");
		    System.out.println("1: Add Listing");
		    System.out.println("2: Show Listings");  
		    System.out.println("3: Auto Populate Listings (Dev tool)");
		    System.out.println("ENTER: Exit back to the previous menu.");
		    System.out.print("\nWhat would you like to do? (1–3): ");
		    option = sIn.nextLine();
		    if (option.equals("")) {
		        done = true;
		    } else {
			    switch(option) {
			    case "1":            
	                /*orderItem = userPromptCandy();
	                orders.add(orderItem);*/
			    	addingListMenu();
			    	//System.out.println(rd.toString());
	                /*System.out.printf("%n%s has been added to your order.%n",orderItem.getName());*/
	                break;
			    case "2":
			    	showlistings();
			    	break;
			    case "3":
			    	autoPopulate();
			    	break;
	            default:            
	                System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
	                break;
			    }
		    }
		}
		
	}
	private static void bidsMenu() {
		boolean done = false;
		Scanner sIn = new Scanner(System.in);
		String option ="";
	    
		while(!done) {
			System.out.println("------------------------------------\n");
			System.out.printf("%22s %n","Bids Menu");
			System.out.println("------------------------------------\n");
		    System.out.println("1: Add New Bid");
		    System.out.println("2: Show Existing Bids");  
		    System.out.println("3: Auto Populate Bids (Dev tool)");
		    System.out.println("ENTER: Exit back to the previous menu.");
		    System.out.print("\nWhat would you like to do? (1–3): ");
		    option = sIn.nextLine();
		    if (option.equals("")) {
		        done = true;
		    } else {
			    switch(option) {
			    case "1":            
	                /*orderItem = userPromptCandy();
	                orders.add(orderItem);*/
			    	addingNewBid();
			    	//System.out.println(rd.toString());
	                /*System.out.printf("%n%s has been added to your order.%n",orderItem.getName());*/
	                break;
			    case "2":
			    	//showBids();
			    	break;
			    case "3":
			    	autoPopulateBids();
			    	break;
	            default:            
	                System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
	                break;
			    }
		    }
		}

		
	}
	private static void addingNewBid() {
		//System.out.println(reoListings.getStreetAddresses());
		/*for(Entry<String, Residential> set:reoListings.getListings().entrySet()) {
			System.out.println("Listing No: "+count+"\n");
			System.out.println(set.getValue());
			count++;
		}*/
		//int size = 1;
		/*for(Entry<String,Residential> item:reoListings.getListings().entrySet()) {
			//System.out.println(size +":"+ item.getValue().getStreetAddress() + "("+item.getValue().getBidCount()+")");
			//size++;
			item.getValue().newBid("1049 N 700", 2450000);
		}*/
		House h = new House();
		System.out.println("Line 145: "+h.getBidCount());
		h.newBid("1949 N Orchard Way", 2340000);
		
	}
	private static void addingListMenu() {
		boolean done = false;
		Scanner sIn = new Scanner(System.in);
		String option ="";
	    
		while(!done) {
			System.out.println("------------------------------------\n");
			System.out.printf("%22s %n","Add Listing Menu");
			System.out.println("------------------------------------\n");
		    System.out.println("1: Add House");
		    System.out.println("2: Add Condo");  
		    System.out.println("ENTER: Exit back to the previous menu.");
		    System.out.print("\nWhat would you like to do? (1–2): ");
		    option = sIn.nextLine();
		    if (option.equals("")) {
		        done = true;
		    } else {
			    switch(option) {
			    case "1":            
	                /*orderItem = userPromptCandy();
	                orders.add(orderItem);*/
			    	rd = addHouse();
			    	reoListings.addListing(rd.getStreetAddress(), rd);
			    	System.out.println(rd.toString());
	                /*System.out.printf("%n%s has been added to your order.%n",orderItem.getName());*/
	                break;
			    case "2":
			    	rd = addCondo();
			    	reoListings.addListing(rd.getStreetAddress(), rd);
			    	System.out.println(rd.toString());
			    	
			    	break;
	            default:            
	                System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
	                break;
			    }
		    }
		}
	}
	private static Residential addHouse() {
		House h;
		Scanner in = new Scanner(System.in);
		boolean status = false;
		String address = "";
		String zipcode = "";
		int bedrooms = 0;
		int bathrooms = 0;
		double sqFootage=0.0; 
		double yardAcres = 0.0;
		double priceList = 0.0;
		
		do {
			try {
				System.out.println("Please enter the street address for the residence: ");
				address = in.nextLine();
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Numbers are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Please enter the zip code for the residence: ");
				zipcode = in.nextLine();
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Please enter the number of bedrooms: ");
				bedrooms = Integer.parseInt(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Please enter the number of bathrooms: ");
				bathrooms = Integer.parseInt(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Please enter the square footage of the residence: ");
				sqFootage = Double.parseDouble(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Please enter the size of the yard in acres: ");
				yardAcres = Double.parseDouble(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		h = new House(address,zipcode,bedrooms,bathrooms,sqFootage,yardAcres);
		System.out.println("Appraisal Price for this property is: "+h.calculateAppraisalPrice()+"\n");
		do {
			try {
				System.out.println("Please enter the List Price for the property: ");
				priceList = Double.parseDouble(in.nextLine());
				h.setListPrice(priceList);
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		 System.out.println("\nYou have created a new listing!");
		
		return h;
	}
	private static Residential addCondo() {
		Condo c;
		Scanner in = new Scanner(System.in);
		boolean status = false;
		String address = "";
		String zipcode = "";
		int bedrooms = 0;
		int bathrooms = 0;
		double sqFootage=0.0; 
		int floorLvl = 0;
		double priceList = 0.0;
		
		do {
			try {
				System.out.println("Please enter the street address for the residence: ");
				address = in.nextLine();
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Numbers are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Please enter the zip code for the residence: ");
				zipcode = in.nextLine();
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Please enter the number of bedrooms: ");
				bedrooms = Integer.parseInt(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Please enter the number of bathrooms: ");
				bathrooms = Integer.parseInt(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Please enter the square footage of the residence: ");
				sqFootage = Double.parseDouble(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Please enter the floor level of the condo: ");
				floorLvl = Integer.parseInt(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		c = new Condo(address,zipcode,bedrooms,bathrooms,sqFootage,floorLvl);
		System.out.println("Appraisal Price for this property is: "+c.calculateAppraisalPrice()+"\n");
		do {
			try {
				System.out.println("Please enter the List Price for the property: ");
				priceList = Double.parseDouble(in.nextLine());
				c.setListPrice(priceList);
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		 System.out.println("\nYou have created a new listing!");
		
		return c;
	}
	private static void showlistings() {
		int count=1;
		
		System.out.println("Current Listing for REO:\n");
		
		for(Entry<String, Residential> set:reoListings.getListings().entrySet()) {
			System.out.println("Listing No: "+count+"\n");
			System.out.println(set.getValue());
			count++;
		}
		
		//System.out.println("Current Listing for REO:\n");
		
		/*reoListings.getListings().keySet().forEach(listing->{
			//System.out.println("Listing No: "+count);
			System.out.println(reoListings.getListings().get(listing));
			
		});*/
	}
	private static void autoPopulate() {
		int currentSize = reoListings.getListings().size();
		House house1 = new House("34 Elm","95129", 3, 2, 2200, .2);
		house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("34 Elm", house1);
		House house2 = new House("42 Hitchhikers","95136", 4, 3, 2800, .3);
		house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("42 Hitchhikers", house2);
		Condo condo1 = new Condo("4876 Industrial", "95177", 3, 1, 1800, 3);
		condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("4876 Industrial", condo1);
		House house3 = new House("2654 Oak","84062", 5, 53, 4200, .5);
		house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("2654 Oak", house3);
		Condo condo2 = new Condo("9875 Lexington","84063", 2, 1, 1500, 1);
		condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("9875 Lexington", condo2);
		Condo condo3 = new Condo("3782 Market", "84066", 3, 1, 1800, 2);
		condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("3782 Market", condo3);
		House house4 = new House("7608 Glenwood", "84055", 6, 3, 3900, .4);
		house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("7608 Glenwood", house4);
		House house5 = new House("1220 Apple", "84057", 8, 7, 7900, 1);
		house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
		reoListings.addListing("1220 Apple", house5);
		
		currentSize = reoListings.getListings().size();
		
		System.out.println("You added " + currentSize+ " items to the reoLisings HashMap");
	}
	private static void autoPopulateBids() {
		String[] autoBidders= {"Patric Stewart","Walter Koenig","William Shatner","Leonard Nimoy","DeForect Kelley","James Doohan","George Takei","Majel Barrett","Nichelle Nichol","Jonathan Frank"
                ,"Marina Sirtis","Brent Spiner","Gates McFadden","Michael Dorn","LeVar Burton","Wil Wheaton","Colm Meaney","Michelle Forbes"};
		//Create an object of type Random,  r

		//Random r = new Random();

		 

		//Randomly select a number between 0 and the length of the autoBidders list - 1. This will be your random index into the array.

		//int index = r.nextInt((autoBidders.length-1) +1);

		 

		//Create a random bid amount between -10% and +10% of the Appraisal Price

		//int maxBid = (int) (rd.calculateAppraisalPrice() * 1.1);

		//int minBid = (int) (rd.calculateAppraisalPrice() * .9);

		//double bidAmount = (double) Math.random() * (maxBid - minBid) + 1 + minBid;

		 

		//Use the random index number to select a random bidder and use the randomly generated bid amount to create a new bid.

		//rd.newBid(autoBidders[index], bidAmount);
		//rd.newBid(autoBidders[index], bidAmount);
		//int maxBid = (int) (set.getValue().calculateAppraisalPrice() * 1.1);
		
		/*for(Map.Entry<String,Residential> entry:reoListings.getListings().entrySet()) {
			//System.out.println(set.getKey());
			Random r = new Random();
			int index = r.nextInt((autoBidders.length-1) +1);
			
			int maxBid = (int) (entry.getValue().calculateAppraisalPrice() * 1.1);
			System.out.println("Line 446: "+maxBid);
			int minBid = (int) (entry.getValue().calculateAppraisalPrice() * .9);
			System.out.println("Line 448: "+minBid);
			double bidAmount = (double) (Math.random() * (maxBid - minBid) + 1 + minBid);
			System.out.println(bidAmount);
			System.out.println("Line 471: "+ autoBidders[index]);
			entry.getValue().newBid(autoBidders[index], bidAmount);
			
			//System.out.println(entry.getValue().getBids().size());
		}*/
		for(Residential res:reoListings.getResidences()) {
			Random r = new Random();
			int index = r.nextInt((autoBidders.length-1) +1);
			
			int maxBid = (int) (res.calculateAppraisalPrice() * 1.1);
			int minBid = (int) (res.calculateAppraisalPrice() * .9);
			
			double bidAmount = (double) (Math.random() * (maxBid - minBid) + 1 + minBid);
			
			res.newBid(autoBidders[index], bidAmount);
			System.out.println(autoBidders[index] + "-" + bidAmount);
			//System.out.println(res.getBidCount());
		}
		
		/*int counter=0;
		for(Map.Entry<String,Double> entryBid:rd.getBids().entrySet()) {
			System.out.println();
		}*/
		//
		//System.out.println("Line 480 :"+ rd.getBidCount());
		
		//System.out.println("Bids added were: "+rd.getBidCount());
	}

}
