/*
banking transaction, with switches and shorthand
25_May_2019
jedenfalls
*/

import java.util.Scanner;

public class Bank{
   public static void main(String[] args){
   
      // declare variables
      Scanner sc = new Scanner(System.in);
      String studentid, password, transaction;
      double balance = 2000, amount;
      int account;
      
      // read input
      System.out.println("enter student id");
      studentid = sc.next();
      
      System.out.println("enter password");
      password = sc.next();
      
      // processing
      if(password.equals(studentid.substring(studentid.length()-4))){
         System.out.println("Your PIN is correct, you can proceed");
         
         System.out.println("what transaction would you like to perform; deposit, withdrawal, or fund transfers?");
         transaction = sc.next(); //is there no shorthand to combine this and the previous line?
            
         System.out.println("type of account to use: 1. current or 2. savings?");
         account = sc.nextInt();
         
         System.out.println("type amount to transact.");
         amount = sc.nextDouble();

         if((account==1)||(account==2)){
                           
            balance = ((transaction.equals("withdrawal"))||(transaction.equals("transfer")))?balance - amount:balance + amount;
         
            if((transaction.equals("withdrawal"))||(transaction.equals("transfer"))||(transaction.equals("deposit"))){ //== doesnt work
               if(balance>=0){ //what if the balance is 4 (which is legal) but then they have to do the 10% savings withdrawal fee?
                  
                  if((account==2)&&(transaction!="deposit")){
                     balance = balance - amount*0.1; //penalises for transfering/withdrawing from savings
                  }
                  
                  if(balance>0){
                     System.out.println("transaction complete");
                  }
                  else{
                     System.out.println("insufficient funds (not enough to include fee)");
                     balance = balance + amount*0.1;
                  }
               }
               else if(balance<0){
                  balance = balance - 5;
                  System.out.println("insufficient funds");
                  balance = balance + amount;
               }
            }
            else{
               System.out.println("transaction unknown. ("+transaction+")");
            } 
         }
         else{
            System.out.println("invalid account type. ("+account+")");
         }
         
         System.out.printf("balance: %5.2f%n",balance);         
      }
      else {
         System.out.println("wrong password.");
      } // ends if
   } // ends method
} // ends class
