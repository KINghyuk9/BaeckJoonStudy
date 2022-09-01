package backjoon;

import java.util.Scanner;

public class B2845 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int P = sc.nextInt();

        int S = L*P;
        for(int i=0; i<5; i++){
            int Pn = sc.nextInt();
            Pn = Pn-S;
            System.out.print(Pn + " ");
        }
    }
}
