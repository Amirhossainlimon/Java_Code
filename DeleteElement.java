import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        System.out.print("Enter position to delete (1 to " + n + "): ");
        int pos = input.nextInt();

        if (pos < 1 || pos > n) {
            System.out.println("Invalid position!");
            input.close();
            return;
        }

        for (int i = pos - 1; i < n - 1; i++)
            arr[i] = arr[i + 1];

        System.out.println("Array after deletion:");
        for (int i = 0; i < n - 1; i++)
            System.out.print(arr[i] + " ");

        input.close();
    }
}
