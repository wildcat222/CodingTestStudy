package baekjoon.bronze1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class 더하기사이클1110 {
    public static void main(String[] args) {

//        먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
//        그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면
//        새로운 수를 만들 수 있다. 다음 예를 보자.
//
//        26(x)부터 시작한다. 2+6 = 8 (n1 + n2 = y)이다.     (+1)
//        새로운 수는 z(68('(x의 두번째 자리 수)'+'(y의 2번째 자리 수)'))이다. 6+8 = 14(y)이다. (+1)
//        새로운 수는 84('(x의 두번째 자리 수)'+'(y의 2번째 자리 수)')이다. 8+4 = 12(y)이다. (+1)
//        새로운 수는 42이다. 4+2 = 6이다.  (+1)
//        새로운 수는 26이다.
//
//        위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//        N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();

        int x = n;
        int cnt = 0;

//        아스키 코드
//        char c = '1';
//        int n = c - '0'; // == int n = (int)c - '0'; 49 - 48 = 1
//        System.out.println(n); // 결과: 1
        int n1 = 0;
        int n2 = 0;
        if (x < 10) {
            n1 = 0;
            n2 = (int) Integer.toString(x).charAt(0) - '0';
        } else {
            n1 = (int) Integer.toString(x).charAt(0) - '0';
            n2 = (int) Integer.toString(x).charAt(1) - '0';
        }
        int y = n1 + n2;
        if (y < 10) {
            m1 = 0;
            m2 = (int) Integer.toString(y).charAt(0) - '0';
        } else {
            m1 = (int) Integer.toString(y).charAt(0) - '0';
            m2 = (int) Integer.toString(y).charAt(1) - '0';
        }

        int z = (int) (Integer.toString(x).charAt(1)+Integer.toString(y).charAt(1)) - '0';






        do {


        } while (z != x);






        if (x < 10) { //
            n1 = 0;
            n2 = (int) Integer.toString(x).charAt(0) - '0';
        } else {
            n1 = (int) Integer.toString(x).charAt(0) - '0';
            n2 = (int) Integer.toString(x).charAt(1) - '0';
        }

        if (x < 10) {
            n1 = 0;
            n2 = (int) Integer.toString(x).charAt(0) - '0';
        } else {
            n1 = (int) Integer.toString(x).charAt(0) - '0';
            n2 = (int) Integer.toString(x).charAt(1) - '0';
        }

        do {


            x = n1 + n2;
            cnt++;
        } while (x != n);

        if (x < 10) { // 주어진 값을 하나하나 int 형으로 분리
            int m1 = 0;
            int m2 = (int) Integer.toString(x).charAt(0) - '0';
        } else {
            int m1 = (int) Integer.toString(x).charAt(0) - '0';
            int m2 = (int) Integer.toString(x).charAt(1) - '0';
        }











    }
}
