import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // testcase
        for (int Tc = 1; Tc <= T; Tc++) {
            String temp = br.readLine();
            int[] b = new int[temp.length()];
            for (int i = 0; i < temp.length(); i++) {
                b[i] = temp.charAt(i) - '0';
            }
            int curr = 0;
            int req = 0;
            for (int i = 0; i < b.length; i++) {

                if (b[i] != 0) {
                    if (curr >= i) {
                        curr += b[i];
                    } else {
                        req += Math.abs(curr - i);
                        curr += b[i] + Math.abs(curr - i);
                    }
                }
            }
            /// print
            System.out.println("#" + Tc + " " + req);
        }
    }

}
