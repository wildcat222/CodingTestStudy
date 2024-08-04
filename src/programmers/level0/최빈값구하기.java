package programmers.level0;

import java.util.Arrays;

public class 최빈값구하기 {
    public int solution(int[] array) {
        int answer = 0;

        int[] count = new int[1000];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        
        for (int i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = i;
            } else if (max == count[i]) {
                answer = -1;
            }
        }

        return answer;

    }
}
