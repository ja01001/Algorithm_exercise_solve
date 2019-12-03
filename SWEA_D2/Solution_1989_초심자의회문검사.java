import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int tc = 1; tc <= T; tc++) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s);
            if (s.toString().equals(sb.reverse().toString()))
                System.out.println("#" + tc + " " + "1");
            else
                System.out.println("#" + tc + " " + "0");
        }
        sc.close();
    }

}
