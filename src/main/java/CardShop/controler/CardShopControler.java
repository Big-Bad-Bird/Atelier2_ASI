package CardShop.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CardShop.model.CardModel;
import CardShop.model.CardShopService;

@RestController
public class CardShopControler {
	@Autowired
	private CardShopService cardShopService;
	
	@RequestMapping("/Card/getAllCards")
	public List<CardModel> getAllCards() {
		return cardShopService.getallCard();
	}
	
	@RequestMapping("/Card/{id}")
	public CardModel getCardById(@PathVariable String id) {
		return cardShopService.getCardById(id);
	}
	
	@RequestMapping("/Card/addCard/{card}")
	public void addCard(@PathVariable CardModel card) {
		cardShopService.addCard(card);
	}
}
