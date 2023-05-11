package DessertShop;

import java.util.ArrayList;

public class DessertShop {
	
	public static void main(String[] args) {
		Order orders = new Order();
		
		//Creating Instances of Candy, Cookie, IceCream, and Sunday
		Candy c1 = new Candy("Candy Corn",1.5,0.25);
		Candy c2 = new Candy("Gummy Bears",0.25,0.35);
		Cookie ck1 = new Cookie("Chocolate Chip",6,3.99);
		IceCream i = new IceCream("Pistachio",2,0.79);
		Sundae s = new Sundae("Vanilla",3,0.69,"Hot Fudge",1.29);
		Cookie ck2 = new Cookie("Oatmeal Raisin",2,3.45);
		
		//Adding Items to the order
		orders.add(c1);
		orders.add(c2);
		orders.add(ck1);
		orders.add(i);
		orders.add(s);
		orders.add(ck2);
		
		ArrayList<DessertItem>  orderItems = orders.getOrderList();
		
		for(DessertItem item:orderItems) {
			//System.out.println(item.getName());
			System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", item.getName(), item.calculateCost(), item.calculateTax());
		}
		System.out.println("------------------------------------------------");
		System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n","Order Subtotals",orders.orderCost(),orders.orderTax());
		System.out.printf("%-25s$%-8.2f\n","Order Total",orders.orderCost() + orders.orderTax());
		System.out.println("Total items in the order: "+ orders.itemCount());
	}
}
