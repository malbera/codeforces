package ch.codeforces.$1454;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            int size = in.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int j = 2; j <= size; j++) {
                sb.append(j).append(" ");
            }
            sb.append(1);
            System.out.println(sb.toString());
        }

    }

}
