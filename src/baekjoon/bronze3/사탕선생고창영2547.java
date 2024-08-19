package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 사탕선생고창영2547 {
    public static void main(String[] args) throws IOException, NumberFormatException {
    //첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 빈 줄로 구분되어 있고, 다음과 같이 구성되어 있다.
    // 테스트 케이스의 첫째 줄에 학생의 수 N이 주어진다. 다음 N개의 줄에는 각 학생들이 가져온 사탕의 수가 주어진다.
    //N은 100,000보다 작거나 같은 자연수이고, 사탕의 개수는 0보다 크거나 같은 정수이다.
    //학생들이 가져온 사탕 개수는 10^18보다 작거나 같다. (학생들이 가져온 사탕 개수의 합은 10^18을 넘어갈 수 있다)

    //각 테스트 케이스에 대해 모두에게 같은 사탕을 나눠줄 수 있으면 YES를, 없으면 NO를 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
//            System.out.println(); -> 받을 때 한줄 띄어서 받는다고 이해하여 넣었지만
//            입력 값에서 한 줄 띄는 것까지 입력 값이었다.
            br.readLine(); // 한줄 입력 받기
            int N = Integer.parseInt(br.readLine());
            BigInteger total = new BigInteger("0");
            for (int j = 0; j < N; j++) {
                total = total.add(new BigInteger(br.readLine()));
            }

            if (total.remainder(BigInteger.valueOf(N)).equals(BigInteger.ZERO)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
