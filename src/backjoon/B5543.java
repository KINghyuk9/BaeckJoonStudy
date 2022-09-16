package backjoon;

import java.util.Scanner;

public class B5543 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int buger = arr[0];
        int drink = arr[3];
        for (int i = 0; i < 3; i++) {
            if (buger > arr[i]) {
                buger = arr[i];
            }
        }
        for (int i = 3; i < 5; i++) {
            if (drink > arr[i]) {
                drink = arr[i];
            }
        }
        System.out.println(buger+drink-50);
    }
}
