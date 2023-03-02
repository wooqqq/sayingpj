package org.example;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 ==");

        while (true) {
            System.out.printf("명령) ");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            }
            else if (command.equals("등록")) {
                System.out.printf("명언 : ");
                String content = sc.nextLine().trim();
                System.out.printf("작가 : ");
                String authorName = sc.nextLine().trim();
            }
        }

    }
}
