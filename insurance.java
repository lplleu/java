// insurance.java
// Leepile
// 21_March_2019

/*
An insurance company, Dikoloi Insurance, provides insurance cover for cars to its customers based on the cost of buying the car as well as the age of the buyer, using maintenance cover and a risk factor.
Maintenance cover is calculated by dividing the total cost of the car by the total number of months for repayment. The risk factor of the buyer is the age of the buyer in months, divided by the total cost of the car, multiplied by 100. If the buyer is under 35 years, or older than 60, the risk factor is then multiplied by 2. This is because young drivers and older drivers have been found to be of higher risks then drivers between the ages of 35 and 60. The maintenance cover is then added to the risk factor to find the total monthly insurance cover.
You have been tasked with developing a Program that reads in the cost of the car, number of repayments months and the age of the buyer. The program should then output the monthly insurance for the buyer. 
*/

// import Scanner
import java.util.Scanner;

public class insurance{

   public static void main(String[] args){
      
      // declare scanner object
      Scanner con = new Scanner(System.in);
         
      // declare variables
      double carCost, maintenanceCover, riskFactor, totalCover;
      int numberOfRepaymentMonths, buyerAge;
   
      // get input
      System.out.println("car cost?");
      carCost = con.nextDouble();

      System.out.println("number of repayment months?");
      numberOfRepaymentMonths = con.nextInt();

      System.out.println("buyer age?");
      buyerAge = con.nextInt();
      
      // calculations
      maintenanceCover = carCost/numberOfRepaymentMonths;
      riskFactor = buyerAge/carCost*100;
      
      if(buyerAge<35||buyerAge>60)
         riskFactor = riskFactor * 2;
         
      totalCover=riskFactor+maintenanceCover;
      
      // display monthly cover
      System.out.printf("%.2f",totalCover);

   } // end main method
} // end insurance class
