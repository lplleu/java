// restaurant.java
// 22_March_2019
// jedenfalls

import java.util.Scanner;

public class Cafeteria3{

   public static void main(String[] args){
      //declare and initialize variables
      int mealType;
      double amountDue;
      double[] prices ={20.00,50.00,40.00};
      
      Scanner con = new Scanner(System.in);
      
      System.out.println("How many meals? indicate 0 up to 3.");
      
      mealType = con.nextInt();
      
      if(mealType==3)
         amountDue = 0.7*(prices[0]+prices[1]+prices[2]);
      else if (mealType < 0 || mealType >= prices.length)
         amountDue = 0;
      else
         amountDue = prices[mealType];
         
      //what about non-int entries??
         
      //display output   
      System.out.printf("P%.2f due.",amountDue);   
   
   }//ends main method
}//ends class Cafeteria
