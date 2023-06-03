package DessertShop;

public interface Payable {
	enum PayType {
			CARD,
			CASH,
			PHONE
	}
	public PayType getPayType();
	public void setPayType(PayType payMethod);
}
