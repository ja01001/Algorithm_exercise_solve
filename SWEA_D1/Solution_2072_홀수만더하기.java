import java.util.Scanner;
public class Solution{
	
    public static void main(String[] args) throws Exception{
    	Scanner sc = new Scanner(System.in);
       	int T = sc.nextInt();
        for(int tc = 1 ; tc<=T;tc++){
        	int sum = 0 ; 
            for(int i = 0; i<10;i++){
            	int temp = sc.nextInt();
                if( temp%2!=0) sum+=temp;
            }
            System.out.println("#"+tc+" "+sum);
        }
        sc.close();
    }
}