import java.util.Scanner;

public class Solution{
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int Tc = 10;
		for (int T = 1 ; T<=Tc;T++) {
			int N = sc.nextInt();
			int cnt = 0;
			sc.nextLine();
			char [][] b= new char[8][8];
			for (int i = 0 ; i<b.length;i++) {
				String ac = sc.nextLine();
				for(int j = 0; j<b.length;j++) {
					b[i][j] = ac.charAt(j);
				}
				for(int j =0; j<=b.length-N;j++) { // 0 1 2 3 4 
					StringBuffer sb = new StringBuffer();
					for(int k = 0 ; k<N;k++) {
						sb.append( b[i][j+k]);
					}
					if (sb.toString().equals(sb.reverse().toString())) {cnt++;}
				}
			}
			for(int i = 0; i<b.length;i++) {
				for(int j =0; j<=b.length-N;j++) { // 0 1 2 3
					StringBuffer sb = new StringBuffer();
					for(int k = 0 ; k<N;k++) {
						sb.append( b[k+j][i]);
					}
					if (sb.toString().equals(sb.reverse().toString())){cnt++;}
				}
			}
			System.out.println("#"+T+" "+cnt);
		}
		sc.close();
	}
}
