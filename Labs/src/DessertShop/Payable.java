package DessertShop;

public interface Payable {
	enum Paytype {
			CARD,
			CASH,
			PHONE
	}
	public Paytype getPayable();
	public void setPayable(Paytype pay);
}
