package dz4;

import java.util.LinkedList;

public class program1 {

    public static void main(String[] args) {
        LinkedList<Integer> array1 = new LinkedList<>();
        LinkedList<Integer> array2 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            array1.add(Random());
        }
        System.out.println(array1);

        for (int i = 0; i < 10; i++) {
            array2.add(array1.getLast());
            array1.removeLast();
        }
        System.out.println(array2);
    }

    public static int Random() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

}