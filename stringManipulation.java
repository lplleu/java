// instruction at https://codingbat.com/prob/p161642
// 24_March_2019
// jedenfalls

public class stringManipulation{
  public static void main(String[] args){
      backAround("mook");
    )
  }

  public String backAround(String str) {
    return str.charAt(str.length() - 1)+str+str.charAt(str.length() - 1);
  }

}
