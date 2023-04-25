package dz1;
import java.util.Arrays;
import java.util.Scanner;
public class dz1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("x: ");
        String name = sc.nextLine();
        int x = Integer.parseInt(name);
        int [] array1; 
        array1 = new int [x];
        int i = 0;
        int a=0;
        while (i<x){
                for (int j = 0; j < x; j++) {
                    System.out.printf("x: ");
                    array1[j] = sc.nextInt();
                    i++;
                    }
                i++;
        }
         System.out.println(Arrays.toString(array1));
        for (int q = 0; q < array1.length; q++) {
            if (q%2==0){
                a = a+array1[q];
                System.out.println(array1[q]);
            }
            
        }
        System.out.println(a);
        sc.close();
    }
    }
