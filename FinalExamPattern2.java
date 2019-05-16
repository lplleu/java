   public class FinalExamPattern2{   
      public static void main(String[] args){
      int size = 5; int i = 0;
      int j = 0;
      
      for(i=0;i<size;i++){
         for(j=0;j<size;j++){
         if(j==i){
            System.out.print("* ");
         }else if((j==(size-1)&&i>=(size/2)){
            System.out.print("* ");
         }else if(i==(size-1)&&j>=(size/2))){
            System.out.print("* ");
         }else{
            System.out.print("0 ");
         }
        }
         System.out.println();
      }
      
     }// ends method
   }// ends class
