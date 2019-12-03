import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int a[] = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++)
                a[i] = Integer.parseInt(st.nextToken());
            int Lis[] = new int[N];
            for (int i = 0; i < N; i++) {
                if (Lis[i] == 0)
                    Lis[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (a[i] > a[j] && 1 + Lis[j] > Lis[i])
                        Lis[i] = 1 + Lis[j];
                }
            }
            Arrays.sort(Lis);
            System.out.println("#" + tc + " " + Lis[Lis.length - 1]);
        }
    }

}
