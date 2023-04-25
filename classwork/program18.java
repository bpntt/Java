package classwork;

import java.util.Scanner;

public class program18 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("x: ");
        String name = sc.nextLine();
        double x = Double.parseDouble(name);
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
            System.out.println(result);
        }
        sc.close();
}
    
}
