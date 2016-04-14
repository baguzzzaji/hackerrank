package algorithm;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/angry-professor
 */
public class AngryProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int student = 0;
            int N = sc.nextInt();
            int K = sc.nextInt();

            for (int j = 0; j < N; j++) {
                if (sc.nextInt() <= 0) {
                    student++;
                }
            }

            if (student < K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
