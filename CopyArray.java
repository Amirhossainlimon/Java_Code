import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Elements of the second array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        input.close();
    }
}
