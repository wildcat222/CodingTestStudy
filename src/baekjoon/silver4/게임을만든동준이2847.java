package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 게임을만든동준이2847 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N 변수 선언 후 레벨의 수를 입력받아 초기화
        int[] scores = new int[N]; // 레벨의 수만큼 점수를 담을 배열
        int cnt = 0; // 점수를 감소시킨 횟수 카운트를 위한 변수 cnt
        for(int i = 0; i < N; i++) { // 레벨의 수만큼 반복하여
            scores[i] = Integer.parseInt(br.readLine()); // 점수를 입력받아 순서대로 배열에 담는다.
        }

        for(int i = N - 1; i > 0; i--) { // 레벨이 가장 높은 점수부터 그 이전단계 점수와 비교
            while(scores[i] <= scores[i - 1]) { // 높은 레벨의 점수가 낮은 레벨의 점수보다 작거나 같을 경우
                scores[i - 1]--; // 낮은 레벨의 점수 1점 낮춘다.
                cnt++; // 점수를 낮춘 횟수를 카운트한다.
            }
        }

//        for(int i = N - 1; i > 0; i--) { // 레벨이 가장 높은 점수부터 그 이전단계 점수와 비교
//            if (scores[i] <= scores[i - 1]) { // 높은 레벨의 점수가 낮은 레벨의 점수보다 작거나 같을 경우
//                //낮은 레벨의 점수에서 높은 레벨을 점수의 차에서 + 1 만큼 감소하면 됩니다.
//                int reduceNum = scores[i - 1] - scores[i] + 1; // 감소해야하는 값을 reduceNum 변수에 초기화
//                scores[i - 1] -= reduceNum; // 낮은 레벨의 점수에서 reduceNum 값만큼 감소시킨다.
//                cnt += reduceNum; // 감소한 횟수 카운트 변수에 reduceNum을 더해준다.
//            }
//        }

        System.out.println(cnt); // 감소한 횟수 출력
    }
}
