import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static StringTokenizer st;
    public static BufferedReader br;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= N; tc++) {
            st = new StringTokenizer(br.readLine());
            int Y = Integer.parseInt(st.nextToken()) - 11;
            int M = Integer.parseInt(st.nextToken()) - 11;
            int S = Integer.parseInt(st.nextToken()) - 11;
            int sum = Y * 60 * 24 + M * 60 + S;
            if (sum < 0)
                sum = -1;
            System.out.println("#" + tc + " " + sum);
        }
    }
}