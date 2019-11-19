import java.util.Scanner;
public class Solution {
	public static int multi (int N, int M) {
		if (M==0) return 1;
		else {return N*multi(N, M-1);
		}
	}
	static final int T = 10;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		for(int tc = 0;tc<T;tc++) {
			int tcs = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			System.out.println("#"+tcs+" "+multi(N,M));
		}
		sc.close();
	}
}