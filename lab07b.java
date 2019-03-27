// and ammendment to lab 07 -> wasnt accepting strings for conditions
// 27_March_19
// jedenfalls

import java.util.Scanner;
public class Main{

   public static void main(String[] args){
   
      String mook;
      Scanner con = new Scanner(System.in);
      
      
      System.out.print("enter mook");
      mook = con.next();
      
      if(mook.equals("genius")){
         System.out.print("indeed");
      }
      else{
         System.out.print("not so.");
      }
   
   }
}
