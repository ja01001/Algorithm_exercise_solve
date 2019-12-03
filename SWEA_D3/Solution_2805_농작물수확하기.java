import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static int[][] m;
    public static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // testcase
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            m = new int[N][N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                String a = br.readLine();
                for (int j = 0; j < N; j++) {
                    m[i][j] = a.charAt(j) - '0';
                }
            }
            for (int i = 0; i < N; i++) {
                sum += m[i][N / 2];
            }
            for (int j = 1; j < N / 2; j++) {
                for (int i = j; i < N - j; i++) {
                    sum += m[i][N / 2 - j];
                    sum += m[i][N / 2 + j];
                }
            }
            if (N != 1)
                sum += m[N / 2][0] + m[N / 2][N - 1];
            System.out.println("#" + tc + " " + sum);
        }
    }
}