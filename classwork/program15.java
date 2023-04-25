package classwork;
import java.util.Scanner;
public class program15 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write a: ");
        String word = sc.nextLine();
        int h = Integer.parseInt(word);
        System.out.println("Write b: ");
        String word1 = sc.nextLine();
        int a = Integer.parseInt(word1);
        System.out.println("Write count of peace: ");
        String word2 = sc.nextLine();
        int b = Integer.parseInt(word2);
        int s = a*b;
        if (b<s){
            if (b%a == 0){
                System.out.println("True");}
                if (b%h==0){
                    System.out.println("True");}
                    else{
                        System.out.println("False");}}

        else { System.out.println("False");}
        
    }
}
