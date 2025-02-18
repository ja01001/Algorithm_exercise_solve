import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int cnt = 0;
            int N = sc.nextInt();
            for (int i = 0; i < N; i++) {
                int count = i + 1;
                int sum = 0;
                while (true) {
                    if (sum >= N)
                        break;
                    sum += count;
                    count++;
                }
                if (sum == N)
                    cnt++;
            }
            System.out.println("#" + tc + " " + cnt);
        }
        sc.close();
    }
}