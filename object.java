// object.java
// 07_April_2019
// jedenfalls

public class object{
  public static void main(String[] args){
    System.out.println("helloWorld");
  }

}
    
    Robot r1 = new Robot("Jerry","blue",49);

    r1.introduceSelf();

class Robot{
    String name, color;
    int weight;
  
    Robot(String n, String c, int w){
      this.name = n;
      this.color= c;
      this.weight=w;  
    }
  
void introduceSelf(){
  System.out.println(
    "My name is " + this.name
                    );
}
