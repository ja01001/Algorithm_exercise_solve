import java.util.Scanner;

public class Solution{
	public static final int N = 8;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		for(int tc = 0;tc<10;tc++) {
			int T = sc.nextInt();
			int []a = new int [N];
			int[] b = new int [N+1];
			for(int i =0;i<N;i++) {
				a[i] = sc.nextInt();
			}
here:		while (true) {
				for(int j = 1;j<=5;j++) {
					for(int i = 0 ;i <N;i++) {
						if(a[i]<=0) { // 종료조건 
							a[i] =0;
							break here;
						}
						b[i] = a[i];
					}
					b[8] = a[0]-j; // b배열의 마지막으로 이동 감소값들을 이동시킴
					for(int i = 0;i<N;i++){
						a[i] = b[i+1]; // a 배열의 값들을 변화시킴 
					}
				}
			}
			System.out.print("#"+T+" ");
			for(int s :a) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}