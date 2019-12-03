import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static ArrayList<String> ac;
    public static int N;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            N = sc.nextInt();
            sc.nextLine();
            ac = new ArrayList<>();
            ac.add("");
            for (int i = 0; i < N; i++) {
                String temp = sc.nextLine();
                ac.add(temp.split(" ")[1]);
            }
            System.out.print("#" + tc + " ");
            inorder(1);
            System.out.println();
        }
    }

    public static void inorder(int i) {
        if (i <= N) {
            inorder(2 * i);
            System.out.print(ac.get(i));
            inorder(2 * i + 1);
        }
        return;
    }
}