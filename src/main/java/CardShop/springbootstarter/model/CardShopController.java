package CardShop.springbootstarter.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(method=RequestMethod.POST,value="/addCard")
	public void addCard(@RequestBody CardModel card) {
		cardShopService.addCard(card);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delCard/{card}")
	public void delCard(@PathVariable CardModel card) {
		cardShopService.delCard(card);
	}
	
	
	/*** en attendant de savoir comment on gère les différents profils	*
	*    si on achète aux uns et aux autres etc
	*   
	*
	***/
	
	@RequestMapping(method=RequestMethod.POST,value="/buyCard")
	public void buyCard(@RequestBody Transactor transactor) { // user à ajouter plus tard pour savoir qui achète
		cardShopService.transactionCard(transactor);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/sellCard") // POST Correct ??
	public void sellCard(@RequestBody Transactor transactor) { // user à ajouter plus tard pour savoir qui achète
		cardShopService.transactionCard(transactor);
	}
}


