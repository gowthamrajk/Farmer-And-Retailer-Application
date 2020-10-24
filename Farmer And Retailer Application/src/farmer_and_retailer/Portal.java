package farmer_and_retailer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Portal {
	static int count=1;
	static List<Farmer> farmerList = new ArrayList<>();
	static List<Retailer> retailerList = new ArrayList<>();
	Map<Farmer  , Bid > farmerBidMap = new HashMap<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user type as 1.Farmer 2.Retailer\n");
		int type = sc.nextInt();
		switch(type) {
		case 1 :
			farmerUtil(sc);
			break;
		case 2 :
			RetailerUtil(sc);
			break;
		default :
			System.out.println("Incorrect Access\n");
			break;
		}
	}
	public static void farmerUtil(Scanner sc) {
		System.out.println("please choose yuur type\n1.Existing user 2.New user\n ");
		int usertype = sc.nextInt();
		if(usertype==1) {
			System.out.println("Enter ur farmerId");
			int farmId = sc.nextInt();
			System.out.println("What you wanna do?\n1.searchRetailers 2.PlaceBid 3.display\n");
			int action=sc.nextInt();
			if(action == 1 ) {
				if(retailerList.size()==0 ) {
					System.out.println("Sorry No retailers \n");
				}
				else {
					for(Retailer obj : retailerList )
						System.out.println(obj.getName() +" "+obj.getLocation());
				}
			}
			else if(action == 2 ) {
				System.out.println("Enter the product and its base-price\n");
				String proName = sc.next();
				int price = sc.nextInt();
			}
			else if(action == 3 ) {
				for( Farmer obj  : farmerList ) {
					if( obj.getFarmerId() == farmId  )
						obj.displayProduts();
				}
			}
				
		}
		else {
			System.out.println("Hi Enter your name");
			String name = sc.next();
			Farmer farmobj = new Farmer();
			farmobj.setFarmerId(count);
			count++;
			System.out.println("Enter the number of products\n");
			int tot=sc.nextInt();
			while(tot--  > 0 ) {
				System.out.println("Enter the Product name\n");
				String proName= sc.next();
				System.out.println("Enter thr Quantity in kg\n");
				int kg=sc.nextInt();
				Product obj = new Product();
				obj.setName(proName);
				obj.setQuantity(kg);
				farmobj.addProduct(obj);
			}
		}
		
	}
	

}