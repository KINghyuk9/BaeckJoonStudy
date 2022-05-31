package backjoon;

import java.util.Scanner;

public class B2577 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();
        int k = a*b*c;
        int arr[] = new int[10];
        while (k>0){
            arr[k%10]++;
            k/=10;
        }
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }

    }
}

