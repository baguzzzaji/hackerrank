package challenge30days;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps
 */
public class day7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map phoneBook = new HashMap<String, String>();
        int n = scanner.nextInt();
        String name, phoneNumber;

        // input section
        for (int i = 0; i < n; i++) {
            name = scanner.next();
            phoneNumber = scanner.next();
            phoneBook.put(name, phoneNumber);
        }

        for (int i = 0; i < n; i++) {
            name = scanner.next();
            if (phoneBook.containsKey(name)) {
                System.out.println(name + "=" + phoneBook.get(name));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
