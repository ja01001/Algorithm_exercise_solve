import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

    public static LinkedList<String> ll;
    public static StringBuffer sb;
    public static int N;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            sb = new StringBuffer();
            ll = new LinkedList<>();
            String temp = sc.nextLine();
            for (int i = 0; i < temp.length(); i++)
                ll.offer(Character.toString(temp.charAt(i)));
            N = Integer.parseInt(sc.nextLine());
            temp = sc.nextLine();
            int[] temps = new int[N];
            for (int i = 0; i < N; i++)
                temps[i] = Integer.parseInt(temp.split(" ")[i]);
            Arrays.sort(temps);
            for (int i = N - 1; i >= 0; i--)
                ll.add(temps[i], "-");
            for (int i = 0; i < ll.size(); i++)
                sb.append(ll.get(i));
            System.out.println("#" + tc + " " + sb.toString());
        }
    }
}