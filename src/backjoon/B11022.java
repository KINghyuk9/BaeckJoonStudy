package backjoon;

import java.util.Scanner;

public class B11022 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int hap = 0;

        for(int i=1; i<=T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            hap = A+B;
            System.out.println("Case #" +i+": "+ A + " + " + B + " = " + hap);
        }
    }
}
