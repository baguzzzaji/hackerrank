package algorithm;

import java.util.Scanner;


public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double positive = 0;
        double negative = 0;
        double zero = 0;
        double[] num = new double[N];

        for (int i = 0; i < N; i++) {
            num[i] = sc.nextDouble();
        }

        // Looking for positive, negative, and zero
        for (int i = 0; i < N; i++) {
            if (num[i] > 0) {
                positive++;
            } else if (num[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        // Print the fraction
        System.out.println(positive / N);
        System.out.println(negative / N);
        System.out.println(zero / N);
    }
}
