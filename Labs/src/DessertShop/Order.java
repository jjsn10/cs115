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
	public Double orderCost() {
		Double totalCost = 0.0;
		for(DessertItem item:getOrderList()) {
			totalCost += item.calculateCost();
		}
		return totalCost;
	}
	public Double orderTax() {
		Double totalTax = 0.0;
		for(DessertItem item:getOrderList()) {
			totalTax += item.calculateTax();
		}
		return totalTax;
	}
	public String toString() {
		String finalOutput = "";
		finalOutput += "--------------Receipt--------------\n";
		for(DessertItem item:this.getOrderList()) {
			finalOutput += item.toString();
		}
		//finalOutput += "-----------------------------------";
		
		return finalOutput;
		
	}
}
