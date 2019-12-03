import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int max = -1;
            int N = sc.nextInt();
            int M = sc.nextInt();
            int an[] = new int[N];
            int bm[] = new int[M];
            for (int i = 0; i < N; i++) {
                an[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                bm[i] = sc.nextInt();
            }
            for (int j = 0; j < Math.abs(N - M) + 1; j++) {
                int sum = 0;
                for (int i = 0; i < Math.min(N, M); i++) {
                    if (N < M)
                        sum += an[i] * bm[i + j];
                    else
                        sum += an[i + j] * bm[i];
                }
                if (sum > max)
                    max = sum;
            }
            System.out.println("#" + tc + " " + max);
        }
        sc.close();
    }
}
