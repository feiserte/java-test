package SpringWithMaven.model;

public class RestaurantVO {
	
	private int restaurantId;
	private String restaurantName;
	private String restaurantAddress;
	private String restaurantCity;
	private String restaurantState;
	private String restaurantCountry;
	private Double restaurantLatitude;
	private Double restaurantLongitude;
	private Double restaurantRate;
	
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public String getRestaurantCity() {
		return restaurantCity;
	}
	public void setRestaurantCity(String restaurantCity) {
		this.restaurantCity = restaurantCity;
	}
	public String getRestaurantState() {
		return restaurantState;
	}
	public void setRestaurantState(String restaurantState) {
		this.restaurantState = restaurantState;
	}
	public String getRestaurantCountry() {
		return restaurantCountry;
	}
	public void setRestaurantCountry(String restaurantCountry) {
		this.restaurantCountry = restaurantCountry;
	}
	public Double getRestaurantLatitude() {
		return restaurantLatitude;
	}
	public void setRestaurantLatitude(Double restaurantLatitude) {
		this.restaurantLatitude = restaurantLatitude;
	}
	public Double getRestaurantLongitude() {
		return restaurantLongitude;
	}
	public void setRestaurantLongitude(Double restaurantLongitude) {
		this.restaurantLongitude = restaurantLongitude;
	}
	public Double getRestaurantRate() {
		return restaurantRate;
	}
	public void setRestaurantRate(Double restaurantRate) {
		this.restaurantRate = restaurantRate;
	}
}
