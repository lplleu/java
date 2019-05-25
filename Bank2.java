/*
banking transaction; with JOptionPane
24_May_2019
jedenfalls
*/

import javax.swing.JOptionPane;

public class Bank2{
   public static void main(String[] args){
   
      // declare variables
      Scanner sc = new Scanner(System.in);
      String studentid, password, transaction;
      double balance = 2000, amount;
      int account;
      
      // read input
      studentid = JOptionPane.showInputDialog("enter student id");
      
      password =  JOptionPane.showInputDialog("enter password");
      
      // processing
      if(password.equals(studentid.substring(studentid.length()-4))){
         //JOptionPane.showMessageDialog("Your PIN is correct, you can proceed");
         
         //JOptionPane.showMessageDialog(null, "what transaction would you like to perform; deposit, withdrawal, or fund transfers?", "step 3", JOptionPane.INFORMATION_MESSAGE);
         /* ERROR_MESSAGE, PLAIN_MESSAGE, QUESTION_MESSAGE, WARNING_MESSAGE */

         transaction = JOptionPane.showInputDialog("what transaction would you like to perform; deposit, withdrawal, or fund transfers?");
            
         account =   Integer.parseInt(JOptionPane.showInputDialog("type of account to use: 1. current or 2. savings?"));
         
         amount = Double.parseDouble(JOptionPane.showInputDialog("type amount to transact."));

         if((account==1)||(account==2)){
                           
            balance = ((transaction.equals("withdrawal"))||(transaction.equals("transfer")))?balance - amount:balance + amount;
         
            if((transaction.equals("withdrawal"))||(transaction.equals("transfer"))||(transaction.equals("deposit"))){
               if(balance>=0){ //what if the balance is 4 (which is legal) but then they have to do the 10% savings withdrawal fee?
                  
                  if((account==2)&&(transaction!="deposit")){
                     balance = balance - amount*0.1; //penalises for transfering/withdrawing from savings
                  }
                  
                  if(balance>0){
                     JOptionPane.showMessageDialog(null, "transaction complete", "feedback", JOptionPane.INFORMATION_MESSAGE);
                  }
                  else{
                     JOptionPane.showMessageDialog(null, "insufficient funds (not enough to include fee)", "feedback", JOptionPane.INFORMATION_MESSAGE);
                     balance = balance + amount*0.1;
                  }
               }
               else if(balance<0){
                  balance = balance - 5;
                  JOptionPane.showMessageDialog(null, "insufficient funds", "feedback", JOptionPane.INFORMATION_MESSAGE);
                  balance = balance + amount;
               }
            }
            else{
               JOptionPane.showMessageDialog(null, "transaction unknown. ("+transaction+")", "title", JOptionPane.INFORMATION_MESSAGE);
               System.out.println();
            } 
         }
         else{
            JOptionPane.showMessageDialog(null, "invalid account type. ("+account+")", "feedback", JOptionPane.INFORMATION_MESSAGE);
            System.out.println();
         }
         
         //System.out.printf("balance: %5.2f%n",balance); 
         JOptionPane.showMessageDialog(null, balance, "feedback", JOptionPane.INFORMATION_MESSAGE);        
      }
      else {
         JOptionPane.showMessageDialog(null, "wrong password.", "feedback", JOptionPane.INFORMATION_MESSAGE);
      } // ends if
   } // ends method
} // ends class
