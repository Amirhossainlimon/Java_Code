public class EvenSumRecursion {

    // Function to calculate sum of even numbers up to n
    static int sumEven(int n) {
        if (n <= 0){
         return 0;
                    }            // base case
        if (n % 2 == 0){                 // if n is even
            return n + sumEven(n - 2);  
         }                           // include n and go 2 steps back
        else {                            // if n is odd
            return sumEven(n - 1);   
            }    // skip n, check n-1
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println("Sum of even numbers up to " + num + " = " + sumEven(num));
    }
}
