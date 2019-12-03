import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int x = 1;
        for (int tc = 1; tc <= T; tc++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            int M = sc.nextInt();
            while (true) {
                if ((x - S) % 365 == 0 && (x - E) % 24 == 0 && (x - M) % 29 == 0)
                    break;
                x++;
            }
            if (x - 254040 > 0)
                x = x - 254040;
            System.out.println("#" + tc + " " + x);
        }
        sc.close();
    }
}