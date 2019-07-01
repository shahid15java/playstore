package playStore;
import java.io.*;

public class InsufficientFunds extends Exception {

	private double fund;
	   
	   public InsufficientFunds(double fund) {
	      this.fund = fund;
	   }
	   
	   public double getFund() {
	      return fund;
	   }
	
}
