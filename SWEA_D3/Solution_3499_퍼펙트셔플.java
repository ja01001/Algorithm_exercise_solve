import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static String[] card;
    public static String[] shuffled;
    public static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int Tc = 1; Tc <= T; Tc++) {
            N = Integer.parseInt(br.readLine());
            card = new String[N];
            shuffled = new String[N];
            card = br.readLine().split(" ");
            int mid = card.length / 2;// 0~ n-1 n ~ length;
            for (int i = 0; i < shuffled.length; i = i + 2) {
                shuffled[i] = card[i / 2];
                if (N % 2 == 0) {
                    shuffled[i + 1] = card[mid + i / 2];
                } else if (N % 2 != 0 && i < shuffled.length - 1) {
                    shuffled[i + 1] = card[mid + i / 2 + 1];
                    shuffled[shuffled.length - 1] = card[mid];
                }
            }
            System.out.print("#" + Tc + " ");
            for (String s : shuffled)
                System.out.print(s + " ");
            System.out.println();
        }
    }
}