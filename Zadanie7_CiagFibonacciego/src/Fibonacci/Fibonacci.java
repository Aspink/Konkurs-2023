package Fibonacci;
public class Fibonacci {
    public static int intFibonacci(int n) {
        int current = 0, previous = 1, temp;
        for(int i = 0; i < n; i++) {
            temp = current;
            current = current + previous;
            previous = temp;
        }
        return current;
    }
}
