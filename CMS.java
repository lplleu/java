/*
   CourseManagementSystem.java
   16_April_2019
   jedenfalls
*/

import javax.swing.JOptionPane;

public class CMS{

   public static void main(String[] args){
      
      String courseCode, courseTitle;
      int total;
         ///courseCode = JOptionPane.showInputDialog("enter course code");      
      total = Integer.parseInt(JOptionPane.showInputDialog("how many courses?"));
        
      for(int count=1;count<=total;count++){

         courseCode = JOptionPane.showInputDialog("enter course code");
         
         courseTitle = JOptionPane.showInputDialog("enter course title");
         
         Course c1 = new Course(courseCode,courseTitle);
         
         JOptionPane.showMessageDialog( null, c1.getCode() + ": " + c1.getName() + " has been created.");
         
      }      
         
         JOptionPane.showMessageDialog(null,total +" courses created.","Window title",JOptionPane.INFORMATION_MESSAGE);
         
   } // ends method

} // ends class CMS


/*
   pending
      -accept whole sentence (next())
      -https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
*/
