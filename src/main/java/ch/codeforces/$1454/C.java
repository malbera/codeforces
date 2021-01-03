package ch.codeforces.$1454;

import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            int arraySize = in.nextInt();
            int[] array = readArray(in, arraySize);
            int[] count = new int[arraySize + 1];
            boolean [] check = new boolean[arraySize + 1];
            int prev = array[0];
            int result = arraySize;
            for (int j = 1; j < arraySize; j++) {
                check[prev] = true;
                if (array[j] != prev) {
                    count[prev]++;
                }
                prev = array[j];
            }
            check[array[arraySize - 1]] = true;
            for (int j = 0; j <= arraySize; j++) {
                if (check[j]) {
                    result = Math.min(result, count[j] + (j == array[0] ? 0 : 1));
                }
            }
            System.out.println(result);
        }
    }

    static int [] readArray(Scanner in,
                            int arraySize) {
        int [] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = in.nextInt();
        }
        return array;
    }

}

