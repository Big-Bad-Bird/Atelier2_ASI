package CardShop.springbootstarter.model;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CardShopStaticController {

	@RequestMapping("/")
	public String Home() {
		return "redirect:/cardHome.html";
	}

}


