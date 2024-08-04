package programmers.level0;

public class 짝수는싫어요 {
    public int[] solution(int n) {

        int[] answer = new int[(int) Math.ceil(n / (double) 2)];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (i * 2) + 1;
        }

        return answer;

    }
}
