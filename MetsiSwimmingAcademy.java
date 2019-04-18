/*
 MetsiSwimmingAcademy.java  
 18_April_2019
 jedenfalls
*/

import java.util.Scanner;

public class MetsiSwimmingAcademy{
   public static void main(String[] args){
   
   //initialize variables
   Scanner sc = new Scanner(System.in);
   int junior=0, intermediate=0, applications, senior=0, age, m=0, f=0, total=0, fJ=0, fI=0, fS=0, mJ=0, mI=0, mS=0;
   char gender;
   String name, category;
      
   System.out.println("How many applications?");   
   applications = sc.nextInt();
   
   System.out.println();
         
   for(int count = 0;count<applications;count++){
      System.out.println("Enter name:");
      name = sc.next();
      
      System.out.println("Enter age:");
      age = sc.nextInt();
      
      System.out.println("Enter gender:");
      gender = sc.next().charAt(0);
      
      System.out.println("Name: "+name);
      System.out.println("Age: "+age);
                          
      if(age<4&&age>15){
         total++;
         category = "Invalid";      
      }
      else if(age<8){
         junior++;
         category = "Junior";
         total++;
         
         if(gender=='M'){
            m++;
            mJ++;
         }
         else if(gender=='F'){
            f++;
            fJ++;
         }
      }
      else if(age<=10){
         intermediate++;
         category = "Intermediate";
         total++;
         
         if(gender=='M'){
            m++;
            mI++;
         }
         else if(gender=='F'){
            f++;
            fI++;
         }
      }
      else if(age<=15){
         senior++;
         category = "Senior";
         total++;
         
         if(gender=='M'){
            m++;
            mS++;
         }
         else if(gender=='F'){
            f++;
            fS++;
         }
      }   
      
      //display category
      System.out.println("Category: "+category+"\n");
   }
      //display total applications
      System.out.println("Total applications: "+total); 
      System.out.println("\tfemale: "+f);
      System.out.println("\tmale: "+m+"\n"); 
      
      //display category breakdown
      System.out.println("\tJunior applicants: "+junior);
      System.out.println("\t\tfemale: "+fJ);
      System.out.println("\t\tmale: "+mJ); 
      System.out.println("\tIntermediate applicants: "+intermediate); 
      System.out.println("\t\tfemale: "+fI);
      System.out.println("\t\tmale: "+mI); 
      System.out.println("\tSenior applicants: "+senior);  
      System.out.println("\t\tfemale: "+fS);
      System.out.println("\t\tmale: "+mS); 

   
   
   
   } // ends class MetsiSwimmingAcademy
} // ends method main
