package challenge30days;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-arrays
 */
public class day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = N-1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
    }
}
