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

}
