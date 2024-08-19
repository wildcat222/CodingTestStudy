package baekjoon.silver4;

import java.util.Scanner;

public class 괄호9012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextLine();
        }

        label:
        for (int i = 0; i < n; i++) {
            int a = 0;
            for (int j = 0; j < input[i].length(); j++) {
                if (input[i].charAt(j) == '(') {
                    a++;
                } else if (input[i].charAt(j) == ')') {
                    a--;
                }
                if (a < 0) {
                    System.out.println("NO");
                    continue label;
                }
            }
            if (a == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
