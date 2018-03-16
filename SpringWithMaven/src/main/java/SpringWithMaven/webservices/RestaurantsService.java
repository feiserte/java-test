package SpringWithMaven.webservices;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import SpringWithMaven.dao.RestaurantDAO;
import SpringWithMaven.model.RestaurantVO;

@RestController
public class RestaurantsService {
	
	@RequestMapping("/getRestaurantList")
	public @ResponseBody Iterable<RestaurantVO> getRestaurantList() {
		RestaurantDAO dao = new RestaurantDAO();
		try {
			return dao.getRestaurants();
		} catch (SQLException e) {
			return null;
		}
	}
	
}
