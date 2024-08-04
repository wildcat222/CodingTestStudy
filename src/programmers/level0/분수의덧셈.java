package programmers.level0;

import java.util.Arrays;

public class 분수의덧셈 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int denom = denom1 * denom2; // 공통 분모
        int numer = (numer1 * denom2) + (numer2 * denom1); // 분자
        int max = 1;

        for (int i = 1; i <= numer && i <= denom; i++) { // 분모와 분자보다 작은 수
            if (numer % i == 0 && denom % i == 0) { // 최대공약수 조건
                max = i;
            }
        }

        numer = numer / max; // 최대공약수로 통분
        denom = denom / max; // 최대공약수로 통분

        int[] answer = {numer, denom};

        return answer;
    }

}
