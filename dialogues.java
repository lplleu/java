/*
* jedenfalls
* 25-February-2019
* read surname and firstname, then output the result in a dialogue box
*/

import javax.swing.JOptionPane;

public class dialogues{
  public static void main(String[] args) {
    String fName, sName;
    
    // Read prices from user as a String       
    sName = JOptionPane.showInputDialog("Enter your surname");
    fName = JOptionPane.showInputDialog("Enter your first name");
    
    // Display result          
    JOptionPane.showMessageDialog(null, sName + ", " + fName , "Output" ,  JOptionPane.PLAIN_MESSAGE);
    
    System.exit(0);
      
  }
}
