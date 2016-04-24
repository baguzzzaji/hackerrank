package algorithm;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/extra-long-factorials
 */
public class ExtraLongFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(factorial(N));
    }

    private static BigInteger factorial(int N) {
        if (N == 0) {
            return BigInteger.ONE;
        } else if (N == 1) {
            return BigInteger.valueOf(N);
        } else {
            return BigInteger.valueOf(N).multiply(factorial(N - 1));
        }
    }
}
