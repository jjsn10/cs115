package DessertShop;

//import java.util.ArrayList;
import java.util.*;
//import java.util.Scanner;

import DessertShop.Payable.PayType;

public class DessertShop {
	public static HashMap<String,Customer> customerDB = new HashMap<String, Customer>();
	
	public static void main(String[] args) {
		//HashMap<String,Customer> customerDB = new HashMap<String, Customer>();
		Scanner in = new Scanner(System.in);
		
		
		boolean done = false;
		
	while(!done) {
		
		Order orders = new Order();
		/*
		 * ArrayList<String>
		for(String customer : customerDB.keySet()) {
			System.out.printf("%s => %s%n",customer,customerDB.get(customer));
		}*/
		//Creating Instances of Candy, Cookie, IceCream, and Sunday
				Cookie ck3 = new Cookie("Chip Macadamia",5,4.99,"Box");
				Sundae s = new Sundae("Mint Chocolate Chip",4,0.89,"Sprinkles",0.79,"Boat");
				Candy c1 = new Candy("Candy Corn",1.50,0.25,"Bag");
				Candy c2 = new Candy("Gummy Bears",0.25,0.35,"Bag");
				Cookie ck1 = new Cookie("Chocolate Chip",6,3.99,"Box");
				IceCream i = new IceCream("Pistachio",2,0.79,"Bowl");
				Sundae s2 = new Sundae("Vanilla",3,0.69,"Hot Fudge",1.29,"Boat");
				Cookie ck2 = new Cookie("Oatmeal Raisin",2,3.45,"Box");
				
				//Adding Items to the order
				orders.add(ck3);
				orders.add(s);
				orders.add(c1);
				orders.add(c2);
				orders.add(ck1);
				orders.add(i);
				orders.add(s2);
				orders.add(ck2);
		
		/******Begin Copy******/

		Scanner sIn = new Scanner(System.in);    
		String choice;
		DessertItem orderItem;
		
		

	//	boolean done = false;
		
	//while(!done) {
			
		//Program Running
		while (!done) {
		    System.out.println("\n1: Candy");
		    System.out.println("2: Cookie");            
		    System.out.println("3: Ice Cream");
		    System.out.println("4: Sunday");
		    System.out.println("5: Admin Module");

		    System.out.print("\nWhat would you like to add to the order? (1-5, Enter for done): ");
		    choice = sIn.nextLine();
		    
		    if (choice.equals("")) {
		        done = true;
		    } else {
		        switch (choice) {
		            case "1":            
		                orderItem = userPromptCandy();
		                orders.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		            case "2":            
		                orderItem = userPromptCookie();
		                orders.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		            case "3":            
		                orderItem = userPromptIceCream();
		                orders.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		            case "4":            
		                orderItem = userPromptSundae();
		                orders.add(orderItem);
		                System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		                break;
		            case "5":
		            	showAdmin();
		            	break;
		            default:            
		                System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
		                break;
		        }//end of switch (choice)
		    }//end of if (choice.equals(""))
		}//end of while (!done)
		System.out.println("\n");

		/******End Copy*****/
		done=false;
		/*Customer cust1 = new Customer("Jared");
		cust1.addToHistory(orders);
		customerDB.put("Jared",cust1);*/
//		System.out.println("Line 107: "+cust.getName());
//		System.out.println("Line 108: "+cust.getID());
		//Customer cust = null;
		String custName = "";
		while(!done) {
			System.out.println("Please, Add Customer Name: ");
			custName = sIn.nextLine();
			if(customerDB.containsKey(custName)) {
				//System.out.println("113:Customer ID: "+cust.getID());
				//System.out.println("Line 114 :"+customerDB.containsKey(custName));
				//System.out.println("Line 115: "+custName);
				//System.out.println("113:Customer Name: "+ customerDB);
				//System.out.println("114:Customer ID: "+cust.getID());
				//cust = customerDB.get(custName);
				//Customer.nextCustID--;
				customerDB.get(custName).addToHistory(orders);
				done = true;
			}else {
				Customer cust = new Customer("");
				//System.out.println("Line 124: "+ custName);
				//cust = new Customer(custName);
				cust.setName(custName);
				//System.out.println("Line 126:Customer ID: "+cust.getID());
				//Customer.nextCustID++;
				cust.addToHistory(orders);
				customerDB.put(custName, cust);
				//System.out.println("130:Customer ID: "+cust.getID());
				//System.out.println("131:Customer Name: "+ customerDB);
				done = true;
			}
			System.out.println("Line 136: Hash Items: "+customerDB);
			
			
		}
		
		/*********Pay Method*********/
		done=false;
		while(!done) {
			System.out.print("What form of payment will be used? (CASH, CARD, PHONE):\033[4m");
			String method = sIn.nextLine();
			for(Payable.PayType pay:Payable.PayType.values()){
				if( method.equalsIgnoreCase(pay.name())){
					orders.setPayType(pay);
					done = true;
					break;
				}
			}
			if(!done) {
				System.out.println("\033[0mThat's not a valid form of payment.");
			}
			
		}
		
		
		/****************************/
		
		Collections.sort(orders.getOrderList());
		System.out.println("\033[0m \n"+orders);
		
		System.out.printf("%s %-15s %15s %-15s %12s %-12s %n%n","Customer Name: ",custName,"Customer ID: ",customerDB.get(custName).getID(),"Total Orders: ",customerDB.get(custName).getOrderHistory().size());
		//End Program running
		
		System.out.println("Hit enter to start a new order:");
		String newOrder = sIn.nextLine();
			if(newOrder.equals("")) {
				done = false;
				
			}
	}
		
		//ArrayList<DessertItem>  orderItems = orders.getOrderList();
		
		//for(DessertItem item:orderItems) {
			//System.out.println(item.getName());
			//System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", item.getName(), item.calculateCost(), item.calculateTax());
		//}
		//System.out.println("------------------------------------------------");
		//System.out.println("Total items in the order: "+ orders.itemCount());
		//System.out.printf("%-65s$%-8.2f[Tax: $%.2f]\n","Order Subtotals",orders.orderCost(),orders.orderTax());
		//System.out.printf("%-65s$%-8.2f\n","Order Total",orders.orderCost() + orders.orderTax());
		//System.out.println("-------------------------------------------------------------------------------------------");
	}
	private static DessertItem userPromptCandy() {
		Scanner in = new Scanner(System.in);
		boolean status = false;
		String name="";
		double candyWeigth=0.0;
		double pricePerPound=0.0;
		String packaging = "Bag";
		
		do {
			try {
				System.out.println("Enter the type of candie: ");
				name = in.nextLine();
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Numbers are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Enter the weigth of candie: ");
				candyWeigth = Double.parseDouble(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Enter the price per pound: ");
				pricePerPound = Double.parseDouble(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		
		/*in.close();*/

		//Candy c = new Candy(name,candyWeigth,pricePerPound,packaging);
		/*if(c instanceof Candy && c.isSameAs(c)) {
			c.setCandyWeight(candyWeigth);
		}
		return c;*/
		return new Candy(name,candyWeigth,pricePerPound,packaging);
	}
	private static DessertItem userPromptCookie() {
		Scanner in = new Scanner(System.in);
		boolean status = false;
		String name="";
		int cookieQty=0;
		double pricePerDozen=0.0;
		String packaging = "Box";
		
		do {
			try {
				System.out.println("Enter the type of cookie: ");
				name = in.nextLine();
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Numbers are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Enter the quantity purchased: ");
				cookieQty = Integer.parseInt(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Enter the price per dozen: ");
				pricePerDozen = Double.parseDouble(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		
		/*in.close();*/

		//Candy c = new Candy(name,candyWeigth,pricePerPound);
		return new Cookie(name,cookieQty,pricePerDozen,packaging);
	}
	private static DessertItem userPromptIceCream() {
		Scanner in = new Scanner(System.in);
		boolean status = false;
		String name="";
		int scoopCount=0;
		double pricePerScoop=0.0;
		String packaging = "Bowl";
		
		do {
			try {
				System.out.println("Enter the type of Ice Cream used: ");
				name = in.nextLine();
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Numbers are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Enter the number of scoops: ");
				scoopCount = Integer.parseInt(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Enter the price per scoop: ");
				pricePerScoop = Double.parseDouble(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		
		/*in.close();*/

		//Candy c = new Candy(name,candyWeigth,pricePerPound);
		return new IceCream(name,scoopCount,pricePerScoop,packaging);

		
	}
	private static DessertItem userPromptSundae() {
		Scanner in = new Scanner(System.in);
		boolean status = false;
		String name="";
		int scoopCount=0;
		double pricePerScoop=0.0;
		String toppingName ="";
		Double toppingPrice=0.0;
		String packaging = "Boat";
		
		do {
			try {
				System.out.println("Enter the type of Ice Cream: ");
				name = in.nextLine();
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Numbers are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Enter the number of Scoops: ");
				scoopCount = Integer.parseInt(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Enter the price per Scoop: ");
				pricePerScoop = Double.parseDouble(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Enter the kind of toppings used: ");
				toppingName = in.nextLine();
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Numbers are not allowed");
			}	
		}while(!status);
		status = false;
		do {
			try {
				System.out.println("Enter the price for the tooping: ");
				toppingPrice = Double.parseDouble(in.nextLine());
				status = true;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Invalid response: Strings are not allowed");
			}	
		}while(!status);

		
		/*in.close();*/

		//Candy c = new Candy(name,candyWeigth,pricePerPound);
		return new Sundae(name,scoopCount,pricePerScoop,toppingName,toppingPrice,packaging);

		
	}
	private static void showAdmin() {
		System.out.println("Line 409: Show Admin ...");
		boolean done = false;
		String choice = "";
		Scanner sIn = new Scanner(System.in);
		while (!done) {
		    System.out.println("\n1: Shop Customer List");
		    System.out.println("2: Customer Order History");            
		    System.out.println("3: Best Customer");
		    System.out.println("4: Exit Admin Module");

		    System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
		    choice = sIn.nextLine();
		    
		   
		        switch (choice) {
		            case "1":            
		            	showCustomerList();
		                //orderItem = userPromptCandy();
		                //orders.add(orderItem);
		                //System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		            	//System.out.println("choice 1 pressed");
		                break;
		            case "2":            
		                //orderItem = userPromptCookie();
		                //orders.add(orderItem);
		                //System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		            	customerOrders();
		            	//System.out.println("choice 2 pressed");
		                break;
		            case "3":            
		                //orderItem = userPromptIceCream();
		                //orders.add(orderItem);
		                //System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		            	bestCustomer();
		            	System.out.println("choice 3 pressed");
		                break;
		            case "4":            
		                //orderItem = userPromptSundae();
		                //orders.add(orderItem);
		                //System.out.printf("%n%s has been added to your order.%n",orderItem.getName());
		            	System.out.println("choice 4 pressed");
		            	done = true;
		            	break;
		            default:            
		                System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
		                break;
		        }//end of switch (choice)
		    }//end of if (choice.equals(""))
		//}//end of while (!done)
		System.out.println("\n");

	}
	private static void showCustomerList() {
		customerDB.forEach((key,value)-> System.out.printf("%10s %s %15s %s %n","Customer Name: ",value.getName(),"Customer ID: ",value.getID()));
	}
	private static void customerOrders() {
		Scanner sIn = new Scanner(System.in);
		String custName = "";
		boolean  done = false;
		while(!done) {
			System.out.println("Enter the name of the customer: ");
			custName = sIn.nextLine();
			if(custName.equals("")) {
				System.out.println("Please, Enter a customer name !!");
			}else {
				if(customerDB.containsKey(custName)) {
					int numOrder = 0;
					Customer cust = customerDB.get(custName);
					System.out.println("\n");
					//customerDB.forEach((key,value)->System.out.printf("%10s %s %15s %s %n","Customer Name: ",value.getName(),"Customer ID: ",value.getID()));
					System.out.printf("%10s %s %15s %s %n%n","Customer Name: ",cust.getName(),"Customer ID: ",cust.getID());
					//System.out.println();
					//printOrders(customerDB.get(custName).getOrderHistory());
					for(Order order:customerDB.get(custName).getOrderHistory()) {
						numOrder++;
						System.out.println("----------------------------------------------------------------------------------------\n");
						System.out.printf("%s %s %n%n","Order #:",numOrder);
						System.out.println(order);
					}
					done = true;
				}else {
					System.out.println("Customer does not exist!!!");
				}
			}
		}	
	}
	private  static void bestCustomer() {
		ArrayList<String> customerKeys = new ArrayList<String>(customerDB.keySet());
		Double bestCustomerTotalOrders = getTotalOrderCost(customerKeys.get(0));
		String best = customerDB.get(customerKeys.get(0)).getName();
		for(String key : customerKeys) {
			if(bestCustomerTotalOrders < getTotalOrderCost(key)) {
				//System.out.println("The Dessert Shop's most valued customer is:" + customerDB.get(key).getName());
				best = customerDB.get(key).getName();
			}
			
		}
		System.out.println("----------------------------------------------------------------------\n");
		System.out.println("The Dessert Shop's most valued customer is: "+ best +"\n");
		System.out.println("----------------------------------------------------------------------\n");
	}
	private static Double getTotalOrderCost(String custName) {
		double sum = 0.0;
		ArrayList<Order> ordersUser = customerDB.get(custName).getOrderHistory();
		for(Order order:ordersUser){
			sum += order.orderCost();
		}
		return sum;
	}
	/*private static void printOrders(ArrayList<Order> orders) {
		for (Order order:orders) {
			System.out.println(order);
		}
		//System.out.println(orders);
	}*/
}
