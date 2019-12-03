import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int tc = 1; tc <= T; tc++) {
            int cnt = 0;
            String s = sc.nextLine();
            for (int i = 1; i <= 10; i++) {
                String ne = s.substring(0, i);
                if (ne.equals(s.substring(i, 2 * i))) {
                    cnt = i;
                    break;
                }
            }
            System.out.println("#" + tc + " " + cnt);
        }
        sc.close();
    }
}