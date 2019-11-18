import java.util.Scanner;
import java.io.FileInputStream;

class Solution_2063_중간값찾기{
	static void print(Object o) {
		System.out.print(o);
	}
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] data = new int[T]; 
		for(int tc = 0; tc <= T-1; tc++){
			data[tc] = sc.nextInt();
		}
		int temp ;
        // Arrays.sort(data);
        // 아래 loop 는 위의 sort() 와 동일 
		for (int i = data.length-1;i>0;i--) {
			for(int j = 0;j<i;j++) {
				
				if(data[j]>data[j+1]) {
					
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		sc.close();
		System.out.println(data[T/2]);
		
	}
}
