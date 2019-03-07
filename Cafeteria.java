/*
Cafeteria.java
jedenfalls
7_March_2019
*/

import java.util.Scanner;

public class Cafeteria{

   public static void main(String[] args){
   
      //set Scanner variable
      Scanner con = new Scanner(System.in);
      
      //declare and initialize variables
      double breakfast = 20.00, lunch = 50.00, supper = 40.00, finalPrice=0.00;
      
      //declare count
      int count;
      
      System.out.println("How many meals?");
      count = con.nextInt();
      
      //calculate finalPrice based on count
      if(count== 3)
         finalPrice = (breakfast + lunch + supper) * 0.7;
      else if(count == 0)
         finalPrice = breakfast;
      else if(count == 1)
         finalPrice = lunch;
      else if(count ==2)
         finalPrice = supper;
      
      //display output
      System.out.println("amount due: P"+finalPrice);  
   
   }//ends main method

}//ends class Cafeteria
