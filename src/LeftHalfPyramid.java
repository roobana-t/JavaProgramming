import java.util.Scanner;

public class LeftHalfPyramid {
    public static void main(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int rows=scanner.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows - i; j++){
                System.out.print(" " + " ");
            }
            for(int k = 1; k <= i;k++ ){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
