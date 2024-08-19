package baekjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 상금헌터15953 {
    public static void main(String[] args) {
        // 1회 상금 (본선 진출자 100명)
        // 1등 500만원 1명
        // 2등 300만원 2명
        // 3등 200만원 3명
        // 4등 50만원 4명
        // 5등 30만원 5명
        // 6등 10만원 6명

        // 2회 상금 (본선 진출자 64명)
        // 1등 512만원 1명
        // 2등 256만원 2명
        // 3등 128만원 4명
        // 4등 64만원 8명
        // 5등 32만원 16명

        // 제1회 코드 페스티벌 본선에 진출하여 a등(1 ≤ a ≤ 100)등을 하였다. 단, 진출하지 못했다면 a = 0으로 둔다.
        // 제2회 코드 페스티벌 본선에 진출하여 b등(1 ≤ b ≤ 64)등을 할 것이다. 단, 진출하지 못했다면 b = 0으로 둔다.

        // 첫 번째 줄에 제이지가 상상력을 발휘하여 가정한 횟수 T(1 ≤ T ≤ 1,000)가 주어진다.
        // 다음 T개 줄에는 한 줄에 하나씩 제이지가 해본 가정에 대한 정보가 주어진다.
        // 각 줄에는 두 개의 음이 아닌 정수 a(0 ≤ a ≤ 100)와 b(0 ≤ b ≤ 64)가 공백 하나를 사이로 두고 주어진다.

        // 각 가정이 성립할 때 제이지가 받을 상금을 원 단위의 정수로 한 줄에 하나씩 출력한다.
        // 입력이 들어오는 순서대로 출력해야 한다.

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] firstPrize = {500, 300, 200, 50, 30, 10};
        int[] secondPrize = {512, 256, 128, 64, 32};

        for (int i = 0; i < T; i++) {
            int totalPrize = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 1) {
                totalPrize += firstPrize[0];
            } else if (a > 1 && a <= 3) {
                totalPrize += firstPrize[1];
            } else if (a > 3 && a <= 6) {
                totalPrize += firstPrize[2];
            } else if (a > 6 && a <= 10) {
                totalPrize += firstPrize[3];
            } else if (a > 10 && a <= 15) {
                totalPrize += firstPrize[4];
            } else if (a > 15 && a <= 21) {
                totalPrize += firstPrize[5];
            } else {
                totalPrize = 0;
            }

            if (b == 1) {
                totalPrize += secondPrize[0];
            } else if (b > 1 && b <= 3) {
                totalPrize += secondPrize[1];
            } else if (b > 3 && b <= 7) {
                totalPrize += secondPrize[2];
            } else if (b > 7 && b <= 15) {
                totalPrize += secondPrize[3];
            } else if (b > 15 && b <= 31) {
                totalPrize += secondPrize[4];
            }
            System.out.println(totalPrize * 10000);
        }
        sc.close();





//        for (int i = 0; i < T; i++) {
//            sc.nextLine();
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int prize = 0;
//
//            if (a == 1) {
//                prize += 5000000;
//            } else if (a > 1 && a <= 3) {
//                prize += 3000000;
//            } else if (a > 3 && a <= 6) {
//                prize += 2000000;
//            } else if (a > 6 && a <= 10) {
//                prize += 500000;
//            } else if (a > 10 && a <= 15) {
//                prize += 300000;
//            } else if (a > 15 && a <= 21) {
//                prize += 500000;
//            } else {
//                prize += 0;
//            }
//
//            if (b == 1) {
//                prize += 5120000;
//            } else if (b > 1 && b <= 3) {
//                prize += 2560000;
//            } else if (b > 3 && b <= 7) {
//                prize += 1280000;
//            } else if (b > 7 && b <= 15) {
//                prize += 640000;
//            } else if (b > 15 && b <= 31) {
//                prize += 320000;
//            } else {
//                prize += 0;
//            }
//            System.out.println(prize);
//        }


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < T; i++) {
//            String str = br.readLine();
//            int a = Integer.parseInt(str.split(" ")[0]);
//            int b = Integer.parseInt(str.split(" ")[1]);
//            int prize = 0;
//
//            if (a == 1) {
//                prize += 5000000;
//            } else if (a > 1 && a <= 3) {
//                prize += 3000000;
//            } else if (a > 3 && a <= 6) {
//                prize += 2000000;
//            } else if (a > 6 && a <= 10) {
//                prize += 500000;
//            } else if (a > 10 && a <= 15) {
//                prize += 300000;
//            } else if (a > 15 && a <= 21) {
//                prize += 500000;
//            } else {
//                prize += 0;
//            }
//
//            if (b == 1) {
//                prize += 5120000;
//            } else if (b > 1 && b <= 3) {
//                prize += 2560000;
//            } else if (b > 3 && b <= 7) {
//                prize += 1280000;
//            } else if (b > 7 && b <= 15) {
//                prize += 640000;
//            } else if (b > 15 && b <= 31) {
//                prize += 320000;
//            } else {
//                prize += 0;
//            }
//
//            System.out.println(prize);
//        }

    }
}
