import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static String[] b;
    public static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // testcase
        int T = 10;
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            b = new String[N + 1];
            int acc = 1;
            int aac = 0;
            for (int i = 0; i < N; i++) {
                String a = br.readLine();
                String[] temp = a.split(" ");
                int x = Integer.parseInt(temp[0]);
                String y = temp[1];
                b[x] = y;
                if (temp.length == 4) {
                    x = Integer.parseInt(temp[2]);
                    b[x] = temp[2];
                    x = Integer.parseInt(temp[3]);
                    b[x] = temp[3];
                }

            }
            for (int i = 1; i < N; i++) {
                if (checknum(b[i])) {
                    aac = i;
                    break;
                }
            }
            for (int i = aac; i < N; i++) {
                if (checknum(b[i]) == false) {
                    acc = 0;
                    break;
                }
            }
            System.out.println("#" + tc + " " + acc);
        }
    }

    public static boolean checknum(String a) {
        try {
            Double.parseDouble(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}