package Recursion;
public class Factorial {

    
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // Recursive
    }

    public static void main(String[] args) {
        // example number 7
        int n = 7; 
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}