import java.util.Scanner;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            String[] temp = sc.nextLine().split(" ");
            BigInteger A = new BigInteger(temp[0]);
            BigInteger B = new BigInteger(temp[1]);
            System.out.println("#" + tc + " " + A.add(B));
        }
        sc.close();
    }
}