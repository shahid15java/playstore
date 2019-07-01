package playStore;

import java.util.ArrayList;

public class User {

		private String userID;
		private String name;
		private String phNum;
		private double availFund;
		private boolean isPremium = false;
		private ArrayList<User> users;
	
		static ArrayList<String> purchasedItems = new ArrayList<String>();
		
			public User(String userID, String name, String phNum, double availFund) {
				this.userID = userID;
				this.name = name;
				this.phNum = phNum;
				this.availFund = availFund;
				users = new ArrayList<User>();
				
			}
			
			public User(String userID, String name, String phNum) {
				this.userID = userID;
				this.name = name;
				this.phNum = phNum;
				this.availFund = 500;
				 
			}   
		    
			public String getID() {return userID;}
			public String getName() {return name;}
			public String getPhnum() {return phNum;}
			
			
			public void reduceAvailFund(double price)
			{availFund = availFund-price;
			}
			
			public double getAvailFund() {return availFund;}
			public void setPremium() {isPremium = true;}
			public boolean getPremium() {return isPremium;}
			
			// add the user to your list of users
			public void addUser(User user) {
				users.add(user);{
					
				}
			}
				
				
			public void addContentBought(String itemName) {
				//show list of names of all contents user has bought
				
				purchasedItems.add(itemName);
				
				
			}
			
				
			public static void showContentBought() {
				//show list of names of all contents user has bought
						
				for (String p: purchasedItems)
				{
					System.out.println(p);
				}
				
			}

			public void buyContent(Magazine m1) {

				
			}
public void buyContent(Book b1) {

				
			}
public void buyContent(Application g1) {

	
}
			}

