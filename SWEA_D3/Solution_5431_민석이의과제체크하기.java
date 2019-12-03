import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            int[] num = new int[p];
            for (int i = 1; i <= p; i++) {
                num[i - 1] = i;
            }
            for (int i = 0; i < c; i++) {
                int ta = sc.nextInt();
                num[ta - 1] = 0;
            }
            System.out.print("#" + tc + " ");
            for (int i = 0; i < num.length; i++) {
                if (num[i] != 0) {
                    System.out.print(num[i] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
