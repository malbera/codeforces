package ch.codeforces.$939;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int count = in.nextInt(), boxCount = in.nextInt();
		int [] boxes = new int[boxCount];
		for(int i=0; i<boxCount; i++) {
			boxes[i] = in.nextInt();
		}
		System.out.println(findProperBox(boxes, count));
	}

	static String findProperBox(int[] boxes, int count) {
		int result = count;
		int resultBox = 0;
		for (int i=0; i<boxes.length; i++) {
			int boxCapacity = boxes[i];
			int currentBoxCount = count % boxCapacity;
			if (currentBoxCount < result) {
				result = currentBoxCount;
				resultBox = i+1;
			}
		}
		return String.format("%d %d", resultBox, count / boxes[resultBox-1]);
	}
}
