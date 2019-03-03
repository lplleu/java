// CalculateAverage.java
// 03_March_2019
// jedenfalls

//import java.util.Scanner;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //initialize variables
    double testMark1, testMark2, averageTestMark;
    String grade;

    //set object 'marker'
    Scanner marker = new Scanner(System.in);

    //get input variables
    System.out.println("enter test 1 mark in %");
    testMark1 = marker.nextDouble();
    System.out.println("enter test 2 mark in %");
    testMark2 = marker.nextDouble();

    //calculate averageTestMark
    averageTestMark = (testMark1+testMark2)/2/100;

    //calculate grade
    if(averageTestMark>=0.75){
      grade = "Excellent";
      }
    else if(averageTestMark>=0.50){
      grade = "Good";
    }
    else if(averageTestMark>=0.25){
      grade = "Poor";
    }
    else{
      grade = "extremely poor";
    }
    //output 
    System.out.println(grade);

  }//end main method
}//end class CalculateAverage
