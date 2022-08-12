package backjoon;

import java.util.Scanner;

public class B2884 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M < 45){
            H--;
            M = 60 - (45 - M);
            if(H < 0){
                H = 23;
            }
            System.out.println(H + " " + M);
        }else {
            System.out.println(H + " " + (M-45));
        }

        /*
        H는 1~12까지
        M은 00~59까지
        입력된 시간에서 -45분
        */
    }

}
