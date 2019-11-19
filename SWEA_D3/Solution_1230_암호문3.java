import java.io.FileInputStream;
import java.util.Scanner;
import java.util.LinkedList;
public class Solution {
    static void print(Object o){
        System.out.print(o);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for(int aa = 1;aa<=10;aa++){
            int T = sc.nextInt();
            LinkedList<Integer>li = new LinkedList<Integer>();
            for (int i = 0; i < T; i++) {
                li.add(sc.nextInt());
            }
            int Ts = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < Ts; i++) {
                String a = sc.next();
                if (a.equals("I")) {
                    int index = sc.nextInt();
                    int TS1 = sc.nextInt();
                    for (int j = 1; j <= TS1; j++) {
                        int t = sc.nextInt();
                        li.add(index, t);
                        index++;
                    }
                } else if (a.equals("D")) {
                    int index = sc.nextInt();
                    int TS1 = sc.nextInt();
                    for (int j = 0; j < TS1; j++) {
                        li.remove(index);
                    }
                } else if (a.equals("A")) {
                    int TS1 = sc.nextInt();
                    for (int j = 1; j <= TS1; j++) {
                        li.add(sc.nextInt());
                    }
                }
            }
            print("#"+aa+" ");
            for (int i = 0;i<10;i++){
            	System.out.print(li.get(i)+" ");
            }
            System.out.println();
        }

    }

}
