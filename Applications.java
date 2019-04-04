// Applications.java
// 28_March_2019
// jedenfalls

import java.util.Scanner;
public class Applications{

   public static void main(String[] args){
   
      Scanner con = new Scanner(System.in);
      char gradeMaths, gradeEnglish, gradeComputer;
      int pointsMaths, pointsEnglish, pointsComputer, points;
      
      System.out.println("Enter Maths grade"); 
      gradeMaths = con.next().charAt(0);      
      
      System.out.println("Enter English grade"); 
      gradeEnglish = con.next().charAt(0);      
      
      System.out.println("Enter Computer grade"); 
      gradeComputer = con.next().charAt(0);      

      //calculates points for Mathematics 
      switch(gradeMaths){
      case 'A':
         pointsMaths = 8;
         break;
      case 'B':
         pointsMaths = 7;
         break;
      case 'C':
         pointsMaths = 6;
         break;
      case 'D':
         pointsMaths = 5;
         break;
      default:
         pointsMaths = 0;      
      }
   
      //calculates points for English 
      switch(gradeEnglish){
      case 'A':
         pointsEnglish = 8;
         break;
      case 'B':
         pointsEnglish = 7;
         break;
      case 'C':
         pointsEnglish = 6;
         break;
      case 'D':
         pointsEnglish = 5;
         break;
      default:
         pointsEnglish = 0;      
      }
      
      //calculates points for Computer Studies   
      switch(gradeComputer){
      case 'A':
         pointsComputer = 8;
         break;
      case 'B':
         pointsComputer = 7;
         break;
      case 'C':
         pointsComputer = 6;
         break;
      case 'D':
         pointsComputer = 5;
         break;
      default:
         pointsComputer = 0;      
      }   
      
      //calculates total points 
      points = pointsMaths + pointsEnglish + pointsComputer;
      
      // displays total points
      System.out.println("total points is "+points);  
         
      if((gradeMaths=='A')&&(gradeEnglish=='A')&&(gradeComputer=='A')){
         System.out.println("Definitely Qualify!!");  
         System.out.println("The deadline for application is March 31st 2018");         
      }
      else if((gradeMaths=='C')&&(gradeEnglish=='C')&&(gradeComputer=='C')){
         System.out.println("Need to work hard");      
         System.out.println("The deadline for application is March 31st 2018");  
      }
      else if(points==18){
         System.out.println("You meet the minimum!");
         System.out.println("The deadline for application is March 31st 2018");  
      }
      else if(points>18){
         System.out.println("You qualify");
         System.out.println("The deadline for application is March 31st 2018");  
      }
      else if(points<18){
         System.out.println("You do not qualify");
      }
      else {//no indications on the instructions on what to write for points == 18
      }
   
   }//ends method main
}//ends class Applications
