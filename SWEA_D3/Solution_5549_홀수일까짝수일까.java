import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            String a = br.readLine();
            int b = Integer.parseInt(a.substring(a.length() - 1));
            if (b % 2 == 0)
                System.out.println("#" + test_case + " Even");
            else
                System.out.println("#" + test_case + " Odd");
        }
    }
}