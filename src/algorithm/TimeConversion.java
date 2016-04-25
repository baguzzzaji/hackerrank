package algorithm;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String newTime = time.substring(0, 8);
        String amOrPm = time.substring(8, 10);

        int timeToConvert = Integer.parseInt(time.substring(0, 2));

        if (amOrPm.equals("AM") && timeToConvert == 12) {
            newTime = "00" + time.substring(2, 8);
        }


        if (amOrPm.equals("PM") && timeToConvert != 12) {
            timeToConvert = timeToConvert + 12;
            newTime = timeToConvert + time.substring(2, 8);
        }

        System.out.println(newTime);
    }
}
