import java.util.Scanner;

public class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int sum = 0;
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int avg = sum / N;
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                cnt += Math.abs(a[i] - avg);
            }
            System.out.println("#" + tc + " " + cnt / 2);
        }
        sc.close();
    }
}