import java.util.Scanner;

public class Solution {
    public static int H, W, xx, yy;
    public static char[][] b;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= T; tc++) {
            String temp = sc.nextLine();
            H = Integer.parseInt(temp.split(" ")[0]);
            W = Integer.parseInt(temp.split(" ")[1]);
            b = new char[H][W];
            xx = 0;
            yy = 0;
            for (int i = 0; i < H; i++) {
                temp = sc.nextLine();
                for (int j = 0; j < W; j++) {
                    b[i][j] = temp.charAt(j);
                    if (b[i][j] == '<' || b[i][j] == '^' || b[i][j] == 'v' || b[i][j] == '>') {
                        xx = i;
                        yy = j;
                    }
                }
            }
            int len = Integer.parseInt(sc.nextLine());
            temp = sc.nextLine();
            for (int i = 0; i < len; i++) {
                char qs = temp.charAt(i);
                if (qs == 'S') {
                    if (b[xx][yy] == '^') {
                        for (int q = xx; q >= 0; q--) {
                            if (b[q][yy] == '*') {
                                b[q][yy] = '.';
                                break;
                            } else if (b[q][yy] == '#')
                                break;
                        }
                    } else if (b[xx][yy] == 'v') {
                        for (int q = xx; q < H; q++) {
                            if (b[q][yy] == '*') {
                                b[q][yy] = '.';
                                break;
                            } else if (b[q][yy] == '#')
                                break;
                        }
                    } else if (b[xx][yy] == '<') {
                        for (int q = yy; q >= 0; q--) {
                            if (b[xx][q] == '*') {
                                b[xx][q] = '.';
                                break;
                            } else if (b[xx][q] == '#')
                                break;
                        }
                    } else if (b[xx][yy] == '>') {
                        for (int q = yy; q < W; q++) {
                            if (b[xx][q] == '*') {
                                b[xx][q] = '.';
                                break;
                            } else if (b[xx][q] == '#')
                                break;
                        }
                    }
                }
                // 회전
                // 우
                else if (qs == 'R') {
                    if (yy + 1 < W && b[xx][yy + 1] == '.') {
                        b[xx][yy] = '.';
                        b[xx][yy + 1] = '>';
                        yy++;
                    } else
                        b[xx][yy] = '>';
                }
                // 하
                else if (qs == 'D') {
                    if (xx + 1 < H && b[xx + 1][yy] == '.') {
                        b[xx][yy] = '.';
                        b[xx + 1][yy] = 'v';
                        xx++;
                    } else
                        b[xx][yy] = 'v';
                }
                // 상
                else if (qs == 'U') {
                    if (xx - 1 >= 0 && b[xx - 1][yy] == '.') {
                        b[xx][yy] = '.';
                        b[xx - 1][yy] = '^';
                        xx--;
                    } else
                        b[xx][yy] = '^';
                }
                // 좌
                else if (qs == 'L') {
                    if (yy - 1 >= 0 && b[xx][yy - 1] == '.') {
                        b[xx][yy] = '.';
                        b[xx][yy - 1] = '<';
                        yy--;
                    } else
                        b[xx][yy] = '<';
                }
            }
            System.out.print("#" + tc + " ");
            for (int i = 0; i < H; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(b[i]);
                System.out.println(sb.toString());
            }
            // s-> 가리키는 방향으로 확인
        }
        sc.close();
    }
}
