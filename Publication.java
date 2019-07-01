package playStore;

import java.util.ArrayList;

public class Publication extends Content{
		 public String publisher;
		 public int numPages;
		 ArrayList<String> reviews = new ArrayList<String>();
		 
		 public Publication(String ID, String name, double price, String publisher, int numPages) {
			 super(ID, name, price);
			 this.publisher = publisher;
			 this.numPages = numPages;
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
		
}// end of class