import java.util.Scanner;

public class Findmaxmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, x = 0, y = 0;
        System.out.print("Enter number of elements: ");
        n = input.nextInt();

        int[] array = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int maxno = Integer.MIN_VALUE;
        int minno = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (array[i] > maxno) {
                maxno = array[i];
                x = i;
            }
            if (array[i] < minno) {
                minno = array[i];
                y = i;
            }
        }

        System.out.println("Max number is " + maxno + " & index number is " + x);
        System.out.println("Min number is " + minno + " & index number is " + y);

        input.close();
    }
}
