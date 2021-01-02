package ch.codeforces.$1462;

import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberCount = in.nextInt();
        for (int i = 0; i < numberCount; i++) {
            int number = in.nextInt();
            int [] possibleValues = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println(findNumberSum(number, possibleValues));
        }
    }

    static String findNumberSum(int number,
                                int [] possibleValues) {
        if (number > 45) {
            return "-1";
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int index = possibleValues.length - 1;
        while (sum != number) {
            if (number >= sum + possibleValues[index]) {
                sum += possibleValues[index];
                sb.append(possibleValues[index]);
            }
            index--;
        }
        return sb.reverse().toString();
    }
}
