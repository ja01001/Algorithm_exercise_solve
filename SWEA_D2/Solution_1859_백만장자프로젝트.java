import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution{

        public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            for (int tc = 1; tc <= T; tc++) {
                int N=Integer.parseInt(br.readLine());
                int [] price = new int[N];
                int max=0;
                int count=0;
                String[] temp = br.readLine().split(" ");
                // 입력을 받으면서 가장 클때의 값 구하기 
                for(int i=0; i<N;i++) {
                    price[i]=Integer.parseInt(temp[i]);
                    if(price[i]>max) {
                        max=price[i];
                        count=i;
                    }
                }
                long sum=0; int k=count; int start=0;

                while(start<price.length-1) {
                    // 0일부터 max인 날까지의 이익을 구하기 
                    for(int j=start;j<count;j++) {
                        sum+=max-price[j];
                    }
                    // max인 날 이후 이익 구하기 
                    start=count; k=price.length-start; max=0;

                    if(k>1) {
                        // max 값을 다시 구해 count 업데이트 하기 
                        for(int m=start;m<price.length;m++) {
                            if(price[m]>max) {
                                max=price[m];
                                count=m;
                            }
                        }

                    }
                    count++;

                }

                System.out.println("#" + tc + " "+sum);

            }
        }

}
