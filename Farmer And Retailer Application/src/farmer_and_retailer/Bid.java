package farmer_and_retailer;

public class Bid {
	private int bidId;
	private int farmer;
	private int productId;
	private String timeFrame;
	private int basePrice;
	Retailer retailer;
	Map<retailer , Integer > RetailerPriceMap =  new HashMap<>();
	private int currentStatus;
	public int getBidId() {
		return bidId;
	}
	public void setBidId(int bidId) {
		this.bidId = bidId;
	}
	public int getFarmer() {
		return farmer;
	}
	public void setFarmer(int farmer) {
		this.farmer = farmer;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getTimeFrame() {
		return timeFrame;
	}
	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	public int getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(int currentStatus) {
		this.currentStatus = currentStatus;
	}
	
}