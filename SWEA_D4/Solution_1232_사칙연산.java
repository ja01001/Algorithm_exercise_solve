import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static String[] val;

    class Tree {
        class Node {
            int data;
            Node left, right;
        }

        Node root;

        public void summ(Node root) {
            if (isNum(val[root.left.data]) == false && isNum(val[root.right.data]) == true)
                summ(root.left);
            else if (isNum(val[root.left.data]) == true && isNum(val[root.right.data]) == false)
                summ(root.right);
            else if (isNum(val[root.left.data]) == false && isNum(val[root.right.data]) == false)
                summ(root.left);
            else {
                String a = val[root.data];
                if (a.equals("-")) {
                    val[root.data] = Integer.toString(
                            Integer.parseInt(val[(root.left.data)]) - Integer.parseInt(val[(root.right.data)]));
                } else if (a.equals("+")) {
                    val[root.data] = Integer
                            .toString(Integer.parseInt(val[root.left.data]) + Integer.parseInt(val[root.right.data]));
                } else if (a.equals("*")) {
                    val[root.data] = Integer
                            .toString(Integer.parseInt(val[root.left.data]) * Integer.parseInt(val[root.right.data]));
                } else if (a.equals("/")) {
                    val[root.data] = Integer
                            .toString(Integer.parseInt(val[root.left.data]) / Integer.parseInt(val[root.right.data]));
                }
            }
        }

        public void makeTree(int d1, int d2) {
            if (root == null) {
                root = new Node();
                root.data = d1;
            }
            makeTree(root, d1, d2);
        }

        public Node makeTree(Node root, int d1, int d2) {
            if (root == null) {
                root = new Node();
                root.data = d2;
                return root;
            }
            if (root.data == d1) {
                if (root.left == null) {
                    root.left = makeTree(root.left, d1, d2);
                } else if (root.right == null) {
                    root.right = makeTree(root.right, d1, d2);
                }
                return root;
            }
            makeTree(root.left, d1, d2);
            makeTree(root.right, d1, d2);
            return root;
        }
    }

    public static int N;
    public static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // testcase
        int T = 10;
        for (int tc = 1; tc <= T; tc++) {
            Tree t = new Solution().new Tree();
            N = Integer.parseInt(br.readLine());
            StringTokenizer st;
            val = new String[N + 1];
            val[0] = "";
            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                int root = Integer.parseInt(st.nextToken());
                val[i] = st.nextToken();
                while (st.hasMoreTokens()) {
                    t.makeTree(root, Integer.parseInt(st.nextToken()));
                }
            }
            while (true) {
                if (isNum(val[1]) == true)
                    break;
                t.summ(t.root);
            }
            System.out.print("#" + tc + " ");
            System.out.println(val[1]);

        }
    }

    public static boolean isNum(String a) {
        try {
            Double.parseDouble(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}