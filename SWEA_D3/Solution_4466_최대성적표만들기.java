import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= Tc; i++) {
            int sum = 0;
            String[] cc = br.readLine().split(" ");
            int a = Integer.parseInt(cc[0]);
            int b = Integer.parseInt(cc[1]);
            cc = br.readLine().split(" ");
            int[] ca = new int[a];
            for (int j = 0; j < cc.length; j++) {
                ca[j] = Integer.parseInt(cc[j]);
            }
            Arrays.sort(ca);
            for (int j = 0; j < b; j++) {
                sum += ca[ca.length - 1 - j];
            }
            System.out.println("#" + i + " " + sum);
        }
    }
}