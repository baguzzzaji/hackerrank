package algorithm;

import java.util.Scanner;

/**
 * Created by bagus on 4/13/16.
 */
public class VeryBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long total = 0L;

        for (int i = 0; i < N; i++) {
            total = total + sc.nextInt();
        }

        System.out.println(total);
    }
}
