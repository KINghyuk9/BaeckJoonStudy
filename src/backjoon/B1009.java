package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder SB = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer ST = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(ST.nextToken());
            int b = Integer.parseInt(ST.nextToken());

            if (a % 10 == 0) {
                SB.append(10 + "\n");
                continue;
            }
            int n = a % 10;
            for (int j = 1; j < b; j++) {
                n = (n*a)%10;
            }
            SB.append(n + "\n");
        }
        System.out.println(SB);
    }
}
