package classwork;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;



public class program24 {
    public static void main(String [] Args) {
        LinkedList<String> array1 = new LinkedList<>();
        boolean work = true;
        while (work){
        Scanner sc = new Scanner(System.in);
        System.out.printf("write you text:  ");
        String name = sc.nextLine();
        switch (name){
            case "print":
            ListIterator<String> iterator= array1.listIterator(array1.size());
            while (iterator.hasPrevious()){
                System.out.println(iterator.previous());
            }
            break;
            case "exit":
            System.out.println("nice");
            work = false;
            case "revert":
            array1.removeLast();
            break;
            default:
            array1.add(name);
            sc.close(); 

        }
    }
}
}
