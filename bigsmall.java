package cn.itcast.day07basic;

import java.util.Scanner;

public class bigsmall {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("put frist number");
        int a = num.nextInt();
        System.out.println("put seconed number");
        int b = num.nextInt();
        System.out.println("put third number");
        int c = num.nextInt();

        int temp = a > b ? a :b;
        int max = temp > c ? temp : c;
        System.out.println("result:"+max);



    }


}
