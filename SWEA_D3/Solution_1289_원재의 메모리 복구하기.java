import java.io.FileInputStream;
import java.util.Scanner;

class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
			for (int tc =1 ; tc<=T;tc++) {
				String line = sc.next();
				char cur = '0';
				int count = 0;
				for (int i = 0 ; i <line.length();i++) {
					char ch = line.charAt(i);
					if(ch!=cur) {
						count +=1;
						cur = ch;
					}
				}
			
			System.out.println("#"+tc+" "+count);
			count = 0;
		}
			sc.close();
	}
}