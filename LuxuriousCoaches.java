// LuxuriousCoaches.java
// 11_April_2019
// jedenfalls

import java.util.Scanner;

public class LuxuriousCoaches{
   public static void main(String[] args){
   
      int ticketType, numberOfTickets;
      String destination;
      double tripCost, amountDue;   
      Scanner sc = new Scanner(System.in);  
   
      System.out.println("Enter ticket type: 1 for single, 2 for return.");
      ticketType = sc.nextInt();
         
      System.out.println("Enter number of tickets."); 
      numberOfTickets = sc.nextInt();    
      
      System.out.println("Enter destination: Mahalapye, Palapye, Serule, or Francistown."); 
      destination = sc.next();        
            
      switch(destination){
      case("Mahalapye"):
         tripCost=55.00;
         break;
      case("Palapye"):
         tripCost=70.00;
         break;
      case("Serule"):
         tripCost=90.00;
         break;
      case("Francistown"):
         tripCost=115.00;
         break;
      default:
         System.out.println("You entered an invalid train stop. Valid ones are 1, 2, 3 and 4."); 
         tripCost=0;   
      }
   
   // checks whether correct destination is set
   if(tripCost>0&&(ticketType==1||ticketType==2)){
      amountDue = ticketType==2?numberOfTickets * (1.5 * tripCost):ticketType==1?numberOfTickets * tripCost:0;
      System.out.printf("Amount Due: %4.2f",amountDue);   
      } // else loop to re-enter??
      
   } // ends method
}// ends class
   
