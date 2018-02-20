package ch.codeforces.$939;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] planes = new int [5000];
        for (int i=0; i<size; i++) {
            planes[i] = in.nextInt() - 1;
        }
        System.out.println(findTriangle(planes, size));
    }

    static String findTriangle(int [] planes, int size) {
        String result = "NO";
        for (int i=0; i<size; i++) {
            if (planes[planes[planes[i]]] == i) {
                result = "YES";
                break;
            }
        }
        return result;
    }
}
