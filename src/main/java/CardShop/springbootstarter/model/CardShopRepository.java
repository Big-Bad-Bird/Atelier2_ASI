package CardShop.springbootstarter.model;
import java.util.List;

import org.springframework.data.repository.CrudRepository;




public interface CardShopRepository extends CrudRepository<CardModel, Integer>{
	public List<CardModel> findById(String id);

}

