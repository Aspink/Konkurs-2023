package Fibonacci;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static Map<Integer, BigInteger> results = new HashMap<>();
    public static int intFibonacci(int n) {
        int current = 0, previous = 1, temp;
        for(int i = 0; i < n; i++) {
            temp = current;
            current = current + previous;
            previous = temp;
        }
        return current;
    }
    public static BigInteger midFibonacci(int n) {
        if(n == 0) {
            return BigInteger.ZERO;
        }
        if(n == 1) {
            return BigInteger.ONE;
        }
        if(results.containsKey(n)) {
            return results.get(n);
        }
        BigInteger result = midFibonacci(n-1).add(midFibonacci(n-2));
        results.put(n, result);
        return result;
    }
    public static BigInteger binet (Integer n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        double psi = (1 - sqrt5) / 2;
        BigInteger phiPow = BigDecimal.valueOf(phi).pow(n).toBigInteger();
        BigInteger psiPow = BigDecimal.valueOf(psi).pow(n).toBigInteger();
        BigInteger numerator = phiPow.subtract(psiPow);
        BigInteger denominator = BigInteger.valueOf((long) sqrt5);
        BigInteger result = numerator.divide(denominator);
        return result;
    }
}
