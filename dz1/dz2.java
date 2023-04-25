package dz1;

import java.util.Arrays;
import java.util.Scanner;

import javax.management.Query;

public class dz2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("x: ");
        String name = sc.nextLine();
        int x = Integer.parseInt(name);
        int a = 0;
        int b = x -a;
        int[] array1;
        array1 = new int[x];
        int[] array2;
        array2 = new int[b];
        int i = 0;
        while (i < x) {
            for (int j = 0; j < x; j++) {
                System.out.printf("x: ");
                array1[j] = sc.nextInt();
                i++;
            }
            i++;
        }

        for(int q=0; q<array1.length; q++) {
            for (int j=q+1; j<array1.length; j++) {
               if(array1[q] != array1[j]) {
                  System.out.println(array1[j]);
               }

            sc.close();
        }
    }
}
}
