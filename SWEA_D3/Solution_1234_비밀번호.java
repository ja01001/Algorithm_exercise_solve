import java.util.LinkedList;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args) throws Exception{
    	Scanner sc = new Scanner(System.in);
		int T = 10;
		LinkedList<Integer> ll = new LinkedList<>();
		for(int Tc = 1;Tc<=T;Tc++) {
			LinkedList<Integer> b = new LinkedList<>();
			String a = sc.nextLine();
			int c = Integer.parseInt(a.split(" ")[0]);
			String str = a.split(" ")[1];
			for(int i = 0 ; i <c;i++) {
				 b.add((int)str.charAt(i)-'0');
			}
			for(int i = 1;i<b.size()-1;i++) {
				if(b.get(i)==b.get(i+1)&&i!=0) {
					b.remove(i+1);
					b.remove(i);
					i=i-2;
				}
				else if(b.get(0)==b.get(1)) {
					b.remove(1);
					b.remove(0);
				}
			}
			System.out.print("#"+Tc+" ");
			for(int i = 0 ; i<b.size();i++) {
				System.out.print(b.get(i));
			}
			System.out.println();
		}
	}
}