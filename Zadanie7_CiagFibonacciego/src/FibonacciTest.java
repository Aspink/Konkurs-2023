import java.util.Scanner;
import Fibonacci.Fibonacci;

import static Fibonacci.Fibonacci.*;

public class FibonacciTest {
    public static void main(String[] args) {
        System.out.print("Podaj indeks liczby w ciągu Fibonacciego: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n >= 0 && n <= 10) {
            System.out.println("" + intFibonacci(n));
        }
    }
}