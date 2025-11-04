import java.util.Scanner;

public class SecondMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        int secondMin = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != min) {
                if (secondMin == min || arr[i] < secondMin) {
                    secondMin = arr[i];
                }
            }
        }

        System.out.println("Second minimum number is: " + secondMin);
    }
}
