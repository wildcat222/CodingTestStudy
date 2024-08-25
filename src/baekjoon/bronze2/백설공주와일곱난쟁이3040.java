package baekjoon.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백설공주와일곱난쟁이3040 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mans = new int[9]; // 입력받은 난쟁이의 모자 숫자를 담을 배열
        int sum = 0; // 전체 난쟁이의 모자 숫자의 합
        for(int i = 0; i < mans.length; i++) { // 난쟁이 인원수만큼 모자 숫자 입력받아서 배열에 넣는 과정
            mans[i] = Integer.parseInt(br.readLine());
            sum += mans[i];
        }

        // 전체 난쟁이의 숫자 합에서 가짜 난쟁이 두명의 숫자를 뺐을 때 100이면 진짜 난쟁이 7명이 나온다.
        for(int i = 0; i < mans.length; i++) { // 난쟁이 수만큼 반복 계산
            for(int j = i + 1; j < mans.length; j++) { // 처음에 선택한 난쟁이를 기준으로 비교 난쟁이를 바꾸기 위한 2중 for문
                if (sum - mans[i] - mans[j] == 100) { // 난쟁이 전체 숫자 합에서 선정된 2명의 난쟁이 모자 숫자를 뺐을때 100 이라면
                    // 진짜 가짜 난쟁이 두명을 찾았을 때 밑에 명령문이 실행된다.
                    sum = 100; // 진짜 난쟁이들의 합을 100으로 설정
                    mans[i] = mans[j] = 0; // 배열 내의 가짜 난쟁이 두명의 숫자를 0으로 바꾼다.
                    break; // 가짜 난쟁이를 찾았기 때문에 for문 탈출
                }
            }

            if(sum == 100) break; // 가짜 난쟁이를 찾았을 때 for문 탈출
        }

        for (int man : mans) { // 진짜 난쟁이 숫자 하나씩 출력
            if (man != 0) { // 난쟁이 숫자가 0이 아니라면 (가짜난쟁이의 수를 0으로 바꿨기 때문에)
                System.out.println(man); // 난쟁이 숫자 출력 (가짜 난쟁이는 출력이 안됨)
            }
        }


    }
}
