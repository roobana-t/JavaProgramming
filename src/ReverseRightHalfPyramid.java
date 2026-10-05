import java.util.Scanner;

public class ReverseRightHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int rows = scanner.nextInt();
        for (int i = rows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
