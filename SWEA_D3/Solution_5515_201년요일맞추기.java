import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    public static int[] da = { 3, 4, 5, 6, 0, 1, 2 };
    public static int mon, day, tot;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // testcase
        for (int Tc = 1; Tc <= T; Tc++) {
            String temp = br.readLine();
            tot = 0;
            mon = Integer.parseInt(temp.split(" ")[0]);
            day = Integer.parseInt(temp.split(" ")[1]);
            for (int i = 0; i < mon - 1; i++) {
                tot += month[i];
            }
            tot += day;
            System.out.println("#" + Tc + " " + da[tot % 7]);
        }
    }
}