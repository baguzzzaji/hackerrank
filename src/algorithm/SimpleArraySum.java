package algorithm;

import java.util.Scanner;

/*
    Problem link: https://www.hackerrank.com/challenges/simple-array-sum
 */
public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;

        for (int i = 0; i < N; i++) {
            total = total + sc.nextInt();
        }

        System.out.println(total);
    }
}
