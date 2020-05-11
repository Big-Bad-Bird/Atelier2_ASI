package CardShop.springbootstarter.model;



public class CardShopTest {

	private User userTest;
	
	public void main(String[] args) {
		this.userTest = new User();
		this.testCall(this.userTest);
	}

	public void testCall(User user) {
		Transactor transactor = new Transactor("id carte",this.userTest,this.userTest,10);
		boolean answer = this.transactionCard(transactor);
		System.out.println(answer);
	}
	public boolean transactionCard(Transactor transactor) {// , User vendeur & acheteur
		boolean answer = false;
		
		
		User cardBuyer = transactor.cardBuyer;
		User cardSeller = transactor.cardSeller;
		
		cardBuyer.setArgent(cardBuyer.getArgent() - transactor.cost);
		cardSeller.setArgent(cardSeller.getArgent() + transactor.cost);
		
		
		int idAcheteur = cardBuyer.getId();
		int idVendeur = cardSeller.getId();
		String cardId = transactor.cardId;
		System.out.println("idAcheteur : " + idAcheteur + " id Vendeur : " + idVendeur  + "prix : " + transactor.cost);
		System.out.println("ID carte : " + cardId);
		// à ce stade on peut trouver les utilisateurs par Id dans la BdD
		// TODO ajouter connexion BdD quand on pourra
		
		return answer;
	}
}
