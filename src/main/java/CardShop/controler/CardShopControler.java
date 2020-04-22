package CardShop.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardShopControler {
	
	//marche pas TODO
	@RequestMapping("/home")
    public String Home() {
        return "redirect:cardHome.html";
    }
	
	
}
