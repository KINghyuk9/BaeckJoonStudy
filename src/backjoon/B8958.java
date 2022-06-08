package backjoon;

import java.util.Scanner;

public class B8958 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String A;

        for(int i=0; i<n; i++){
            A = sc.next();
            int count = 0;
            int sum=0;
            for(int j=0; j<A.length(); j++){
                if(A.charAt(j) == 'O'){
                    count++;
                    sum += count;
                }
                else{
                    count = 0;
                }
            }
            System.out.println(sum);
        }

    }
}
