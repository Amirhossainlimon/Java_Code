import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows for Matrix A: ");
        int rowA = input.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colA = input.nextInt();

        System.out.print("Enter number of rows for Matrix B: ");
        int rowB = input.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colB = input.nextInt();

        if (colA != rowB) {
            System.out.println("Error!!");
            input.close();
            return;
        }

        int[][] A = new int[rowA][colA];
        int[][] B = new int[rowB][colB];
        int[][] C = new int[rowA][colB];

        System.out.println("\nEnter elements of Matrix A:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("\nEnter elements of Matrix B:");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colB; j++) {
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < rowA; i++)
            for (int j = 0; j < colB; j++)
                for (int k = 0; k < colA; k++)
                    C[i][j] += A[i][k] * B[k][j];

        System.out.println("\nResultant Matrix (A x B):");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
