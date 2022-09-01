package backjoon;

import java.util.Scanner;

public class B2083 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String Nm = sc.next();
            int Age = sc.nextInt();
            int Weight = sc.nextInt();

            if(Nm.equals("#") && Age == 0 && Weight == 0){
                break;
            }

            if(Age > 17 || Weight >= 80){
                System.out.println(Nm +" "+ "Senior");
            }else {
                System.out.println(Nm +" "+ "Junior");
            }
        }

    }
}
