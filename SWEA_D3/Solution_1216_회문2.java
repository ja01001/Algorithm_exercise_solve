import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
	public static char board[][] ;
	public static int N = 100;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int Tc = 1;Tc<=10;Tc++) {
			int T =Integer.parseInt(br.readLine());
			board = new char[N][N];
			int max = -1;
			for (int i = 0 ; i<N;i++) {
				String s = br.readLine();
				for(int j = 0 ; j <N;j++) {
					board[i][j] = s.charAt(j);
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int k = 0 ; k<N;k++) {
				// 가로 
				for(int i = 0; i <N;i++) {
					for(int j = i ;j<N;j++) {
						sb.append(board[j][k]);
						if(sb.reverse().toString().equals(sb.reverse().toString())) {
							if(sb.length()>max) {
								max = sb.length();
							}
						}
					}
					sb = new StringBuilder();
				}
				// 세로 ?
				for (int j = 0 ;j<N;j++) {
					for(int i = j ;i<N;i++) {
						sb.append(board[k][i]);
						if(sb.reverse().toString().equals(sb.reverse().toString())) {
							if(sb.length()>max) {
								max = sb.length();
							}
						}
		
					}
					sb = new StringBuilder();
				}
			}
			System.out.println("#"+Tc+" "+max);
		}
	}
}