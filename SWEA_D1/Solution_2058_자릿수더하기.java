import java.util.*;

class Solution{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i =0 ; i<s.length();i++){
        	sum +=s.charAt(i)-'0';
        }
    	System.out.println(sum);
    }
    
}