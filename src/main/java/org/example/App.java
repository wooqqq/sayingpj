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

            if (command.equals("종료".trim())) {
                break;
            }
            if (command.equals("등록")) {
                System.out.printf("명언 : ");
            }
        }
    }
}
