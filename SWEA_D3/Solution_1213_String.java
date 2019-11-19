import java.io.FileInputStream;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		for(int Tc =1;Tc<=10;Tc++) {
			int Ts= sc.nextInt();
			sc.nextLine();
			char a[] = sc.nextLine().toCharArray();
			char b[] = sc.nextLine().toCharArray();
			int N = b.length;
			int count =0;
			for(int i = 0 ; i<N;i++) {
				if(b[i]==a[0]&& i!=N-1) {
					int cnt =1;
					for(int j = 1;j<a.length;j++) {
						if(b[i+1]!=a[1]) break; 
						else if(b[i+j]==a[j])	cnt++;
					}
					if(cnt ==a.length) {
						count++;
					}
				}
			}
			System.out.println("#"+Tc+" "+count);
		}	 
	}
}