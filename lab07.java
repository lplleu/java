/*
Main.java
create custom message based on calculated marks and gender
06_March_2019
jedenfalls
*/

import java.util.Scanner;

public class Main{

   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String outcome, message, title;
   double labMarks, labTestMark, testMarks, examMark, finalMark;     
   
   System.out.println("type your gender by indicating M for male, and F for female");
   
   char gender = sc.next().charAt(0);
   if(gender=='M')
      title = "Sir";
   else
      title="Mam";
            
   System.out.println("type your lab marks as a percentage");
   labMarks = sc.nextDouble();
   
   System.out.println("type your lab test marks as a percentage");
   labTestMark =sc.nextDouble();
   
   System.out.println("type your test marks as a percentage");
   testMarks = sc.nextDouble();
   
   System.out.println("type your exam marks as a percentage");
   examMark = sc.nextDouble();
   
   finalMark = 0.15*labMarks + 0.15*labTestMark + 0.20*testMarks + 0.509*examMark;
   
   if(finalMark/100>=0.50)
      outcome = "passed";
   else
      outcome = "failed";
      
   message = "You have " + outcome + " " + title;
   
   System.out.println(message);
   }
}
