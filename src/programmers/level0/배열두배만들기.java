package programmers.level0;

public class 배열두배만들기 {
    public int[] solution(int[] numbers) {
        int[] numbers2 = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[i] * 2;
        }

        return numbers2;
    }
}
