package CardShop.springbootstarter.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardShopController {
	@Autowired
	private CardShopService cardShopService;
	
	@RequestMapping("/Card/getAllCards")
	public List<CardModel> getAllCards() {
		return cardShopService.getallCard();
	}
	
	@RequestMapping("/ById/{id}") // syntaxe pour ça: /Byid/id
	public CardModel getCardById(@PathVariable String id) {
		return cardShopService.getCardById(id);
	}
	
	@RequestMapping("/ByName/{name}") // syntaxe pour ça: /ByName/name
	public CardModel getCard(@PathVariable String name) {
		return cardShopService.getCard(name);
	}
	
	@RequestMapping("/addCard/{card}")
	public void addCard(@PathVariable CardModel card) {
		cardShopService.addCard(card);
	}
	
	@RequestMapping("/delCard/{card}")
	public void delCard(@PathVariable CardModel card) {
		cardShopService.delCard(card);
	}
	
	
	// en attendant de savoir comment on gère les différents profils si on achète aux uns et aux autres etc
	@RequestMapping("/buyCard/{id}")
	public void buyCard(@PathVariable String id) { // user à ajouter plus tard pour savoir qui achète
		cardShopService.buyCard(id);
	}
	
	@RequestMapping("/sellCard/{id}")
	public void sellCard(@PathVariable String id) { // user à ajouter plus tard pour savoir qui achète
		cardShopService.sellCard(id);
	}
}


