package backjoon;

import java.util.Scanner;

public class B1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] alpha = new int[26];
        String a = sc.next().toUpperCase();

        for (int i = 0; i < a.length(); i++) {
            int Num = a.charAt(i) - 'A';
            alpha[Num]++;
        }
        int max = 0;
        char b = '?';

        for (int i = 0; i < alpha.length; i++) {
            if (max < alpha[i]) {
                max = alpha[i];
                b = (char) (i + 'A');
            } else if (max == alpha[i]) {
                b = '?';
            }
        }
        System.out.println(b);
    }
}
