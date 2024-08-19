package baekjoon.bronze1;

import java.io.IOException;
import java.util.Scanner;

public class 성지키기1236 {
    public static void main(String[] args) throws IOException {
        //영식이는 직사각형 모양의 성을 가지고 있다. 성의 1층은 몇 명의 경비원에 의해서 보호되고 있다.
        //영식이는 모든 행과 모든 열에 한 명 이상의 경비원이 있으면 좋겠다고 생각했다.
        //
        //성의 크기와 경비원이 어디있는지 주어졌을 때, 몇 명의 경비원을 최소로 추가해야 영식이를 만족시키는지 구하는 프로그램을 작성하시오.
        //첫째 줄에 성의 세로 크기 N과 가로 크기 M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다.
        // 둘째 줄부터 N개의 줄에는 성의 상태가 주어진다. 성의 상태는 .은 빈칸, X는 경비원이 있는 칸이다.

        // 행, 열 입력
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        char[][] castle = new char[row][col];

        // 행 수 만큼 입력
        for (int i = 0; i < row; i++) {
            castle[i] = sc.next().toCharArray();
        }

        // 경비병이 필요없는 행, 열 수 count
        int cntRow = 0;
        int cntCol = 0;

        // 경비병이 필요없는 행
        label:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (castle[i][j] == 'X') {
                    continue label;
                }
            }
            cntRow++;
        }

        // 경비병이 필요없는 열
        label:
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (castle[j][i] == 'X') {
                    continue label;
                }
            }
            cntCol++;
        }

        System.out.println(Math.max(cntRow, cntCol));

    }
}
