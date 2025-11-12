public class FactorialRecursion {

    // Factorial function
    static int factorial(int n) {
        if (n == 0){ 
            return 1;
                  }          // base case
        return n * factorial(n - 1);   // recursive call
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Factorial of " + num + " = " + factorial(num));
    }
}
