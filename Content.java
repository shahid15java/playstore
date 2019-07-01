package playStore;

abstract public class Content {
		public String ID;
		public String name;
		public String contentType=null;
		public int numDownloads;
		public double price;
		public String[] reviews=null;
		public abstract void addReview(Comments c);
		public abstract void showReviews();
		public abstract void increaseNumDownloads();
	    public Content (String ID, String name, double price ){
				this.ID = ID;
				this.name = name;
				this.numDownloads = 0;
				this.price = price;
	    	}
	    
}
