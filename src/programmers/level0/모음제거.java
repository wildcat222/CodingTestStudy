package programmers.level0;

public class 모음제거 {
    public String solution(String my_string) {
        String answer = my_string;
        String[] gatter = {"a", "e", "i", "o", "u"};

        for (String g : gatter) {
            answer = answer.replaceAll(g, "");
        }

        return answer;
    }
}
