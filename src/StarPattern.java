import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        int total = 5;
        for(int k = 1; k <= total ; k++){
            for(int j = 1; j <= total - k; j++){
                System.out.print(" "+ " ");
            }
            for(int i = 1; i <= k; i++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}

// k = 3
// i = 3
// j = 3