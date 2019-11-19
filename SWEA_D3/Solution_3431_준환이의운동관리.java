import java.util.Scanner;

public class Solution {
	static void print(Object o) {
		System.out.println(o);
	}
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1;tc<=T;tc++) {
			int L = sc.nextInt();
			int U = sc.nextInt();
			int D = sc.nextInt();
			int k = 0;
			if (D>U) k = -1;
			else if(D>L) k = 0;
			else if(D<L) k = L-D;
			print("#"+tc+" "+k);
		}
		sc.close();
	}
}
