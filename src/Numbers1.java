public class Numbers1 {
    public static  void main(String[] args){
        int rows=4;
        for(int k = rows; k > 0; k--){
            for(int i = 1; i <= k ; i++){
                System.out.print(i + " ");
            }
            for(int j = 1;j <= rows - k;j++){
                System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
