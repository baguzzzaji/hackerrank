package challenge30days;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-conditional-statements
 */
public class day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n%2==1) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            }
            else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
