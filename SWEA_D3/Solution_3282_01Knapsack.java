import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int tc = 1; tc <= T; tc++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int[] w = new int[N];
            int[] v = new int[N];
            int[][] k = new int[N + 1][W + 1];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                w[i] = Integer.parseInt(st.nextToken());
                v[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= W; j++) {
                    if (w[i - 1] > j)
                        k[i][j] = k[i - 1][j];
                    else
                        k[i][j] = Math.max(k[i - 1][j - w[i - 1]] + v[i - 1], k[i - 1][j]); // max ( 물건의 가치 + 여분에 대한 가치
                                                                                            // , 이전에 계산된 최대 가치 )
                }
            }
            System.out.println("#" + tc + " " + k[N][W]);
        }
        br.close();
    }
}