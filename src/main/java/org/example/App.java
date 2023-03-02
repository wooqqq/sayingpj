package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        long lastWiseSayingId = 0;
        List<WiseSaying> wiseSayings = new ArrayList<>();

        while (true) {
            System.out.print("명령) ");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                long id = lastWiseSayingId + 1;
                System.out.printf("명언 : ");
                String content = sc.nextLine().trim();
                System.out.printf("작가 : ");
                String authorName = sc.nextLine().trim();

                WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
                wiseSayings.add(wiseSaying);

                // 리스트로 만들어야한다.
                // new ArrayList<>();

                System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                lastWiseSayingId = id; // 증가
            } else if (command.equals("목록")) {
                // System.out.printf("생성된 명언 수 : %d\n", wiseSayings.size());


                System.out.println("번호 / 작가 / 명언");
                System.out.println("-----------------------");
                for (int i = wiseSayings.size() - 1; i >= 0; i--) {
                    System.out.println(wiseSayings.get(i).getId() + " / " + wiseSayings.get(i).getAuthorName() + " / " + wiseSayings.get(i).getContent());
                }
            }
        }

    }
}
