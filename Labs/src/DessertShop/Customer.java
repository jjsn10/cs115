package DessertShop;

import java.util.ArrayList;

public class Customer {
	private String custName;
	ArrayList<Order> orderHistory = new ArrayList<Order>();
	private int custID;
    static int nextCustID = 1000;
	
	public Customer(String custName) {
		this.custID = nextCustID;
		this.custName = custName;
		//nextCustID++;
	}
	public String getName() {
		return this.custName;
	}
	public int getID() {
		return custID;
	}
	public ArrayList<Order> getOrderHistory(){
		return this.orderHistory;
	}
	public void setName(String n) {
		this.custName = n;
	}
	public void addToHistory(Order o) {
		this.orderHistory.add(o);
	}
}
