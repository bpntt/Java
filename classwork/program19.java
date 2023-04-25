package classwork;
import java.util.Scanner;
public class program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("x: ");
        String name = sc.nextLine();
        double x = Double.parseDouble(name);
        System.out.printf("y: ");
        String name1 = sc.nextLine();
        double y = Double.parseDouble(name1);
        System.out.printf("z: ");
        String name2 = sc.nextLine();
        double z = Double.parseDouble(name2);
        double a = x;
        while (a > y){
            a = a-z;
            if(a <0){
                break;
            }
            System.out.println(a);
        }
        sc.close();
    }
}
