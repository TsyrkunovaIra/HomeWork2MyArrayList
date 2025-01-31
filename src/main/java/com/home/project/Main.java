package com.home.project;

import java.util.Scanner;
import java.util.concurrent.Executor;

public abstract class Main {
        public static void main(String[] args) {
            int x, y;
            String op;
            int result;

            Scanner scanner = new Scanner(System.in);
            x = scanner.nextInt();
            scanner.skip("\\s*");
            op = scanner.next();
            y = scanner.nextInt();

            if (op.equals("+")) {
                result = x + y;
                System.out.println(result);
            } else if (op.equals("-")) {
                result = x - y;
                System.out.println(result);
            } else if (op.trim().isEmpty()) {
                result = 0;
                System.out.println(result);
            }
        }
}