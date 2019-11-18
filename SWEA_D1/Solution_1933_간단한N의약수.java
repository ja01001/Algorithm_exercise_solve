import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i =T ;i>0;i--) {
			if(T%i ==0) {
				System.out.print(T/i+" ");
			}
		}
		sc.close();
	}
}
