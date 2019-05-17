/*
banking transaction
17_May_2019
jedenfalls
*/

import java.util.Scanner;

public class Bank{
   public static void main(String[] args){
   
      // declare variables
      Scanner sc = new Scanner(System.in);
      String studentid, password, transaction;
      double balance = 2000;
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
            
         System.out.println("type of account to use: 1. current or 2. savings?");
         account = sc.nextInt();
         
      }
      else {
         System.out.println("wrong password, the correct password is "+studentid.substring(studentid.length()-4));
      } // ends if
   } // ends method
} // ends class
