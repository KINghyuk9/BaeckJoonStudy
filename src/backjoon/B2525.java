package backjoon;

import java.util.Scanner;

public class B2525 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        int C = sc.nextInt();

        int a = 60*H + M ;
        a += C;

        H = (a/60) % 24;
        M = (a%60);

        System.out.println(H + " " + M);

    }
}
