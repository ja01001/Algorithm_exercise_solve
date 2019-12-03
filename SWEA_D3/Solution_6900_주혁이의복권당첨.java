import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    private static String temp;
    private static String[][] correct_num;
    private static int N, M, c; // N : count of correct number // M : the number of number that he have

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // testcase
        for (int Tc = 1; Tc <= T; Tc++) {
            temp = br.readLine();
            N = Integer.parseInt(temp.split(" ")[0]);
            M = Integer.parseInt(temp.split(" ")[1]);
            correct_num = new String[N][10];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                c = 0;
                temp = br.readLine();
                String[] t = temp.split(" ");
                for (int j = 0; j < 8; j++) {
                    if (t[0].charAt(j) == '*') {
                        correct_num[i][j] = "*";
                        c++;
                    } else {
                        correct_num[i][j] = Character.toString(t[0].charAt(j));
                    }
                }
                correct_num[i][8] = t[1];
                c = 8 - c;
                correct_num[i][9] = Integer.toString(c);
            }
            for (int i = 0; i < M; i++) {
                temp = br.readLine();
                for (int j = 0; j < N; j++) {
                    int t = 0;
                    for (int k = 0; k < 8; k++)
                        if (correct_num[j][k].equals(Character.toString(temp.charAt(k))))
                            t += 1;
                    if (t == Integer.parseInt(correct_num[j][9]))
                        sum += Integer.parseInt(correct_num[j][8]);
                }
            }
            // print
            System.out.println("#" + Tc + " " + sum);
        }
    }

}
