package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int count = 1;
        int sum = 0;

        while (true) {

            if (a <= sum + count) {
                if (count % 2 == 1) {
                    System.out.println((count-(a-sum-1)) + "/" + (a - sum));
                    break;
                }
                else {
                    System.out.println((a - sum) + "/" + (count - (a - sum - 1)));
                    break;
                }
            }else {
                sum += count;
                count++;
            }


        }


    }
}
