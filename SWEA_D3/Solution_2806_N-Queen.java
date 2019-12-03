import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static int N;
    public static int T;
    public static int result;
    public static int[] b;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int Tc = 1; Tc <= T; Tc++) {
            N = Integer.parseInt(br.readLine());
            b = new int[N];
            result = 0;
            nqueen(0);
            System.out.println("#" + Tc + " " + result);
        }
        System.out.println();
    }

    public static void nqueen(int i) {
        if (i == N) {
            result++;
            return;
        }
        for (int j = 0; j < N; j++) {
            b[i] = j;
            if (promising(i))
                nqueen(i + 1);
        }
    }

    public static boolean promising(int i) {
        for (int j = 0; j < i; j++) {
            if (b[j] == b[i] || Math.abs(b[j] - b[i]) == (i - j))
                return false;
        }
        return true;
    }
}