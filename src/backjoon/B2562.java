package backjoon;

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int Max = 0;
        int count = 0;

        for(int i=1; i< arr.length; i++) {
            if(Max < arr[i]) {
                Max = arr[i];
                count = i+1;
            }

        }
        System.out.println(Max);
        System.out.println(count);
    }
}
