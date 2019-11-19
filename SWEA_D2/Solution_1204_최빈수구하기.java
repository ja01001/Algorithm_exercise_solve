import java.util.*;

public class Solution{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1;tc<=T;tc++){
        	int N = sc.nextInt();
            int [] k = new int[101];
            for(int i = 0 ;i<1000;i++){
                k[sc.nextInt()] ++;
            }
            int max = 0;
            int maxi=0;
            for(int i = 0 ;i<k.length;i++){
            	if( max <=k[i]) {
                    maxi = i; 
                    max = k[i];
                }
            }
            System.out.println("#"+N+" "+maxi);
        }
        sc.close();
    
    
    }



}