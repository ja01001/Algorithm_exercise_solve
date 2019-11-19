import java.util.Scanner;

public class Solution{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int Tc = 1;Tc<=T;Tc++) {
			int max1=0,max2 =0; // max1 : 내려갈때 최대값 max2: 올라갈때 최대값
			int N = sc.nextInt();
			int b[] = new int[N];
			for(int i = 0 ;i<N;i++) {
				b[i] = sc.nextInt();
			}
			for(int i = 0;i<b.length-1;i++) {
				if(b[i]>b[i+1]&&(b[i]-b[i+1])>=max1) max1 = Math.abs(b[i]-b[i+1]);
				else if(b[i]<b[i+1]&&(b[i+1]-b[i])>=max2) max2 = Math.abs(b[i]-b[i+1]);
			}
			System.out.println("#"+Tc+" "+max2+" "+max1);
		}
		sc.close();
	}
}