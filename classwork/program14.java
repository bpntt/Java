package classwork;

import java.util.Scanner;

public class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write h: ");
        String word = sc.nextLine();
        int h = Integer.parseInt(word);
        System.out.println("Write up: ");
        String word1 = sc.nextLine();
        int a = Integer.parseInt(word1);
        System.out.println("Write down: ");
        String word2 = sc.nextLine();
        int b = Integer.parseInt(word2);
        int start = 0;
        int counter = 1;
        while (start + a < h) {
            counter++;
            start = start + a - b;
        }
        System.out.println(counter);
    }

}
