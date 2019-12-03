import java.util.Scanner;

public class Solution {
    public static final int N = 100;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sx = 0;
        int sy = 0;
        for (int Tc = 1; Tc <= 10; Tc++) {
            int k = sc.nextInt();
            int[][] b = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    b[i][j] = sc.nextInt();
                    if (b[i][j] == 2) {
                        sx = i;
                        sy = j;
                    }
                }
            }
            b[sx - 1][sy] = 0;
            sx = sx - 1;
            b[sx][sy] = 0;
            while (true) {
                if (sx == 0) {
                    break;
                }
                if ((sy != 0 && sy != (N - 1) && b[sx][sy - 1] == 0 && b[sx][sy + 1] == 0)
                        || (sy == 0 && b[sx][sy + 1] == 0) || (sy == (N - 1) && b[sx][sy - 1] == 0)) {
                    b[sx][sy] = 0;
                    sx--;
                } else if ((sy != 0 && b[sx][sy - 1] == 1) || (sy == (N - 1) && b[sx][sy - 1] == 1)) {
                    b[sx][sy] = 0;
                    sy--;
                } else if ((sy == 0 && b[sx][sy + 1] == 1) || (sy != (N - 1) && b[sx][sy + 1] == 1)) {
                    b[sx][sy] = 0;
                    sy++;
                }
            }
            System.out.println("#" + k + " " + sy);
        }
        sc.close();
    }
}