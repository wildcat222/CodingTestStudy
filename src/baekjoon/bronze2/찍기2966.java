package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 찍기2966 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] answer = br.readLine().toCharArray(); // 정답을 입력받아 char배열로 저장
        char[] adrian = {'A', 'B', 'C'}; // 상근이 찍기 반복 주기
        char[] bruno = {'B', 'A', 'B', 'C'}; // 창영이 찍기 반복 주기
        char[] goran = {'C', 'C', 'A', 'A', 'B', 'B'}; // 현진이 찍기 반복 주기
        int index = 0; // 배열길이가 다르기 때문에 반복문에서 비교 대상의 인덱스를 따로 지정하기 위해 선언, 초기화
        int[] count = {0, 0, 0}; // 상근이, 창영이, 현진이 정답 카운트
        int max = 0; // 가장 많은 정답 수

        // 답안과 상근이 답안을 비교하여 맞은 갯수 출력
        for(int i = 0; i < N; i++) { // 문제 수 만큼 반복
            if(index == adrian.length) index = 0; // index값이 비교대상의 배열 길이와 같으면 index를 0으로 초기화
            if(answer[i] == adrian[index]) {
                count[0]++; // 정답 count
            }
            index++; // 반복문이기 때문에 index++
        }
        index = 0; // 다음 대상이 사용할 수 있도록 index를 0으로 리셋

        // 답안과 창영이 답안을 비교하여 맞은 갯수 출력
        for(int i = 0; i < N; i++) {
            if(index == bruno.length) index = 0;
            if(answer[i] == bruno[index]) {
                count[1]++;
            }
            index++;
        }
        index = 0;

        // 답안과 현진이 답안을 비교하여 맞은 갯수 출력
        for(int i = 0; i < N; i++) {
            if(index == goran.length) index = 0;
            if(answer[i] == goran[index]) {
                count[2]++;
            }
            index++;
        }

        // 가장 많은 정답 수
        for(int i = 0; i < count.length; i++) {
            if(count[i] > max) { // 상근이, 창영이, 현진이 순서로 정답 수와 가장 많은 정답 수를 비교하여 max보다 높으며
                max = count[i]; // 해당 정답 갯수를 max로 대입
            }
        }
        // 가장 많은 정답 수 출력
        System.out.println(max);
//        System.out.println(Arrays.stream(count).max().getAsInt());

        // 각 아이들의 정답 수가 max와 같으면 출력
        if(count[0] == max) System.out.println("Adrian");
        if(count[1] == max) System.out.println("Bruno");
        if(count[2] == max) System.out.println("Goran");






    }
}
