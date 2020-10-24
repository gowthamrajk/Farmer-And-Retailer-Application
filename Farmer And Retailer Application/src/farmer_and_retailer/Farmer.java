package farmer_and_retailer;

import java.util.List;

public class Farmer 
{
	private int farmerId;
	private String name;
	private String address;
	Season seasonObj;
	int rating;
	List<Products> ProductList = new ArrayList<>;
	List<String> feedbacks = new ArrayList<>();
	List<Transactions> transactionHistory = new ArrayList<>();
	List<Bid> currentBids = new ArrayList<>();
	int farmerId;
	public int getFarmerId() {
		return farmerId;
	}
	protected void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	public int getRating() {
		return rating;
	}
	protected void setRating(int rating) {
		this.rating = rating;
	}
	public void addProduct(Product obj) {
		ProductList.add(obj);
	}
	public void displayRetailers() {
		System.out.println("Retailers available are:\n");
		for(Retailer obj : RetailerList ) {
			System.out.println("Name- "+obj.getName()+" Location-"+obj.getLocation() );
			
		}
	}
	public void displayProduts() {
		for(Products obj : ProductList) {
			System.out.println(obj.getName() );
		}
	}
	
}