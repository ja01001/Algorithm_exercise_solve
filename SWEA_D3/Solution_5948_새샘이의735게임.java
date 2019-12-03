import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static int[] a, b;
    public static int N = 3;
    public static ArrayList<Integer> calc;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            a = new int[7];
            calc = new ArrayList<>();
            b = new int[N];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            comb(7, 3);
            calc.sort(null);
            System.out.println("#" + tc + " " + calc.get(calc.size() - 5));
        }
        sc.close();

    }

    public static void comb(int n, int c) {
        if (c == 0) {
            int k = 0;
            boolean flag = false;
            for (int i = 0; i < 3; i++) {
                k += b[i];
            }
            for (int cc = 0; cc < calc.size(); cc++) {
                if (calc.get(cc) == k)
                    flag = true;
            }
            if (!flag)
                calc.add(k);
            return;
        } else if (n < c)
            return;
        b[c - 1] = a[n - 1];
        comb(n - 1, c - 1);
        comb(n - 1, c);

    }
}
