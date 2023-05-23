package DessertShop;

import java.util.ArrayList;
import java.util.Scanner;

public class DessertShop {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Order orders = new Order();
		
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

		boolean done = false;
		while (!done) {
		    System.out.println("\n1: Candy");
		    System.out.println("2: Cookie");            
		    System.out.println("3: Ice Cream");
		    System.out.println("4: Sunday");

		    System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
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
		            default:            
		                System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
		                break;
		        }//end of switch (choice)
		    }//end of if (choice.equals(""))
		}//end of while (!done)
		System.out.println("\n");

		/******End Copy*****/
		
		
		System.out.println(orders);
		
		
		//ArrayList<DessertItem>  orderItems = orders.getOrderList();
		
		//for(DessertItem item:orderItems) {
			//System.out.println(item.getName());
			//System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", item.getName(), item.calculateCost(), item.calculateTax());
		//}
		//System.out.println("------------------------------------------------");
		System.out.println("Total items in the order: "+ orders.itemCount());
		System.out.printf("%-65s$%-8.2f[Tax: $%.2f]\n","Order Subtotals",orders.orderCost(),orders.orderTax());
		System.out.printf("%-65s$%-8.2f\n","Order Total",orders.orderCost() + orders.orderTax());
		System.out.println("-------------------------------------------------------------------------------------------");
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

		//Candy c = new Candy(name,candyWeigth,pricePerPound);
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
}
