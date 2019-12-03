import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(sc.nextLine());
            ArrayList<Character> al = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                String a = sc.nextLine();
                if (!al.contains(a.charAt(0)))
                    al.add(a.charAt(0));
            }
            al.sort(null);
            int result = -1;
            for (int i = 0; i < al.size(); i++) {
                int a = al.get(i) - '0';
                if (a != 'A' - '0' + i) {
                    result = i;
                    break;
                }
            }
            if (result == -1)
                System.out.println("#" + tc + " " + al.size());
            else
                System.out.println("#" + tc + " " + result);
        }
        sc.close();
    }
}