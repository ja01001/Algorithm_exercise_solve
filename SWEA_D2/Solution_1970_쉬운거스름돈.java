import java.util.Scanner;

public class Solution {
    public static int[] t = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        T = 10;
        for (int tc = 1; tc <= T; tc++) {
            int[] b = new int[8];
            int N = sc.nextInt();
            while (true) {
                if (N < 10)
                    break;
                for (int i = 0; i < t.length; i++) {
                    b[i] = N / t[i];
                    N = N % t[i];
                }
            }
            System.out.println("#" + tc);
            for (int i : b)
                System.out.print(i + " ");
            System.out.println();
        }
        sc.close();
    }
}