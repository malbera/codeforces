package ch.codeforces.$939;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long count = in.nextLong();
		int boxCount = in.nextInt();
		long [] boxDef = new long [boxCount];
        for (int i=0; i<boxCount; i++) {
            boxDef[i] = in.nextLong();
        }
        System.out.println(findGoodBox(boxDef, count));
    }

    static String findGoodBox(long [] boxes, long count) {
        int boxNumber = 0;
		long result = mod(count, boxes[0]);
		if (result == 0) {
			return String.format("%d %d", 1, count / boxes[0]);
		}
        for (int i=1; i<boxes.length; i++) {
			long boxSize = mod(count, boxes[i]);
			if (boxSize == 0) {
				return String.format("%d %d", i+1, count / boxes[i]);
			}
			if (boxSize < result) {
				result = boxSize;
				boxNumber = i;
            }
        }
        return String.format("%d %d", boxNumber + 1, count / boxes[boxNumber]);
    }
	
	static long mod(long a, long b) {
		return a % b;
	}
}
