import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[4][3];

        System.out.println("Enter the values of the Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("This is the Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("This is the Transpose of the Matrix:");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
