// SMAS.java
// 04_April_2019
// jedenfalls

import java.util.Scanner;

public class SMAS{

   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      
      int totalStudents, num, numberPassed = 0, numberFailed = 0;
      double test1, test2, averageMark;
      String message = " ";
      char grade;
   
      //totalStudents = sc.nextInt();
      System.out.println("How many students");
      
      for(totalStudents = sc.nextInt(),num=1;num<=totalStudents;num++){
      
      System.out.println("\nStudent number "+num);      
      System.out.println("Enter Test_1 mark as percentage");
      
      test1 = sc.nextDouble();
      System.out.println("Enter Test_2 mark as percentage"); 
      
      test2 = sc.nextDouble();
      
      averageMark = (test1+test2)/2;     

      
      if(averageMark>=80){
         grade = 'A';
         message = "Excellent";
         numberPassed++;
         
         System.out.println(averageMark);      
         System.out.println(message);
         
      }//ends test for over 80
      else if(averageMark<50){
         message = "Failed";
         numberFailed++;
         
         System.out.println(averageMark);      
         System.out.println(message);
      
      }//ends test for under 50
      else{
         message = "Pass";
         System.out.println(averageMark);      
         System.out.println(message);
         
         //numberPassed++;
      }//ends else
      

      }//ends for loop
      
      System.out.println("\nTotal As: "+numberPassed+"");      
      System.out.println("Total failures: "+numberFailed+"\n");
      
   }//ends method main
}//ends class SMAS
