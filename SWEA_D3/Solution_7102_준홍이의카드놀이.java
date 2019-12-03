import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    private static int N, M;
    private static int[] B;
    private static int max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int Tc = 1; Tc <= T; Tc++) {
            String temp = br.readLine();
            N = Integer.parseInt(temp.split(" ")[0]);
            M = Integer.parseInt(temp.split(" ")[1]);
            B = new int[N + M - 1];
            max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    B[i + j]++;
                }
            }
            for (int i = 0; i < N + M - 1; i++) {
                if (B[i] > max)
                    max = B[i];
            }
            // print
            System.out.print("#" + Tc + " ");
            for (int i = 0; i < N + M - 1; i++)
                if (B[i] == max)
                    System.out.print((i + 2) + " ");
            System.out.println();
        }
    }
}