import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] peop = new int[N];
            for (int i = 0; i < peop.length; i++) {
                peop[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(peop);
            int cnt = N;
            for (int i = 0; i < N; i++) {
                cnt += peop[i];
            }
            cnt += peop[N - 1];

            System.out.println("#" + tc + " " + cnt);
        }
        br.close();
    }

}