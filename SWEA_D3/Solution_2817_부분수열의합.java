import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int Tc = 1; Tc <= T; Tc++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int count = 0;
            int a[] = new int[N];
            for (int k = 0; k < N; k++) {
                a[k] = sc.nextInt();
            }
            for (int i = 0; i < (1 << a.length); i++) {
                int sum = 0;
                for (int j = 0; j < a.length; j++) {
                    if ((i & (1 << j)) > 0) {
                        sum = sum + a[j];
                    }
                }
                if (sum == K) {
                    count++;
                }
            }
            System.out.println("#" + Tc + " " + count);
        }
    }
}