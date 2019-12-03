import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            String a = sc.nextLine();
            int[] ac = new int[4];
            String[] c = new String[a.length() / 3];
            int cnt = 0;
            for (int i = 0; i < a.length(); i += 3) {
                c[cnt++] = a.substring(i, i + 3);
            }
            boolean flag = false;
            for (int i = 0; i < c.length; i++) {
                for (int j = i + 1; j < c.length; j++) {
                    if (c[i].equals(c[j])) {
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                for (int i = 0; i < c.length; i++) {
                    if (c[i].charAt(0) == 'S')
                        ac[0]++;
                    else if (c[i].charAt(0) == 'D')
                        ac[1]++;
                    else if (c[i].charAt(0) == 'H')
                        ac[2]++;
                    else if (c[i].charAt(0) == 'C')
                        ac[3]++;

                }
            }
            System.out.print("#" + tc + " ");
            if (flag)
                System.out.println("ERROR");
            else {
                for (int i = 0; i < ac.length; i++) {
                    System.out.print(13 - ac[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}