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
	
	@RequestMapping("/Card/{id}") // syntaxe pour ça: /Card/id="string"
	public CardModel getCardById(@PathVariable String id) {
		return cardShopService.getCardById(id);
	}
	
	@RequestMapping("/Card/{name}") // syntaxe pour ça: /Card/name="string"
	public CardModel getCard(@PathVariable String name) {
		return cardShopService.getCard(name);
	}
	
	@RequestMapping("/Card/addCard/{card}")
	public void addCard(@PathVariable CardModel card) {
		cardShopService.addCard(card);
	}
	
	@RequestMapping("/Card/delCard/{card}")
	public void delCArd(@PathVariable CardModel card) {
		cardShopService.delCard(card);
	}
}


