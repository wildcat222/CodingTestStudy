package programmers.level0;

public class 양꼬치 {
    public int solution(int n, int k) {
        // 양꼬치 12,000원 (n 인분)
        // 음료수 2,000원  (k 개)
        // 양꼬치 10인분에 음료수 1개 서비스 (-2000)
        int answer = 0;

        answer = (n * 12000) + (k * 2000) - ((n / 10) * 2000);

        return answer;
    }
}
