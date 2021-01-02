package ch.codeforces.$1462;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int operationCount = in.nextInt();
        for (int i = 0; i < operationCount; i++) {
            in.next();
            System.out.println(is2020Possible(in.next()));
        }
    }

    static String is2020Possible(String line) {
        if (line.startsWith("2020") || line.endsWith("2020")) {
            return "YES";
        } else if (line.endsWith("020") && line.startsWith("2")) {
            return "YES";
        } else if (line.startsWith("202") && line.endsWith("0")) {
            return "YES";
        } else if (line.startsWith("20") && line.endsWith("20")) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
