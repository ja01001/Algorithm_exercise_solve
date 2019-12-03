import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    private static int N, M;
    private static int[] te1, te2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            String temp = br.readLine();
            N = Integer.parseInt(temp.split(" ")[0]);
            M = Integer.parseInt(temp.split(" ")[1]);
            // 1 . N 에 대한 좌표값
            te1 = decTodes(N);
            te2 = decTodes(M);
            int nx = (te1[0] - te1[1]) + (te2[0] - te2[1]);
            int ny = (te1[1] + 1) + (te2[1] + 1);
            System.out.println("#" + tc + " " + desTodec(nx, ny));
        }
    }

    public static int desTodec(int a, int b) {
        return (a + b) * (a + b - 1) / 2 - b + 1;
    }

    public static int[] decTodes(int a) {
        int cnt = 0;
        int mods = 0;
        int news = 0;
        for (int i = 1; i <= 10000; i++) {
            if (cnt >= a) {
                news = i - 1;
                mods = Math.abs(a - cnt);
                break;
            }
            cnt += i;
        }
        return new int[] { news, mods };
    }
}