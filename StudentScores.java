/*
 StudentScores.java
 02_April_2019
 jedenfalls
*/

import java.util.Scanner;

public class StudentScores{
   public static void main(String[] args){
   
   // declare arrays
   double CA[] = new double[40], examMarks[] = new double[40], finalMark[] = new double[40];
   String surnames[] = new String[40], firstNames[] = new String[40];
   char grade[] = new char[40];
   
   // declare variables
   Scanner sc = new Scanner(System.in);
   
   for(int count=0;count<40;count++){
      // read input
      int stud = count+1;
      System.out.println("\nstudent "+stud);
      System.out.println("Enter student surname");
      surnames[count] = sc.next();
      System.out.println("Enter student first name");   
      firstNames[count] = sc.next();   
      
      System.out.printf("Enter CA mark for %s %s %n",firstNames[count],surnames[count]);
      CA[count] = sc.nextDouble();
      System.out.printf("Enter exam mark for %s %s %n",firstNames[count], surnames[count]);   
      examMarks[count] = sc.nextDouble();
      
      // calculate final mark, then grade
      finalMark[count] = 0.4*CA[count] + 0.6*examMarks[count];   
      
      grade[count] = ((finalMark[count]>100)||(finalMark[count]<0))?'x':
                  finalMark[count]>=79?'A':
                  finalMark[count]>=70?'B':
                  finalMark[count]>=60?'C':
                  finalMark[count]>=50?'D':
                  finalMark[count]>=40?'E':'F';
   } // ends loop  
         
      // display result            
      for(int count2=0;count2<finalMark.length;count2++){
         if(firstNames[count2]!=null){
            System.out.printf("%n%s\t%s:\t%5.2f,\t%s",firstNames[count2],surnames[count2],finalMark[count2],grade[count2]);
         } // ends if
      } //end loop
      
   } // ends method
} //ends class
