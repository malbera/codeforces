package ch.codeforces.$939;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] planes = new int [size + 1];
        for (int i=0; i<size; i++) {
            planes[i] = in.nextInt();
        }
        System.out.println(findTriangle(planes));
    }

    static String findTriangle(int [] planes) {
        String result = "NO";
        for (int i=0; i<planes.length; i++) {
            if (planes[planes[planes[i]]] == i) {
                result = "YES";
                break;
            }
        }
        return result;
    }
}
