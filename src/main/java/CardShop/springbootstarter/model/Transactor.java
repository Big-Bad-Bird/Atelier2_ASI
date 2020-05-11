package CardShop.springbootstarter.model;

public class Transactor {

	String cardId;
	User cardBuyer;
	User cardSeller;
	int cost;
	public Transactor(String cardId, User buyer, User seller, int cost) {
		this.cardId = cardId;
		this.cardBuyer = buyer;
		this.cardSeller = seller;
		this.cost = cost;
	}
}