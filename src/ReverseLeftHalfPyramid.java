import java.util.Scanner;

public class ReverseLeftHalfPyramid {
    public  static  void  main(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number of rows: ");
        int rows=scanner.nextInt();
        System.out.print("Enter the Number of Columns: ");
        int columns=scanner.nextInt();
        for(int i = 1;i <= rows;i++){
            for(int j = i; j <= columns;j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
