package backjoon;

import java.util.Scanner;

public class B11654 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        int result = code.charAt(0); // charAt : String 타입의 문자열중 한 글자만을 선택해서 char 타입으로 변환

        System.out.println(result);
    }
}
