package challenge30days;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-recursion
 */
public class day8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print(factorial(n));
    }

    private static int factorial(int x) {
        if (x == 0 || x == 1)
            return 1;
        else
            return x * factorial(x - 1);
    }
}
