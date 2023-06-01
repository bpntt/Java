package dz4;

import java.util.LinkedList;

public class program2 {
    public static void main(String [] args) {
        
    
    LinkedList<Integer> array1 = new LinkedList<>();
    for(int i = 0;i<10;i++)
    {
        enqueue(array1, Random()); 
    }
    System.out.println(array1);

    System.out.println(dequeue(array1)); 
    System.out.println(array1);

    System.out.println(first(array1)); 
    System.out.println(array1); 
}

    public static void enqueue(LinkedList<Integer> ll, int num) {
        ll.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> ll) {
        int num = ll.get(0);
        ll.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ll) { 
        int num = ll.get(0);
        return num;
    }

    public static int Random() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
