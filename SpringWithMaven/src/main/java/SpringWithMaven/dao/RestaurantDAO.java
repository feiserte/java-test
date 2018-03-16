package SpringWithMaven.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import SpringWithMaven.model.RestaurantVO;

public class RestaurantDAO {

	/**
	 * Select all restaurants from the database.
	 * 
	 * @author Felipe Iserte Bonfim (felipe.iserte@gmail.com)
	 * @return
	 * @throws SQLException
	 */
	public List<RestaurantVO> getRestaurants() throws SQLException {
		List<RestaurantVO> restaurantList = new ArrayList<RestaurantVO>();
		ResultSet rs = MySQLConnection.getDbCon().query("select * from restaurants");
		
		while(rs.next()) {
			RestaurantVO restaurant = new RestaurantVO();
			restaurant.setRestaurantId(rs.getInt(1));
			restaurant.setRestaurantName(rs.getString(2));
			restaurant.setRestaurantAddress(rs.getString(3));
			restaurant.setRestaurantCity(rs.getString(4));
			restaurant.setRestaurantState(rs.getString(5));
			restaurant.setRestaurantCountry(rs.getString(6));
			restaurant.setRestaurantLatitude(rs.getDouble(7));
			restaurant.setRestaurantLongitude(rs.getDouble(8));
			restaurant.setRestaurantRate(rs.getDouble(9));
			
			restaurantList.add(restaurant);
		}
		
		return restaurantList;
	}
}
