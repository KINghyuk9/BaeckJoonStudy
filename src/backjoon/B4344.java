package backjoon;

import java.util.Scanner;

public class B4344 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int[] arr;

        for(int i=0; i<C; i++){
            int N = sc.nextInt();
            arr = new int[N];

            double sum = 0;

            for(int j=0; j<N; j++){
                int score = sc.nextInt();
                arr[j] = score;

                sum += score;
            }

            double students = (sum / N);
            double s_count = 0;
            for(int j=0; j<N; j++){
                if(arr[j] > students){
                    s_count++;
                }
            }
            System.out.printf("%.3f%%\n",(s_count/N)*100);
        }

    }
}
