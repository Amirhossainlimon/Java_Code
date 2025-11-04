import java.util.Scanner;

public class MatrixEquality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        boolean equal = true;
        for (int i = 0; i < rows && equal; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    equal = false;
                    break;
                }
            }
        }
        if (equal) {
            System.out.println("The two matrices are equal.");
        } else {
            System.out.println("The two matrices are not equal.");
        }
    }
}
