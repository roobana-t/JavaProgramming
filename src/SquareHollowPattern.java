import java.util.Scanner;

public class SquareHollowPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the Number of Columns: ");
        int columns = scanner.nextInt();

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= columns; c++) {
                if (r == 1 || c == 1 || r == rows || c == columns) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

    }
}

// rows = 5
// columns = 5
// r = 6
// c = 6

