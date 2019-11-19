import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			System.out.print("#"+tc+" ");
			int cnt = 0 ;
			while (true) {
				if(N%2!=0)break;
				N = N/2 ;
				cnt++;
			}
			System.out.print(cnt+" ");
			cnt = 0;
			while (true) {
				if(N%3!=0)break;
				N = N/3 ;
				cnt++;
			}
			System.out.print(cnt+" ");
			cnt = 0;while (true) {
				if(N%5!=0)break;
				N = N/5 ;
				cnt++;
			}
			System.out.print(cnt+" ");
			cnt = 0;while (true) {
				if(N%7!=0)break;
				N = N/7 ;
				cnt++;
			}
			System.out.print(cnt+" ");
			cnt = 0;
			while (true) {
				if(N%11!=0)break;
				N = N/11 ;
				cnt++;
			}
			System.out.print(cnt+" ");
			System.out.println();
		}
		sc.close();
	}

}
