import java.io.*;
import java.util.*;

public class Solution{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        for(int tc =1;tc<=T;tc++){
        	int N = sc.nextInt();
            int sum = 0;
            for(int k = 1;k<=N;k++){
            	if(k%2!=0) sum +=k;
                else sum+= -k;
            }
			System.out.println("#"+tc+" "+sum);        
        }
    
    
    }

}