package ch.codeforces.$1454;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            int arraySize = in.nextInt();
            int[] array = readArray(in, arraySize);
            int [] check = new int[arraySize + 1];
            for (int j = 0; j < array.length; j++) {
                check[array[j]]++;
            }
            int result = -1;
            for (int j = 0; j < check.length; j++) {
                if (check[j] == 1) {
                    result = j;
                    break;
                }
            }
            if (result == -1) {
                System.out.println(-1);
            } else {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == result) {
                        System.out.println(j + 1);
                        break;
                    }
                }
            }
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
