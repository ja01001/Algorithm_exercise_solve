import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int[] b = new int[N];
            for (int i = 1; i <= Q; i++) {
                st = new StringTokenizer(br.readLine());
                int L = Integer.parseInt(st.nextToken()) - 1;
                int R = Integer.parseInt(st.nextToken()) - 1;
                for (int j = L; j <= R; j++)
                    b[j] = i;
            }
            System.out.print("#" + tc + " ");
            for (int i : b)
                System.out.print(i + " ");
            System.out.println();
        }
        br.close();
    }
}