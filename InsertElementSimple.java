import java.util.Scanner;

public class InsertElementSimple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = input.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        System.out.print("Enter element to insert: ");
        int element = input.nextInt();
        System.out.print("Enter position (1 to " + (n + 1) + "): ");
        int pos = input.nextInt();

        for (int i = n; i >= pos; i--){
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = element;

        for (int i = 0; i <= n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
