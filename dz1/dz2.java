package dz1;

import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("x: ");
        String name = sc.nextLine();
        int x = Integer.parseInt(name);
        /* int a = 0; */
        /* int b = x - a; */
        int[] array1;
        array1 = new int[x];
        int i = 0;
        while (i < x) {
            for (int j = 0; j < x; j++) {
                System.out.printf("x: ");
                array1[j] = sc.nextInt();
                i++;
            }
            i++;
        }

        sc.close();
    }
}
