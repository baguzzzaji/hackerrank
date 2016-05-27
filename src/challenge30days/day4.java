package challenge30days;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-class-vs-instance
 */
public class day4 {

    private int age;

    public day4(int initialAge) {
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        String ans;
        if (age < 13) {
            ans = "You are young.";
        } else if (age >= 13 && age < 18) {
            ans = "You are a teenager.";
        } else {
            ans = "You are old.";
        }

        System.out.println(ans);
    }

    public void yearPasses() {
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            day4 p = new day4(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
