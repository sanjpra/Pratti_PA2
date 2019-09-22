package pratti_p1;

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getNumbers();
	}
	
	public static int getNumbers()
	  {
	    int fourD = 0, stringSize = 0;
	    String fourDs; //input into a string
	     
	    Scanner scnr = new Scanner(System.in);
	    while (stringSize != 4)
	    {
	      System.out.println("Enter a four digit number"); 
	      fourDs = sncr.next();
	      stringSize = fourDs.length(); //Checks length of String
	       
	      if (stringSize == 4)
	      {
	         
	        fourD = Integer.parseInt(fourDs);
	 
	      }
	    }
	    encrypt(fourD);
	    return fourD; //Return value of input
	    }
	 
	 
	  public static int encrypt(int num) {
	    int a, b, c, d;
	     
	    a = num / 1000;
	    b = num / 100 % 10;
	    c = num / 10 % 10;
	    d = num % 10;
	     
	    a = (a + 7)%10;
	    b = (b + 7)%10;
	    c = (c + 7)%10;
	    d = (d + 7)%10;
	     
	    System.out.println(c+d+a+b); //this should swap the the digits
	    return (c+d+a+b);
}
	  
	 public static int decrypt(int num) { 
		 int a, b, c, d; 
		 
		 a = num / 1000;
		 b = num / 100 % 10;
		 c = num / 10 % 10;
		 d = num % 10;
		 	
		 a = (a + 3) % 10;
		 b = (b + 3) % 10;
		 c = (c + 3) % 10;
		 d = (d + 3) % 10;
		 
		 System.out.println(c * 1000 + d * 100 + a * 10 + b); // Hopefully this will work 
		 
		 return (c * 1000 + d * 100 + a * 10 + b);
		 }
	 }
