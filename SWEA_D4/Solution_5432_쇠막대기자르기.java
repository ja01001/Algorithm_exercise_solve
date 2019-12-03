import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Stack<Character> s = new Stack<>();
        sc.nextLine();
        for (int Tc = 1; Tc <= T; Tc++) {
            int cnt = 0;
            String a = sc.nextLine();
            s.push(a.charAt(0));
            for (int i = 1; i < a.length(); i++) {
                if (a.charAt(i) == '(') {
                    s.push(a.charAt(i));
                } else if (a.charAt(i) == ')' && a.charAt(i - 1) == ')') {
                    s.pop();
                    cnt++;
                } else if (a.charAt(i) == ')' && s.peek() == '(') {
                    s.pop();
                    cnt = cnt + s.size();
                }
            }
            System.out.println("#" + Tc + " " + cnt);
        }
        sc.close();
    }
}