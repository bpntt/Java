package classwork;
import java.util.Scanner;


import java.util.LinkedList;
public class program21 {
    public static void main(String [] Args) {
        LinkedList<String> array1 = new LinkedList<>();
        boolean work = true;
        while (work){
        Scanner sc = new Scanner(System.in);
        System.out.printf("write you text:  ");
        String name = sc.nextLine();
        String [] splitline = name.split("-");
        switch (splitline[0]){
            case "print":
            System.out.println(array1.remove((Integer.parseInt(splitline[1]))));
            break;
            case "exit":
            System.out.println("nice");
            work = false;
            break;
            default:
            array1.add(Integer.parseInt(splitline[1]),splitline[0]);

        }
    }
}
}
