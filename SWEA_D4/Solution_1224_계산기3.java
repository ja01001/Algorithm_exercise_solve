import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {
	public static Stack<Character> stack1;
	public static Stack<Integer> stack2;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int Tc = 1; Tc <= 10; Tc++) {
			br.readLine();
			String line = br.readLine();
			stack1 = new Stack<Character>();
			stack2 = new Stack<Integer>();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if ('0' <= c && c <= '9') {
					sb.append(c);
				} else if (c == ')') {
					char s;
					while ((s = stack1.pop()) != '(') {
						sb.append(s);
					}
				} else { //
					while (getIcp(c) <= getIsp()) {
						sb.append(stack1.pop());
					}
					stack1.push(c);
				}
			}
			while (!stack1.empty()) {
				sb.append(stack1.pop());
			}
			for (int i = 0; i < sb.length(); i++) {
				char c = sb.charAt(i);
				if ('0' <= c && c <= '9') {
					stack2.push(c - '0');
				} else {
					int n2 = stack2.pop();
					int n1 = stack2.pop();
					int sum = 0;
					switch (c) {
					case '+':
						sum = n1 + n2;
						break;
					case '*':
						sum = n1 * n2;
						break;
					}
					stack2.push(sum);

				}
			}
			System.out.println("#" + Tc + " " + stack2.peek());

		}
	}

	public static int getIcp(char c) {
		switch (c) {
		case '+':
			return 1;
		case '*':
			return 2;
		case '(':
			return 3;
		default:
			return 0;
		}
	}

	public static int getIsp() {
		char c = stack1.empty() ? ' ' : stack1.peek();

		switch (c) {
		case '+':
			return 1;
		case '*':
			return 2;
		case '(':
			return 0;
		default:
			return 0;
		}
	}
}
