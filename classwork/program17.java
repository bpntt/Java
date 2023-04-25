package classwork;

import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("x: ");
        String name = sc.nextLine();
        double x = Double.parseDouble(name);
        System.out.printf("y: ");
        String name1 = sc.nextLine();
        double y = Double.parseDouble(name1);
        double a = x * 0.1;
        double b = 0;
        double i = 0;
        while (y > 0) {
            y = y - x - b;
            b = b + a;
            i++;
            System.out.println(y);
        }
        System.out.println(i);
        sc.close();
    }

}
