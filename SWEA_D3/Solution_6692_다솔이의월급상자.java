import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    private static double a;
    private static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tec = 1; tec <= T; tec++) {
            a = 0.0;
            N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                String temp = br.readLine();
                a += Double.parseDouble(temp.split(" ")[0]) * Integer.parseInt(temp.split(" ")[1]);
            }
            System.out.print("#" + tec + " ");
            System.out.format("%.6f", a);
            System.out.println();
        }
    }
}