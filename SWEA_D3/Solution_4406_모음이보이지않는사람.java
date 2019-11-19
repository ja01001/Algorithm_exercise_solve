import java.util.Scanner;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            String a = sc.nextLine();
			System.out.println("#"+test_case+" "+a.replace("a","").replace("i","").replace("o","").replace("u","").replace("e",""));
		}
	}
}