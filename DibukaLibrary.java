/*
DibukaLibrary.java
calculates amount user has to pay for library fees based on age and number of books
25_April_2019
jedenfalls
*/

import java.util.Scanner;

public class DibukaLibrary{

   public static void main(String[] args){
   
      // declare variables
      Scanner sc = new Scanner(System.in);
      String FirstName, Surname;
      int age, numberOfBooks, totalApplicants, patron;
      double toPay, readingFee, rate=10.00, firstMonth=10.00, joiningFee=500.00, discount;
   
      System.out.println("How many users to add?");
      
      for(totalApplicants = sc.nextInt(), patron=1;patron<=totalApplicants;patron++){
      
      // input
      System.out.println("\nuser "+patron);
      
      System.out.println("First name:");
      FirstName = sc.next();
      
      System.out.println("Surname:");
      Surname = sc.next();      
      
      System.out.println("age:");
      age = sc.nextInt();
      
      
      // processing
      
      // check for errors
      while(age>100){ // check age
         System.out.println("too old, enter correct age");
         age = sc.nextInt();
      } // ends ageCheck
      
      
      System.out.println("Total Books:");
      numberOfBooks = sc.nextInt();
      
      while(numberOfBooks>10){ // check total books
         System.out.println("too many books, enter a lower number");
         numberOfBooks = sc.nextInt();
      } // ends bookCheck
      
                  
      discount = (age>65||age<=18)?0.75:1;
      
      readingFee = numberOfBooks*rate;
      
      toPay = discount*(firstMonth+joiningFee+readingFee);
      
      // output
      System.out.printf(Surname+", "+FirstName+": P%5.2f\n",toPay);
      
      } // ends for loop     
   
   } // ends method

} // ends class