import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
	public static int bino(int n, int k ) {
		if(k==0||n==k) return 1;
		else return bino(n-1,k-1)+bino(n-1,k);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		ArrayList<int[]> list = new ArrayList<>();
		list.add(new int[] {1});
		for(int tc =1;tc<=T;tc++) {
			int N = Integer.parseInt(br.readLine());
			int [] c = new int[N+1]; 
			for(int i = 0; i<=N;i++) {
                c[i] = bino(N,i);
			}
			list.add(c);
			System.out.println("#"+tc);
			for(int i = 0; i <list.size()-1;i++) {
				for(int k :list.get(i))System.out.print(k+" ");
				System.out.println();
			}
		}
	}

}
