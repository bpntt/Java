package classwork;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class program26 {
    public static void name(String[] Args) {
        Queue<String> stack = new LinkedList();
        boolean work = true;
        while (work) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("write you text:  ");
            String name = sc.nextLine();
            String[] splitline = name.split(",");
            switch (splitline[0]) {
                case "print":
                    System.out.println(splitline);
                    break;
                case "exit":
                    System.out.println("nice");
                    work = false;
                    break;
                default:
                    stack.add(name);
                    sc.close();
            }
        }
    }
}