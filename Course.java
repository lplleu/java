/*
 Course.java
 16_April_2019
 jedenfalls
*/




public class Course{

   private String name, code;
   
   public Course(String c, String n) { // course is being once again created, but now as a method -which takes 2 arguments
      code = c;
      name = n;
   } // ends method Course
   
   public String getName() {
      return name;
   } // ends method getName
    
   public String getCode() {
      return code;
   } // ends method getCode

} // ends class
