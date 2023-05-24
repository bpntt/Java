package classwork;
import java.util.Scanner;
import java.util.Stack;

public class program25 {
    public static void name(String [] Args) {
        Stack<String> stack = new Stack<String>();
        boolean work = true;
        while (work){
        Scanner sc = new Scanner(System.in);
        System.out.printf("write you text:  ");
        String name = sc.nextLine();
        String [] splitline = name.split(",");
        switch (splitline[0]){
            case "print":
            System.out.println(stack);
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
    }}