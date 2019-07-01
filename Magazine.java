package playStore;

public class Magazine extends Publication {
		   private int volume;
		   
		   public Magazine(String ID, String name, double price, String publisher, int numPages, int volume) {
				 super(ID, name, price, publisher, numPages);
				 this.volume = volume;
		   }
	
				 
			public int getVolume(){return volume;}
				 
				 
//	        	Magazine m1 = new Magazine("m1", "Forbes", 8.99, "Forbes Media", 50, 201904);     
	 
}
