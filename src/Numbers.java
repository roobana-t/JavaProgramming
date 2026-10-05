import java.util.Scanner;

public class Numbers {
    public static  void main(String[] args){
        int rows=4;
        int x=1;
      for(int k = 1; k <= rows; k++){
          for(int i = 1; i <= k ; i++){
              System.out.print(x++ + " ");
          }
          for(int j = 1;j <= rows - k;j++){
              System.out.print(" "+" ");
          }
          System.out.println();
      }
    }
}
