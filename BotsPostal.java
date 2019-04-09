// BotsPostal.java
// tariffs for EMS services to different regions
// 09_March_2019
// jedenfalls

import java.util.Scanner;

public class BotsPostal{

   public static void main(String[] args){
   
   // declare variables
   double size, charge;
   int destination;
   Scanner sc = new Scanner(System.in);
   String message;
   
   System.out.println("enter the destination as an integer (1-Botswana, 2-SADC, 3-Africa, 4-World)"); 
   destination = sc.nextInt();
   
   System.out.println("enter parcel size in kg"); 
   size = sc.nextDouble();
   
   charge = 0;
   message="";
   
   if(destination==1){
      //calculate per size
      if(size<2.0){
         //calculate
         charge = 19.50;
      }
      else if(size<3.0){
         charge = 29.40;
      }
      else if(size<4.0){
         charge = 29.40;
      }
      else {
         message = "parcel too large.";
      }
   }// ends if statement
   else if(destination==2){
      //calculate per size
      if(size<2.0){
         //calculate
         charge = 184.25;
      }
      else if(size<3.0){
         charge = 217.70;
      }
      else if(size<4.0){
         charge = 254.30;
      }
      else {
         message = "parcel too large.";
      }
   }
   else if(destination==3){
      //calculate per size
      if(size<2.0){
         //calculate
         charge = 235.20;
      }
      else if(size<3.0){
         charge = 299.10;
      }
      else if(size<4.0){
         charge = 360.50;
      }
      else {
         message = "parcel too large.";
      }
   }
   else if(destination==4){
      //calculate per size
      if(size<2.0){
         //calculate
         charge = 348.70;
      }
      else if(size<3.0){
         charge = 456.25;
      }
      else if(size<4.0){
         charge = 578.50;
      }
      else {
         message = "parcel too large.";
      }
   }
   else{ 
      if(size>=4.0){
         message = "Invalid parameters, Parcel cannot be sent.";
      }
      else
         message = "unknown destination, tarrif not given for that size.";
   }
   
   if(charge!=0){
      System.out.printf("tariff due: P%5.2f",charge);  
   }    
   System.out.println("");  
   System.out.println(message);//
   
   } // ends main method
} // ends BotsPostal class
