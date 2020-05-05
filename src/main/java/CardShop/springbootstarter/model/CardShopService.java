package CardShop.springbootstarter.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//import io.javabrains.springbootstarter.topic.Topic;


@Service
public class CardShopService {

	// placeholder for error (card not found)
	CardModel errorCard = new CardModel("ERROR","CARD NOT FOUND", "Famille error", 0, 0, 0, 0, "data:image/jpeg;base64,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");

	List<CardModel> cards;
	public CardShopService() {
		
		//TODO remplacer par appel à la BdD
		this.cards = Arrays.asList(
				new CardModel("Nidus", "ceci est la carte 1", "famille 1", 5, 5, 5, 5,
							"https://vignette.wikia.nocookie.net/warframe/images/4/4c/NidusNewLook.png/revision/latest?cb=20161223053121")
				);
	}

	// retourne toutes les cartes existantes
	public List<CardModel> getallCard() {
		return this.cards;
	}
	
	// retourne une carte spécifique
	public CardModel getCard(String name) {
		CardModel cardReturn = this.errorCard;
		
		for(CardModel card : this.cards) {
			if(card.getName().equals(name)) {
				cardReturn = card;
			}
		}
		return cardReturn;
	}
	
	// ajoute une carte à la liste des cartes
	public void addCard(CardModel card) {
		this.cards.add(card);
	}
	
	// supprime une carte de la liste des cartes
	public void delCard(CardModel card) {
		this.cards.remove(card);
	}
	
	
	// renvoie une carte par son Id unique
	public CardModel getCardById(String id) {
		
		CardModel cardReturn = this.errorCard;
		for(CardModel card : this.cards) {
			if(card.getId() == id) {
				cardReturn = card;
			}
		}
		return cardReturn;
	}

	public boolean sellCard(String id) {// , User vendeur
		boolean answer = false;
		// TODO on vérifie que l'id est dans la collection du user puis
		// on décrémente la quantitée possédée si ça ne passe pas sous 0 sinon vente impossible
		// return true si vente ok false sinon (modif BdD ?)
		return answer;
	}


	

	public boolean buyCard(String id) {// , User acheteur une fois qu'on aura un type user
		boolean answer = false;
		// TODO on vérifie que l'utilisateur peut acheter (fonds suffisants) puis
		// on décrémente son porte monnaie
		// return true si achat ok false sinon (modif BdD ?)
		return answer;
	}

}	






