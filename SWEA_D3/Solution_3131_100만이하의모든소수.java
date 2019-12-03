public class Solution {
    public static void main(String[] args) throws Exception {
        int N = 1000000;
        boolean[] b = new boolean[N];
        for (int i = 2; i < N; i++) {
            b[i] = true;
        }
        int to = (int) Math.sqrt(N);
        for (int i = 2; i < to; i++) {
            if (b[i]) {
                for (int j = i; i * j < N; j++)
                    b[i * j] = false;
            }
        }
        for (int i = 2; i < N; i++) {
            if (b[i])
                System.out.print(i + " ");
        }
    }
}