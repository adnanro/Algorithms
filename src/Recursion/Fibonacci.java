package Recursion;
public class Fibonacci {

        public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive
    }

    public static void main(String[] args) {
        // example number 13
        int n = 13;
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
