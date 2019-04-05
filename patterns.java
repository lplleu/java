//some patterns
//05_April_19
//jedenfalls

class Main {
  public static void main(String[] args) {
    
    for(int i = 0;i<4;i++){  
      for(int j = 0;j<4;j++){
        if(i==j){
          System.out.print(1);
        } //ends if
        else
          System.out.print(0);
      } //ends inner loop
        System.out.print('\n'); 
    }    //ends outer loop
    System.out.print('\n'); 

    for(int k = 0;k<4;k++){  
      for(int l = 0;l<4;l++){
        if(k==l||l==0||l==3){
          System.out.print(1);
        }
        else
          System.out.print(0);
      }
        System.out.print('\n'); 
    }
    System.out.print('\n'); 

    for(int m = 0;m<4;m++){  
      for(int n = 0;n<4;n++){
        if(m+n==3||m==0||n==3){
          System.out.print(1);
        }
        else
          System.out.print(0);
      }
        System.out.print('\n'); 
    }

  } // ends method main
}//ends clas
