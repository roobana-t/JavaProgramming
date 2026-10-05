void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Number of Rows: ");
    int rows = scanner.nextInt();

    System.out.println("Enter the Number of Columns: ");
    int columns = scanner.nextInt();

    for (int r = 1; r <= rows; r++) {
        for (int c = 1; c <= columns; c++) {
            System.out.print("*" + " ");
        }
        System.out.println();
    }

}
