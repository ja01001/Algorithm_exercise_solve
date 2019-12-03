import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;
            String[] temp = br.readLine().split(" ");
            for (int i = 0; i < temp.length; i++) {
                if (Integer.parseInt(temp[i]) < 40)
                    sum += 40;
                else
                    sum += Integer.parseInt(temp[i]);
            }
            System.out.println("#" + test_case + " " + (int) (sum / 5));
        }
    }
}