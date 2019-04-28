/* MetsingSwimmingClass.java
   calculates category and fees based on experience and number of galas
   28_April_19
   jedenfalls  */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner = sc= new Scanner(System.in);
    string name;
    int experience, age, galas;

    System.out.println("name?");
    name=sc.next();               // reads name
    System.out.println("age?");
    age = sc.nextInt();           // reads age
    System.out.println("experience?");
    experience = sc.nextInt();    // reads experience
    System.out.println("gala?");
    galas = sc.nextInt();         // galas

    System.out.println(
      ((age<3)||(age>15))?"Invalid Age":
      (((experience>4)&&(galas>3))?
      name+": Gold: P"+1500:
      (((experience>=2)&&(galas>=1))?
      name+": Silver: P"+100:
      name+": LTS: P"+500))
    );
  } // ends method main
} // ends class MetsingSwimmingClass
