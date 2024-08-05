package baekjoon.silver5;

import java.util.Scanner;

public class 막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int stick = 64;
        int stick_cnt = 1;


        while (stick != x) {
            if (stick > x) {
                stick /= 2;
                if (stick >= x) {
                    continue;
                } else {
                    stick_cnt++;
                    x -= stick;
                }
            }
        }









    }
}
