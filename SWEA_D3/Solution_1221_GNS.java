import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static int N;
    public static String[] list;
    public static String[] ex = { "ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int Tc = 1; Tc <= T; Tc++) {
            String aa = br.readLine();
            String number = aa.split(" ")[0];
            int N = Integer.parseInt(aa.split(" ")[1]);
            list = br.readLine().split(" ");
            System.out.print(number + " ");
            for (int i = 0; i < ex.length; i++) {
                for (int j = 0; j < list.length; j++) {
                    if (list[j].equals(ex[i]))
                        System.out.print(list[j] + " ");
                }
            }
            System.out.println();
        }
    }
}