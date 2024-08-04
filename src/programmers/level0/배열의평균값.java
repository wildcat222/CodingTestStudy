package programmers.level0;

public class 배열의평균값 {
    public double solution(int[] numbers) {
        double answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer = answer + numbers[i];
        }

        answer = answer / numbers.length;

        return answer;
    }
}
