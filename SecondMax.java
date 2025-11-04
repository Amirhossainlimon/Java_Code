

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] != max) {
                if (secondMax == max || arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }

        System.out.println("Second maximum number is: " + secondMax);
      
    }
}
