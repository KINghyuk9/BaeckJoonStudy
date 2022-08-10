package backjoon;

import java.util.Scanner;

public class B1065 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for(int i=1; i<=num; i++){
            if (i<=99){
                count=+1;
            } else if(i<=999){
                break;
            }
        }
        System.out.println(count); // TODO : 틀림
    }
}
