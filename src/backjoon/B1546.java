package backjoon;

import java.util.Scanner;

public class B1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        float avg = 0;
        float max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            avg += (arr[i]/max*100)/n;
        }
        System.out.println(avg);
    }
}
