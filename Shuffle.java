package JAVA;

import java.util.Random;

public class Shuffle {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        suffleArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void suffleArray(int arr[]) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = r.nextInt(i + 1);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}
