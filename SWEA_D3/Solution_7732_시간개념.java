import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
        for (int tc = 1; tc <= T; tc++) {
            Date d1 = f.parse(sc.nextLine());
            Date d2 = f.parse(sc.nextLine());
            long d3 = d2.getTime() - d1.getTime();
            int d4 = Integer.parseInt(Long.toString(d3 / 1000));
            if (d4 < 0)
                d4 += 86400;
            StringBuilder sb = new StringBuilder();
            if (d4 / 60 / 60 < 10)
                sb.append(0);
            sb.append(d4 / 60 / 60 + ":");
            d4 = d4 - 3600 * (d4 / 60 / 60);
            if (d4 / 60 < 10)
                sb.append(0);
            sb.append(d4 / 60 + ":");
            d4 = d4 - 60 * (d4 / 60);
            if (d4 < 10)
                sb.append(0);
            sb.append(d4);
            System.out.println("#" + tc + " " + sb.toString());
        }
        sc.close();
    }
}