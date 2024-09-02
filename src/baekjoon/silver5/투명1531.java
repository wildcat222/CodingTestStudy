package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 투명1531 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[][] picture = new int[101][101];    // 그림 크기 100x100 -> 인덱스를 1부터 사용하기 위해 101x101크기로 설정
        int N = Integer.parseInt(str.split(" ")[0]);    // 불투명한 종이 갯수
        int M = Integer.parseInt(str.split(" ")[1]);    // M개 이하의 종이로 가려져야 안보인다.

        for(int i = 0; i < N; i++) {
            String test = br.readLine();
            int x1 = Integer.parseInt(test.split(" ")[0]);
            int y1 = Integer.parseInt(test.split(" ")[1]);
            int x2 = Integer.parseInt(test.split(" ")[2]);
            int y2 = Integer.parseInt(test.split(" ")[3]);
            for(int j = x1; j <= x2; j++) {
                for(int k = y1; k <= y2; k++) {
                    picture[j][k]++;
                }
            }

        }

        int answer = 0;
        for(int i = 1; i <= 100; i++) {
            for(int j = 1; j <= 100; j++) {
                if(picture[j][j] > M) answer++;
            }
        }

        System.out.println(answer);
    }
}
