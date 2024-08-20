package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부재중전화1333 {
    public static void main(String[] args) throws IOException {

        // 노래가 N곡, 노래 길이는 L초, 노래와 노래 사이 공백 5초
        // 첫곡을 듣는 순간은 노래의 0초, 0초부터 전화벨 울림 D초에 1초씩 울린다.
        // 전화벨을 들을 수 있는 가장 빠른 시간을 구하는 프로그램
        // 1 ≤ N ≤ 20
        // 1 ≤ L ≤ 180
        // 1 ≤ D ≤ 20

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int L = Integer.parseInt(str.split(" ")[1]);
        int D = Integer.parseInt(str.split(" ")[2]);

        // 전체 앨범 재생 시간
        // (N * L) + 5 * (N - 1)

        boolean[] time = new boolean[(N * L) + 5 * (N - 1)];

        for(int i = 0; i < N; i++) { // 곡 수
            int S = (L + 5) * i; // (노래나오는 시간 + 무음 시간 = 1곡) * i
            for(int j = S; j < S + L; j++) { // 조건식 해석 : 1곡 시작부터 노래나오는 시간까지
                time[j] = true; // 노래가 나오는 시간은 true
            }
        }

        int bell = 0; // 벨소리 울리는 시간
        while(bell < time.length) {
            if(!time[bell]) { // 벨소리가 울리는 시간에 노래가 나오지 않고 있다면
                break; // 탈출 후 그 시간 출력
            }
            bell += D; // 벨소리에 벨 울림 간격만큼 시간 추가
        }
        System.out.println(bell);
    }
}


//        boolean[] album = new boolean[3695];
//        boolean[] call = new boolean[3695];
//
//        for(int i = 0; i < N; i++) {
//            for(int j = 0; j < 5; j++) {
//                album[(L + j) + (L * i)] = true;
//            }
//        }
//
//        for(int i = 0; i < ((N * L) + (5 * (N - 1))) / D + 1; i++) {
//            call[D + i + (i * D)] = true;
//        }
//
//        for(int i = 0; i < album.length; i++) {
//            if(album[i] && call[i]) {
//                System.out.println(i);
//                return;
//            }
//        }
//        System.out.println((N * L) + 5 * (N - 1));


