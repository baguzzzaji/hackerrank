package challenge30days;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-review-loop
 */
public class day5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();scanner.nextLine();
        String[] s = new String[N];

        for (int i = 0; i < N; i++) {
            s[i] = scanner.nextLine();
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (j%2==0)
                    System.out.print(s[i].toCharArray()[j]);
            }

            System.out.print(" ");
            for (int j = 1; j < s[i].length(); j++) {
                if (j%2==1)
                    System.out.print(s[i].toCharArray()[j]);
            }
            System.out.println();
        }


    }
}
