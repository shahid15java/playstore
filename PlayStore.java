package playStore;
import java.util.ArrayList;
public class PlayStore {

	//You may need the following packages
	//import java.util.Hashtable;
	//import java.util.ArrayList;
	
//	 ArrayList numAuthor = new ArrayList();

	 ArrayList<Comments> comments = new ArrayList<Comments>();
	 ArrayList<Content> contents = new ArrayList<Content>();
	 ArrayList<User> users = new ArrayList<User>();

		// Instance variables that you need.
		// They must all be marked as private
		
		// Declare a private variable (array or similar) to store your Content objects here
		
		// Declare a private variable (array or similar) to store your User objects here
		
	private int [][] Book;	
	private int [][] Magazine;	
	private int [][] Content;	

	
		public PlayStore() {
			// any code you need here
		}
		
		public void addUser(User u) {
			// add the user to your list of users
	//		User.add(user);
			users.add(u);
		
		}
		
		public void addContent(Content content) {
			contents.add(content);
		}
		
		public boolean buyContent(String userID, String itemID) throws InsufficientFunds {
			boolean isPurchased=false;
			double purchasePrice; double reducedPrice;
		    String itemName;
		    InsufficientFunds i;
		    double needFunds=0;
			for (User user: users)
			{
				if (userID.equals(user.getID()))
				{
					
					for (Content content: contents)
					{
						if (itemID.equals(content.ID))
						{
							itemName=content.name;
							
							purchasePrice=content.price;
							if (user.getPremium()==true)
								purchasePrice= (purchasePrice) * 0.80;
							
							needFunds=content.price - user.getAvailFund();
							i = new InsufficientFunds(needFunds);
							try
							{
							if (content.price > user.getAvailFund())
							{
								throw new InsufficientFunds(needFunds);
							}
					       	       //
							
							else // OK to make a purchase
							{
								
								user.reduceAvailFund(purchasePrice);
								user.addContentBought(itemName);
								System.out.println("The available balance after purchase is "+ user.getAvailFund());
								content.increaseNumDownloads();
								isPurchased=true;
								
							}
							} catch(InsufficientFunds e)
							{
								System.out.println("Funds short by "+ i.getFund());
							}

						}
					}
				}		
			}
			return isPurchased;		
		}
		
		
		
		public void showUser() {
			for (User user: users)
			{
				System.out.println(user.getID());
				System.out.println(user.getAvailFund());
				
			}
		}

		
		public void showContent() {
			// add your code here
			for (Content content: contents)
			{
				System.out.println("Content name: " + content.name);
				System.out.println("Number of downloads: "+ content.numDownloads);
				
			}
		}
		
		public void showComment(String itemID) {
			for (Content content: contents)                  // We hit the right content
			{
				if (itemID.equals(content.ID))
				{
					content.showReviews();
					
				}
			}
			
		}
		
		public void showPurchasedList(String getID) {
			for (User user: users)
			{
				if (getID.equals(user.getID()))
				{
					
					User.showContentBought();
					
				}
			}
		}

		public boolean becomePremium(String ID) {
			boolean madePremium = false;
		
			for (User user: users)
			{
				if (ID.equals(user.getID()))
				{
					
					if (user.getAvailFund()>= 100.00)
							{
						    user.reduceAvailFund(100.00);
						    user.setPremium();
						    madePremium = true;
						    System.out.println("New balance "+ user.getAvailFund());
							}
				}		
		}
			return madePremium;
		
}

	
}

