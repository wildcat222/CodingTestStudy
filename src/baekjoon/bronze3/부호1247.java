package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class 부호1247 {

    public static void main(String[] args) throws IOException {
        // 총 3개의 테스트
        // 각 테스트 셋의 첫째 줄에는 N(1 ≤ N ≤ 100,000)이 주어지고,
        // 둘째 줄부터 N개의 줄에 걸쳐 각 정수가 주어진다. 주어지는 정수의 절댓값은 9223372036854775807보다 작거나 같다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            BigInteger S = new BigInteger("0");
            int N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                BigInteger X = new BigInteger(br.readLine());
                S = S.add(X);
            }
            if (S.compareTo(BigInteger.ZERO) > 0) {
                System.out.println('+');
            } else if (S.compareTo(BigInteger.ZERO) < 0) {
                System.out.println('-');
            } else {
                System.out.println(0);
            }
        }



        // 테스트 셋 입력 다 받은 후 한번에 출력
//        for (int i = 0; i < 3; i++) {
//            int N = sc.nextInt();
//            long S = 0;
//            for (int j = 0; j < N; j++) {
//                S += sc.nextLong();
//            }
//            if (S == 0) {
//                System.out.println(0);
//            } else if (S > 0) {
//                System.out.println('+');
//            } else {
//                System.out.println('-');
//            }
//        }


        // 테스트 셋 별 출력
//        for (int k = 0; k < 3; k++) {
//            int N = sc.nextInt();
//            for (int i = 0; i < N; i++) {
//                long[] arr = new long[N];
//                long S = 0;
//                arr[i] = sc.nextLong();
//                for (int j = 0; j < arr.length; j++) {
//                    S += arr[j];
//                }
//                if (S == 0) {
//                    System.out.println(0);
//                } else if (S > 0) {
//                    System.out.println('+');
//                } else {
//                    System.out.println('-');
//                }
//            }
//        }

    }
}
