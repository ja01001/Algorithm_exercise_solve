import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {
    public static final int p = 1234567891;

    public static int T, N, R;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            System.out.println("#" + tc + " " + nCr(N, R, p));
        }
    }// N 중에서 r^2 만큼의 나눠버리면

    public static BigInteger nCr(int n, int r, int p) {
        long[] fac = new long[n + 1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++)
            fac[i] = fac[i - 1] * i % p;
        BigInteger P = BigInteger.valueOf(p);
        BigInteger A = BigInteger.valueOf(fac[n]);
        BigInteger B = BigInteger.valueOf(fac[r]).modInverse(P).remainder(P);
        BigInteger C = BigInteger.valueOf(fac[n - r]).modInverse(P).remainder(P);
        return A.multiply(B).multiply(C).remainder(P);
    }
}
