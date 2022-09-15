package backjoon;

import java.util.Scanner;

public class B1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []  arr = new int[5];
        int count = 0;
        int value = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        while (true) {
            for (int j = 0; j < 5; j++) {
                if (value % arr[j] == 0) {
                    count++;
                }
            }
            if(count>=3){
                System.out.println(value);
                return;
            }
            count = 0;
            value++;
        }

    }
}
