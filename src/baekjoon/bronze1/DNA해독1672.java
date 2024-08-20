package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DNA해독1672 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] dna = br.readLine().toCharArray();

        for(int i = N - 1; i > 0; i--) {
            if(dna[i] == 'A') {
                if(dna[i - 1] == 'A') {
                    dna[i - 1] = 'A';
                } else if (dna[i - 1] == 'G') {
                    dna[i - 1] = 'C';
                } else if (dna[i - 1] == 'C') {
                    dna[i - 1] = 'A';
                } else {
                    dna[i - 1] = 'G';
                }
            }

            if(dna[i] == 'G') {
                if(dna[i - 1] == 'A') {
                    dna[i - 1] = 'C';
                } else if (dna[i - 1] == 'G') {
                    dna[i - 1] = 'G';
                } else if (dna[i - 1] == 'C') {
                    dna[i - 1] = 'T';
                } else {
                    dna[i - 1] = 'A';
                }
            }

            if(dna[i] == 'C') {
                if(dna[i - 1] == 'A') {
                    dna[i - 1] = 'A';
                } else if (dna[i - 1] == 'G') {
                    dna[i - 1] = 'T';
                } else if (dna[i - 1] == 'C') {
                    dna[i - 1] = 'C';
                } else {
                    dna[i - 1] = 'G';
                }
            }

            if(dna[i] == 'T') {
                if(dna[i - 1] == 'A') {
                    dna[i - 1] = 'G';
                } else if (dna[i - 1] == 'G') {
                    dna[i - 1] = 'A';
                } else if (dna[i - 1] == 'C') {
                    dna[i - 1] = 'G';
                } else {
                    dna[i - 1] = 'T';
                }
            }
        }
        System.out.println(dna[0]);

    }
}
