import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            String[] temp = br.readLine().split(" ");
            Arrays.sort(temp);
            if (temp[0].equals(temp[1]))
                System.out.println("#" + tc + " " + temp[2]);
            else
                System.out.println("#" + tc + " " + temp[0]);
        }
    }
}