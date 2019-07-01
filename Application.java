package playStore;

import java.util.ArrayList;

public class Application extends Content {
       	private String OSType; 
       	ArrayList<String> reviews = new ArrayList<String>();
       	
       	public Application(String ID, String name, double price, String OSType) {
       		 super(ID, name, price);
       		 this.OSType = OSType;
       	}
       
       //set up for the free app
       		public Application(String ID, String name, String OSType) {
          		 this(ID, name, 0 , OSType); 
			}

     

		public void addReview(Comments c) {
	       		reviews.add(c.comment);
	       	}
		

		public void showReviews() {
			for (String review: reviews)
			{
				System.out.println(review);
				
			}
			}
		
		public void increaseNumDownloads()
		{
			numDownloads=+1;
		}
		
		
	}  // end of class

	
