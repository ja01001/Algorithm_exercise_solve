import java.util.*;

public class Solution_2056_연월일달력{
	// modular 7 과 관련된 문제 ! 
	public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int tc = 1; tc<=T;tc++){
        	String a = sc.nextLine();
            String res = a.substring(0,4)+"/"+a.substring(4,6)+"/"+a.substring(6);
            boolean tr  = true;
            int t = Integer.parseInt(a.substring(4,6)) ;
            if(t>12||t<=0){
            	tr = false;
            }
			int tcs = Integer.parseInt(a.substring(6));
            if(((t ==1)||(t==3)||(t ==5)||(t==7)||(t ==8)||(t ==10)||(t ==12))&&tcs>31){
            	tr = false;
            }
            else if(((t==4)||(t ==6)||(t ==9)||(t ==11))&&tcs>30)tr = false;
			else if((t==2)&&tcs>28) tr = false;
            if (tr) System.out.println("#"+tc+" "+res);
           else System.out.println("#"+tc+" "+"-1");
	    }
        sc.close();
    }
}
