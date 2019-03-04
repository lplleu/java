/*
jedenfalls
04_March_2019
https://codingbat.com/prob/p116624
*/

class Main {
  public static void main(String[] args) {
  //public int diff21(int n) {  
    int n = 43;
    int x;
  
    if(n>21){
      x = (n - 21)*2;
      return x;
    }
    else{
      x = 21 - n;
      if(x<0){x = x*-1;}
      return x;
    }
    
  }

  //}
}
