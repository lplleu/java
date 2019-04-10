// BotsPostal2.java
// tariffs for EMS services to different regions
// 10_March_2019
// jedenfalls

import java.util.Scanner;

public class BotsPostal2{

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
   
   switch(destination){
   case(1):
         charge = size<2.0? 19.50:( size<3.0? 29.40:(size<4.0? 36.70:0));
         message = size>=4.0? "parcel too large.":"";
         break;
   case(2):
         charge = size<2.0? 184.25:( size<3.0? 217.70:(size<4.0? 254.30:0));
         message = size>=4.0? "parcel too large.":"";
         break;
   case(3):
         charge = size<2.0? 235.20:( size<3.0? 299.10:(size<4.0? 360.50:0));
         message = size>=4.0? "parcel too large.":"";
         break;
   case(4):
         charge = size<2.0? 348.70:( size<3.0? 456.25:(size<4.0? 578.50:0));
         message = size>=4.0? "parcel too large.":"";
         break;
   default:
         message = size>=4.0?"Invalid parameters, Parcel cannot be sent.":"unknown destination, tarrif not given for that size.";
   }
   
   if(charge !=0){
      System.out.printf("tariff due: P%5.2f",charge);  
   }
   System.out.println();  
   System.out.println(message);//
   
   } // ends main method
} // ends BotsPostal class
