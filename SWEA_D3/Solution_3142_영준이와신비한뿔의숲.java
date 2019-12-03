import java.util.Scanner;

public class Solution {
    public static int N, M;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            // N : horn, M : EA ;
            N = sc.nextInt();
            M = sc.nextInt();
            int re = N - M;
            System.out.println("#" + tc + " " + (M - re) + " " + re);
        }
        sc.close();
    }
}