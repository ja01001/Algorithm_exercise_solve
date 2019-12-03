import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static int N; // ( < [ {
    public static int[] op = { 40, 60, 91, 123 };
    public static int[] cl = { 41, 62, 93, 125 };

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for (int Tc = 1; Tc <= T; Tc++) {
            N = sc.nextInt();
            sc.nextLine();
            Stack<Integer> stack = new Stack<>();
            String a = sc.nextLine();
            for (int i = 0; i < N; i++) {
                int ss = (int) a.charAt(i);
                if (ss == op[0] || ss == op[1] || ss == op[2] || ss == op[3])
                    stack.push(ss);
                else {
                    int st = stack.peek();
                    if (ss == cl[0] && st == ss - 1 || ss == cl[3] && st == ss - 2 || ss == cl[1] && st == ss - 2
                            || ss == cl[2] && st == ss - 2)
                        stack.pop();
                    else
                        break;
                }
            }
            if (stack.empty())
                System.out.println("#" + Tc + " " + "1");
            else
                System.out.println("#" + Tc + " " + "0");
        }
        sc.close();
    }
}