package challenge30days;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-data-types
 */
public class day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int ii = scan.nextInt();
        double dd = scan.nextDouble();scan.nextLine();
        String words = scan.nextLine();

        System.out.println(ii+i);
        System.out.println(dd+d);
        System.out.println(s + words);

        scan.close();
    }


}
