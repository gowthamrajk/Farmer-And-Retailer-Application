package farmer_and_retailer;

import java.util.List;

public class Retailer {
	private int retailerId;
	private String name;
	private String location;
	Inventory inventoryObj;
	private int rating;
	List<Bids> placedBids= new ArrayList<>();
	public int getRetailerId() {
		return retailerId;
	}
	protected void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	protected void setLocation(String location) {
		this.location = location;
	}
	public int getRating() {
		return rating;
	}
	protected void setRating(int rating) {
		this.rating = rating;
	}
	
}