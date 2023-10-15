package JAVA;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter roman number");
        String s = sc.next();
        int result = romanToInteger(s);
        System.out.println(result);
    }

    public static int romanToInteger(String s) {
        int result = 0;
        HashMap<Character, Integer> rvalues = new HashMap<>();
        rvalues.put('I', 1);
        rvalues.put('V', 5);
        rvalues.put('X', 10);
        rvalues.put('L', 50);
        rvalues.put('C', 100);
        rvalues.put('D', 500);
        rvalues.put('M', 1000);

        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curentValue = rvalues.get(s.charAt(i));
            if (curentValue < prev) {
                result -= curentValue;
            } else {
                result += curentValue;
            }
            prev = curentValue;
        }
        return result;
    }
}
