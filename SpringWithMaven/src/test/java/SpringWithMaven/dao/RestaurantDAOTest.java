package SpringWithMaven.dao;

import java.sql.SQLException;

import org.junit.Assert;
import org.junit.Test;

import SpringWithMaven.dao.RestaurantDAO;

public class RestaurantDAOTest {
	
	@Test
	public void testGetRestaurant() throws SQLException {
		RestaurantDAO dao = new RestaurantDAO();
		Assert.assertNotNull(dao.getRestaurants());
	}
	
}
