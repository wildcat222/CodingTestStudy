package programmers.level0;

public class 개미군단 {
    public int solution(int hp) {
//        개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
//        장군개미는 5의 공격력, 병정개미는 3의 공격력, 일개미는 1의 공격력
        int gAnt = hp / 5;
        hp %= 5;
        int sAnt = hp / 3;
        hp %= 3;

        int answer = gAnt + sAnt + hp;

        return answer;

    }
}
