package baekjoon.silver5;

import java.util.Scanner;

public class 뒤집기1439 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int zero = 0;   // 0을 뒤집어야 하는 횟수 카운트
        int one = 0;    // 1을 뒤집어야 하는 횟수 카운트

        /*
        ex) 11001100110011000001
        뒤집는 방법 : 연속된 하나 이상의 숫자를 잡고 모두 뒤집는 것
        뒤집는 횟수를 확인하면 되니
        11 / 00 / 11 / 00 / 11 / 00 / 11 / 00000 / 1
        1  / 0 /  1  / 0 /  1  / 0 /  1  /   0   / 1     -> 뒤집는 횟수 동일
        로 축약 후 뒤집는 1과 0중에 뒤집어야하는 횟수가 적은 것이 최소한으로 뒤집을 수 있는 횟수
         */

        if(str.charAt(0) == '0') zero++;    // 첫번째 숫자 판별 후 뒤집어야하는 횟수 카운트
        else one++;

        for(int i = 1; i < str.length(); i++) {         // 2번째 숫자부터 문자열 길이만큼 반복
            if(str.charAt(i - 1) != str.charAt(i)) {    // 이전 숫자와 같지 않을 경우
                if(str.charAt(i) == '0') zero++;        // 0인지 1인지 판별 후 뒤집어야하는 횟수 카운트
                else one++;
            }
        }

        System.out.println(Math.min(zero, one));        // 0을 뒤집어야하는 횟수와 1을 뒤집어야하는 횟수 비교 후 작은 수 출력
    }
}
