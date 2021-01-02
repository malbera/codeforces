package ch.codeforces.$1462;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sequenceSize = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sequenceSize; i++) {
            int sequenceLength = in.nextInt();
            int [] sequence = new int[sequenceLength];
            for (int j = 0; j < sequenceLength; j++) {
                int sequenceValue = in.nextInt();
                sequence[j] = sequenceValue;
            }
            int left = 0;
            int right = sequenceLength - 1;
            boolean isLeft = true;
            for (int j = 0; j < sequenceLength; j++) {
                if (isLeft) {
                    sb.append(sequence[left]);
                    left++;
                    isLeft = false;
                } else {
                    sb.append(sequence[right]);
                    right--;
                    isLeft = true;
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
