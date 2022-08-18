package backjoon;

import java.util.Scanner;

public class B25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int buy_number = sc.nextInt();

        int PN = 0;

        for(int i=0; i<buy_number; i++){
            int price = sc.nextInt();
            int number = sc.nextInt();
            PN += price*number;
        }
        if(PN == sum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
