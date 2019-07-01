package playStore;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayStoreMain {
		
	    public static void main(String[] args) throws InsufficientFunds {
	    	
	        PlayStore store = new PlayStore();
	        int option = 0;
			Scanner s = new Scanner(System.in);	
			String userID=null;
			
			
             

            String[] authors1 = {"L. Tolstoy"};
            Book b1 = new Book ("b1", "War and Peace", 12.55, "The Russian Messenger", 1225, authors1);
                    
            String[] authors2 = {"F. Scott Fitzgerald"};
            Book b2 = new Book ("b2", "The great gatsby", 10, "Charles Scribner's Sons", 180, authors2);
                    
            String[] authors3 = {"Thomas H. Cormen", "Charles E. Leiserson", "Ronald L. Rivest", "Clifford Stein"};
            Book b3 = new Book ("b3", "Introduction to algorithms", 100, "MIT Press", 1312, authors3);
                    
            Magazine m1 = new Magazine("m1", "Forbes", 8.99, "Forbes Media", 50, 201904);


            
            store.addContent(b1);
            store.addContent(b2);
            store.addContent(b3);
            store.addContent(m1);
                    
                    
            Application g1 = new Application("g1", "Pokemon", 5.3, "androidV4");    
            Application g2 = new Application("g2", "Pokemon", 5, "iOSV10");
            //a free app
            Application app1 = new Application("app1", "Calendar", "androidV3"); 

            store.addContent(g1);
            store.addContent(g2);
            store.addContent(app1);
                    
                    
            // Adding new users
            User u1 = new User("u1", "John Doe", "0412000", 200);
            User u2 = new User("u2", "Mary Poppins", "0433191");  
            User u3 = new User("u3", "Dave Smith", "0413456", 1000);
            User u4 = new User("u4", "Jackie Chan", "0417654");
                    
            store.addUser(u1);
            store.addUser(u2);
            store.addUser(u3);
            store.addUser(u4);
            
            Comments comment1 = new Comments(u1, "This is a fantastic game!");
            g1.addReview(comment1);
                    
            Comments comment2 = new Comments(u2, "I never liked this game!");
            g1.addReview(comment2);
                    
            g1.addReview(new Comments(u3, "The game crashes frequently"));
     
            b1.addReview(new Comments(u2, "I love Tolstoy!"));


	    
	    //Menu
	       
	        	while(true) {
	        		//store.showUser();
	       	     System.out.println("Enter any option below: ");
	       	     System.out.println("1. Upgrade user to premium");
	       	     System.out.println("2. Purchase one item for one user");
	       	     System.out.println("3. List all available contents");
	       	     System.out.println("4. Show all purchased items");
	       	     System.out.println("5. Show all comments of a content");
//	       	     System.out.println("6. Add new user");
	       	     option= s.nextInt();
	       	      
	     //Switch
	       	     switch (option) {
	       	     case 1: 
		       	     System.out.println("Enter user ID: ");
		       	  userID = s.nextLine(); userID = s.nextLine(); 
		       	     
		       	     boolean madePremium =store.becomePremium(userID);  	    
		       	     if (madePremium == false)  {
		       	    	System.out.println("Not made a premium member");
		       	    	       	    	
		       	     }
		       	    		else	       	    	 
		       	    		{		
		       	    	 System.out.println("Cost $100, made member");
		       	    	 
		       	     }    	  	        	 
		       	     	break;
		   
		       	     	
	       	     case 2: 
	       	    	 
		       	     System.out.println("Enter user ID: ");
		       	     userID = s.nextLine(); userID = s.nextLine();
		       
	       	    
		       	     System.out.println("Enter item ID for purchase: ");
		       	     String itemID = s.nextLine();
		       	     
		       	     boolean isPurchased=store.buyContent(userID, itemID);
		       	     if (isPurchased == false)
		       	    	System.out.println("Item not available, check funds");	
		       	     else System.out.println("Item purchased");
	       	  
		       	     	break;
	       	        //need to handle exception - add try/catch
	       	    
	       	     
	       	     case 3: 
		       	     store.showContent();
		       	     
		       	     	break;
		       	  	 
	       	     case 4:
	       	      System.out.println("Enter user ID: ");
	       	   userID = s.nextLine(); userID = s.nextLine();
	       	     
		       	  store.showPurchasedList(userID);
	       	      		break;
	       	      		
	       	     case 5:
	       	    	 System.out.println("Enter Content ID: ");
		       	     String ID = s.nextLine();ID = s.nextLine();
		       	     store.showComment(ID);
	       	    	 	break;
		       	  
//	       	     case 6:
//	       	      System.out.println("Enter a user ID");
//		       	 getID = s.nextLine();
//	       	     if (getID == true)
//	       	     System.out.println("ID already exists, choose another");
//	       	     else
//	       	    	System.out.println("Enter your name and phone number"); 
//		       	 break;
	       	     }
	      
		  
                        
              
                        
                        
               
                        
                        
                
                        
             
                
                

                 /*                       
                // Simulating transactions, showing content, comments etc etc.  
                // They can be driven by menu input as well.
                u1.buyContent(b1);
                u1.buyContent(b3);
                u1.buyContent(m1);

                u4.buyContent(g1);
                u4.getPremium();
                u4.buyContent(m1);


                u2.getPremium();
                u2.buyContent(b1);
                u2.buyContent(g1);


                //store.showContent();
                
                g1.showReviews(); */
                        
                // to do: call a method to show all content items of a particular type, e.g. book, magazine, application.
                
                // other necessary code to test the required functionalities.        
                
                }
        
	    }
}
