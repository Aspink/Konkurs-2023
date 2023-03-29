import java.util.Scanner;
import java.math.BigInteger;

import static Fibonacci.Fibonacci.*;

public class FibonacciTest {
    public static void main(String[] args) {
        System.out.print("Podaj indeks liczby w ciągu Fibonacciego: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n >= 0 && n <= 10) {
            System.out.println(intFibonacci(n));
        }
        if(n > 10 && n <= 100) {
            System.out.println(midFibonacci(n));
        }
    }
}