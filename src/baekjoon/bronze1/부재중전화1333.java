package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부재중전화1333 {
    public static void main(String[] args) throws IOException {

        // 노래가 N곡, 노래 길이는 L초, 노래와 노래 사이 공백 5초
        // 첫곡을 듣는 순간은 노래의 0초, 0초부터 전화벨 울림 D초에 1초씩 울린다.
        // 전화벨을 들을 수 있는 가장 빠른 시간을 구하는 프로그램

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int L = Integer.parseInt(str.split(" ")[1]);
        int D = Integer.parseInt(str.split(" ")[2]);

        // 전체 앨범 재생 시간
        // (N * L) + 5 * (N - 1)

    }


}
