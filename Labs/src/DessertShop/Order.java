package DessertShop;

import java.util.ArrayList;

public class Order {
	private ArrayList<DessertItem> order = new ArrayList<DessertItem>();
	
	public Order() {
		
	}
	public  ArrayList<DessertItem> getOrderList(){
		return order;
	}
	public void add(DessertItem dessert) {
		order.add(dessert);
	}
	public int itemCount() {
		return order.size();
	}
}
