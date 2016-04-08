package algorithm;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase
 */
public class StairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            // For blank space
            for (int j = N - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
