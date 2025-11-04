import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        System.out.print("Enter key to search: ");
        int key = input.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Found at position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found in the array.");
        }

        input.close();
    }
}
