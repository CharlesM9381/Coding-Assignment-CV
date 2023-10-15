package JAVA;

import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String s = "The quick brown fox jumps over the lazy dog";
        boolean b = checkPangram(s.toLowerCase());

        if (b) {
            System.out.println("the given string is pangram");
        } else {
            System.out.println("the given string is not pangram");
        }
    }

    private static boolean checkPangram(String s) {

        if (s.length() < 26) {
            return false;
        }
        boolean markAlphabets[] = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                markAlphabets[index] = true;
            }
        }

        for (boolean present : markAlphabets) {
            if (!present) {
                return false;
            }
        }
        return true;
    }

}
