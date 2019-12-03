import java.util.Scanner;

public class Solution {
    public static int max;
    public static int[] a;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            String nu_str = Integer.toString(sc.nextInt());
            int n = sc.nextInt();
            a = new int[nu_str.length()];
            for (int i = 0; i < a.length; i++) {
                a[i] = nu_str.charAt(i) - '0';
            }
            max = Integer.MIN_VALUE;
            dfs(n, 0, 0, a.length);
            System.out.println("#" + tc + " " + max);

        }
        sc.close();

    }

    public static void dfs(int n, int idx, int cnt, int len) {
        String ac = "";
        for (int i = 0; i < a.length; i++)
            ac += a[i];
        int ns = Integer.parseInt(ac);
        if (n == cnt) {
            max = Math.max(max, ns);
            return;
        }
        for (int i = idx; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (i == j)
                    continue;
                if (a[j] >= a[i]) {
                    swap(i, j);
                    dfs(n, i, cnt + 1, a.length);
                    swap(j, i);
                }
            }
        }
    }

    public static void swap(int i, int j) {
        int T = a[i];
        a[i] = a[j];
        a[j] = T;
    }
}