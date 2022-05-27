package backjoon;

import java.util.Scanner;

public class B10818 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int Max = arr[0];
        int Min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(Max > arr[i]){
                Max = arr[i];
            }
        }
        System.out.println(Max);
        for(int i=1; i<arr.length; i++) {
            if(Min < arr[i]){
                Min = arr[i];
            }
        }
        System.out.println(Min);
    }
}
