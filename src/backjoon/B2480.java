package backjoon;

import java.util.Scanner;

public class B2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 0;
        if(a == b && b == c && a==c){
            System.out.println(10000+(a*1000));
        }else if(a==b && a!=c && b!=c){
            System.out.println(1000+(a*100));
        }else if(a==c && a!=b && b!=c){
            System.out.println(1000+(a*100));
        }else if(b==c && a!=b && a!=c){
            System.out.println(1000+(b*100));
        } else if(a != b && b != c && a!=c){
            if(a>b && a>c){
                d=a;
            }else if(b>a && b>c){
                d=b;
            }else if(c>a && c>b){
                d=c;
            }
            System.out.println(d*100);
        }

    }
}
