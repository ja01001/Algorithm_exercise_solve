import java.util.Scanner;
class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            int X = sc.nextInt();
           	System.out.print("#"+test_case+" ");
            for (int i = 0;i<X;i++){
            	System.out.print("1/"+X+" ");
            }
            System.out.println();
		}
	}
}