package backjoon;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int Max = arr[0];
        int cont = 0;

        for(int i = 0; i < arr.length; i++) {
            if(Max < arr[i]) {
                Max = arr[i];
                cont = i+1;
            }
            System.out.println(Max);
            System.out.println(cont);
        }

    }
}
