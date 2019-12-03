import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static int N, M, t;
    public static String temp;
    public static int[] re, chnum;
    public static String[] arm = new String[8];
    public static StringBuffer sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // testcase
        for (int Tc = 1; Tc <= T; Tc++) {
            temp = br.readLine();
            N = Integer.parseInt(temp.split(" ")[1]);
            M = Integer.parseInt(temp.split(" ")[0]);
            re = new int[N];
            chnum = new int[8];
            for (int i = 0; i < M; i++) {
                String a = br.readLine();
                if (a.contains("1")) {
                    t = i;
                    temp = a;
                }
            }
            int cnta = 0;
            for (int j = 0; j < N; j++) {
                re[j] = temp.charAt(j) - '0';
                if (re[j] == 1) {
                    cnta = j;
                }
            }
            cnta = cnta - 56;
            //
            sb = new StringBuffer();
            int cnt = 0;
            int i = 0;
            for (int j = cnta + 1; j < cnta + 60; j++) {
                if (cnt == 7) {
                    cnt = 0;
                    arm[i] = sb.toString();
                    i++;
                    sb = new StringBuffer();
                    j = j - 1;

                } else {
                    sb.append(Integer.toString(re[j]));
                    cnt++;
                }
            }
            // change_number
            for (int q = 0; q < arm.length; q++)
                chnum[q] = change_num(arm[q]);
            // verified check
            int sum_temp = 0;
            int sum_real = 0;
            for (int a = 0; a < chnum.length; a++) {
                if (a % 2 == 0)
                    sum_temp += chnum[a] * 3;
                else
                    sum_temp += chnum[a];
                sum_real += chnum[a];
            }
            // print
            if (sum_temp % 10 == 0)
                System.out.println("#" + Tc + " " + sum_real);
            else
                System.out.println("#" + Tc + " " + 0);
        }
    }

    public static int change_num(String a) {
        int ret = 0;
        if (a.equals("0001101"))
            ret = 0;
        else if (a.equals("0011001"))
            ret = 1;
        else if (a.equals("0010011"))
            ret = 2;
        else if (a.equals("0111101"))
            ret = 3;
        else if (a.equals("0100011"))
            ret = 4;
        else if (a.equals("0110001"))
            ret = 5;
        else if (a.equals("0101111"))
            ret = 6;
        else if (a.equals("0111011"))
            ret = 7;
        else if (a.equals("0110111"))
            ret = 8;
        else if (a.equals("0001011"))
            ret = 9;
        return ret;
    }
}