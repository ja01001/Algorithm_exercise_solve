import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static final int T = 10;
    public static Stack<Integer> stack;
    public static boolean[] visit;
    public static int[][] board;
    public static int N;
    public static boolean result;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int Tc = 1; Tc <= T; Tc++) {
            result = false;
            int K = sc.nextInt();
            N = sc.nextInt();
            int A = 0;
            int B = 0;
            board = new int[100][100];
            for (int i = 0; i < N; i++) {
                A = sc.nextInt();
                B = sc.nextInt();
                board[A][B] = 1;
            }
            stack = new Stack<Integer>();
            visit = new boolean[100];
            dfs(0);
            System.out.println(result ? "#" + K + " " + 1 : "#" + K + " " + 0);
        }
    }

    private static void dfs(int node) {
        // 재귀호출
        visit[node] = true;
        if (visit[99] == true) {
            result = true;
        }
        for (int next = 0; next < 100; next++) { // 0 1 3 5 4 2 6
            if (visit[next] == false && board[node][next] == 1) {
                dfs(next);
            }
        }
    }
}