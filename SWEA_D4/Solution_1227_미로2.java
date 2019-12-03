import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static final int[] di = { 0, 0, -1, 1 };
    public static final int[] dj = { -1, 1, 0, 0 };
    public static int fx, fy, answer;
    public static int N = 100;
    public static int[][] visit;
    public static int[][] maze;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        maze = new int[N][N];
        for (int Tc = 1; Tc <= 10; Tc++) {
            answer = 0;
            int T = Integer.parseInt(br.readLine());
            int x = 0, y = 0;
            for (int i = 0; i < N; i++) {
                String a = br.readLine();
                for (int j = 0; j < N; j++) {
                    maze[i][j] = a.charAt(j) - '0';
                    if (maze[i][j] == 2) {
                        x = i;
                        y = j;
                    } else if (maze[i][j] == 3) {
                        fx = i;
                        fy = j;
                        maze[i][j] = 0;
                    }
                }
            }
            visit = new int[N][N];
            dfsr(x, y);
            System.out.println("#" + T + " " + answer);
        }

    }

    private static void dfsr(int i, int j) {
        visit[i][j] = 1;
        if (i == fx && j == fy) {
            answer = 1;
            return;
        }
        for (int d = 0; d < di.length; d++) {
            int ni = i + di[d];
            int nj = j + dj[d];
            if ((0 <= ni && ni < N) && (0 <= nj && nj < N) && maze[ni][nj] == 0 && visit[ni][nj] == 0) {
                dfsr(ni, nj);
            }
        }
    }
}