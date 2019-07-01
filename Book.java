package playStore;

public class Book extends Publication {
		  private String[] authorName;
		  
		   public Book(String ID, String name, double price, String publisher, int numPages, String[] authorName) {
				 super(ID, name, price, publisher, numPages);
				 this.authorName = authorName;
		   }
				 
		

		public String[] getAuthorname() {return authorName;}
	    	 

			   // new publications
	   //     String[] authors1 = {"L. Tolstoy"};
	  //      Book b1 = new Book ("b1", "War and Peace", 0, 12.55, "no review", "The Russian Messenger", 1225, authors1);
	                
	   //     String[] authors2 = {"F. Scott Fitzgerald"};
	   //     Book b2 = new Book ("b2", "The great gatsby", 10, "Charles Scribner's Sons", 180, authors2);
	                
	     //   String[] authors3 = {"Thomas H. Cormen", "Charles E. Leiserson", "Ronald L. Rivest", "Clifford Stein"};
	     //   Book b3 = new Book ("b3", "Introduction to algorithms", 100, "MIT Press", 1312, authors3);
	           
}

