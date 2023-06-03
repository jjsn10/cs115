package DessertShop;

import java.util.ArrayList;
import java.util.Iterator;

//import DessertShop.Payable.PayType;

public class Order implements Payable{
	private ArrayList<DessertItem> order = new ArrayList<DessertItem>();
	private PayType payMethod;
	
	public Order() {
		this.payMethod = PayType.CASH;
	}
	public  ArrayList<DessertItem> getOrderList(){
		return order;
	}
	public void add(DessertItem dessert) {
		if(dessert instanceof Candy) {
			for(DessertItem c:this.order) {
				if(c instanceof Candy) {
					if(((Candy) c).isSameAs((Candy)dessert)) {
						((Candy)c).setCandyWeight(((Candy)c).getCandyWeight()+((Candy)dessert).getCandyWeight());
						return;
					}
				}
			}
		}
		if(dessert instanceof Cookie) {
			for(DessertItem ck:this.order) {
				if(ck instanceof Cookie) {
					if(((Cookie)ck).isSameAs((Cookie)dessert)){
						((Cookie)ck).setCookieQty(((Cookie)ck).getCookieQty()+((Cookie)dessert).getCookieQty());
						return;
					}
				}
			}
		}
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
	public  PayType getPayType() {
		return payMethod;
	}
	public void setPayType(PayType payMethod) {
		this.payMethod =payMethod;
	}
	public String toString() {
		String finalOutput = "";
		finalOutput += "----------------------------------------Receipt------------------------------------------\n";
		for(DessertItem item:this.getOrderList()) {
			finalOutput += item;
		}
		finalOutput += "------------------------------------------------------------------------------------------\n";
		
		finalOutput += "Total items in the order: "+ this.itemCount()+"\n";
		finalOutput += String.format("%-65s$%-8.2f[Tax: $%.2f]\n","Order Subtotals",this.orderCost(),this.orderTax());
		finalOutput += String.format("%-65s$%-8.2f\n","Order Total",this.orderCost() + this.orderTax());
		finalOutput += "-------------------------------------------------------------------------------------------\n";
		
		finalOutput += "Paid for with "+ this.getPayType();
		
		return finalOutput;
		
		//System.out.println("Total items in the order: "+ this.itemCount());
		//System.out.printf("%-65s$%-8.2f[Tax: $%.2f]\n","Order Subtotals",this.orderCost(),this.orderTax());
		//System.out.printf("%-65s$%-8.2f\n","Order Total",this.orderCost() + this.orderTax());
		//System.out.println("-------------------------------------------------------------------------------------------");
		
	}
}
