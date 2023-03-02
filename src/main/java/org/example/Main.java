package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order;
        String saying;
        String writer;
        String order2;

        System.out.println("== 명언 앱 ==");
        System.out.printf("명령) ");
        order = sc.nextLine();

        System.out.printf("명언 : ");
        saying = sc.nextLine();
        System.out.printf("작가 : ");
        writer = sc.nextLine();
        System.out.println("1번 명언이 등록되었습니다.");

        System.out.printf("명령) ");
        order2 = sc.nextLine();
    }
}