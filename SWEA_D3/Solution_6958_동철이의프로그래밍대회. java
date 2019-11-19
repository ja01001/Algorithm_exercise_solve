import java.util.Scanner;

public class Solution {
// 6913 과 같은 문제
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int Tc = 1;Tc<=T;Tc++) {
			int usr = sc.nextInt();
			int q = sc.nextInt();
			int[] c = new int[q];
			int max =0, max_usr= 0;
			for(int j = 0 ;j<usr;j++) {
				int cnt =0;
				for(int i = 0; i<q;i++) {
					c[i] = sc.nextInt();
					if(c[i]==1) cnt++;
				}
				if(cnt>max) {
					max = cnt;
					max_usr =1;
				}
				else if(cnt==max) max_usr ++;
			}
			System.out.println("#"+Tc+" "+ max_usr+" "+max);
		}
	}
}