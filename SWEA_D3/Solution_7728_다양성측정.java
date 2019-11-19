import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int tc=1;tc<=T;tc++) {
			String s = sc.nextLine();
			Set<Character> ch = new HashSet<>();
			for(int i = 0 ; i<s.length();i++) {
				ch.add(s.charAt(i));
			}
			System.out.println("#"+tc+" "+ch.size());
		}
		sc.close();
	}
}