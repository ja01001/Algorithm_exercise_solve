import java.util.Scanner;

public class Solution {
    public static int N;
    public static int[] b;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            N = sc.nextInt();
            b = new int[N];
            for (int i = 0; i < N; i++) {
                b[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 2; i < N - 2; i++) {
                int temp1 = Math.max(b[i - 1], b[i - 2]);
                int temp2 = Math.max(b[i + 1], b[i + 2]);
                int temp = Math.max(temp1, temp2);
                if (temp < b[i]) {
                    sum += temp - b[i];
                }
            }
            System.out.println("#" + tc + " " + Math.abs(sum));
        }
        sc.close();
    }
}