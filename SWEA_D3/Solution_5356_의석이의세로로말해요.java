import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    private static String temp;
    private static int Max;
    private static String[][] data;
    private static ArrayList<String> TEMP;
    private static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // testcase
        for (int Tc = 1; Tc <= T; Tc++) {
            Max = -1;
            TEMP = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                temp = br.readLine();
                TEMP.add(temp);
                if (temp.length() >= Max)
                    Max = temp.length();
            }
            data = new String[Max][5];
            for (int i = 0; i < 5; i++) {
                String temp = TEMP.get(i);
                for (int j = 0; j < temp.length(); j++) {
                    data[j][i] = Character.toString(temp.charAt(j));
                }
            }
            sb = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    if (data[i][j] != null)
                        sb.append(data[i][j]);
                    else
                        sb.append("");
                }
            }
            System.out.println("#" + Tc + " " + sb.toString());
        }
    }
}