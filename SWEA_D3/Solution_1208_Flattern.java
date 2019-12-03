import java.util.*;

public class Solution {

    static void print(Object o) {
        System.out.print(o);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int Ts = 10;

        int[] stack = new int[100];
        for (int Tc = 1; Tc <= Ts; Tc++) {
            int T = sc.nextInt();
            sc.nextLine();
            for (int k = 0; k < stack.length; k++) {
                stack[k] = sc.nextInt();
            }
            int cnt_upper = 0;
            int cnt_lower = 0;
            int result = 0;
            int MAX1 = -1;
            int MIN1 = 1000;
            for (int k = 0; k < T; k++) {
                int MAX = -1;
                int MIN = 1000;
                for (int as = 0; as < 100; as++) {
                    if (stack[as] >= MAX) {
                        MAX = stack[as];
                        cnt_upper = as;
                    }
                    if (stack[as] < MIN) {
                        MIN = stack[as];
                        cnt_lower = as;
                    }
                }
                stack[cnt_upper]--;
                stack[cnt_lower]++;
                result = Math.abs(MAX - MIN);
            }
            for (int as = 0; as < 100; as++) {
                if (stack[as] >= MAX1) {
                    MAX1 = stack[as];
                    cnt_upper = as;
                }
                if (stack[as] < MIN1) {
                    MIN1 = stack[as];
                    cnt_lower = as;
                }
                result = Math.abs(MAX1 - MIN1);
            }
            print("#" + Tc + " " + result + "\n");
        }
    }
}
/*
 * #1 13 #2 32 #3 54 #4 25 #5 87 #6 14 #7 39 #8 26 #9 13 #10 29
 */
