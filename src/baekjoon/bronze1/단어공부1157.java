package baekjoon.bronze1;

import java.util.Arrays;
import java.util.Scanner;

public class 단어공부1157 {
    public static void main(String[] args) {
//        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳(26)이 무엇인지 알아내는 프로그램을 작성하시오.
//        단, 대문자와 소문자를 구분하지 않는다. a
//        첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
//        단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        int[] cnt = new int[27];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                cnt[ch[i] - 'A']++;
            } else {
                cnt[ch[i] - 'a']++;
            }
        }

        for (int i = 0;  i < cnt.length; i++) {
            if (max < cnt[i]) {
                max = cnt[i];
                최빈값 인덱스 저장
            }
        }


    }
}
