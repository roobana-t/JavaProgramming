import java.util.Scanner;

public class ReverseLeftHalfPyramid1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Rows: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
             System.out.print("*" + " ");
        }
        System.out.println();
    }
}
