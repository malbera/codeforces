package ch.codeforces.$1454;

import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numbers = in.nextInt();

        while (numbers --> 0){
            long n = in.nextLong();
            long ans = 1, dis = n;
            for (long i = 2; i <= Math.sqrt(n); i++) {
                long nn = n, now = 0;
                while (nn % i == 0) {
                    now++;
                    nn/=i;
                }
                if (ans < now) {
                    ans = now;
                    dis = i;
                }
            }
            System.out.println(ans);
            for(int i = 1; i < ans; i++) {
                System.out.print(dis + " ");
                n/=dis;
            }
            System.out.println(n);
        }
    }

}
