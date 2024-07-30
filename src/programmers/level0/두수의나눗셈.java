package programmers.level0;

public class 두수의나눗셈 {
    public int solution(int num1, int num2) {
        double division = (double) num1 / num2;
        division = division * 1000;
        int answer = (int) division;
        return answer;
    }
}
